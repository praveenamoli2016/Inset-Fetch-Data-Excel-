package com.wuele8.swagger.utility;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.wuele8.swagger.model.User;
import com.wuele8.swagger.service.SearchOperation;
import com.wuele8.swagger.service.SpecSearchCriteria;
import com.wuele8.swagger.service.UserSpecification;
public final class UserSpecificationsBuilder {

    private final List<SpecSearchCriteria> params;

    public UserSpecificationsBuilder() {
        params = new ArrayList<>();
    }

    // API

    public final UserSpecificationsBuilder with(final String key, final String operation, final Object value, final String prefix, final String suffix) {
        return with(null, key, operation, value, prefix, suffix);
    }

    public final UserSpecificationsBuilder with(final String orPredicate, final String key, final String operation, final Object value, final String prefix, final String suffix) {
        SearchOperation op = SearchOperation.getSimpleOperation(operation.charAt(0));
        if (op != null) {
            if (op == SearchOperation.EQUALITY) { // the operation may be complex operation
                final boolean startWithAsterisk = prefix != null && prefix.contains(SearchOperation.ZERO_OR_MORE_REGEX);
                final boolean endWithAsterisk = suffix != null && suffix.contains(SearchOperation.ZERO_OR_MORE_REGEX);

                if (startWithAsterisk && endWithAsterisk) {
                    op = SearchOperation.CONTAINS;
                } else if (startWithAsterisk) {
                    op = SearchOperation.ENDS_WITH;
                } else if (endWithAsterisk) {
                    op = SearchOperation.STARTS_WITH;
                }
            } 
            params.add(new SpecSearchCriteria(orPredicate, key, op, value));
        } 
        return this;
    }

    public Specification<User> build() {
        if (params.size() == 0)
            return null;

        Specification<User> result = new UserSpecification(params.get(0));
     
        for (int i = 1; i < params.size(); i++) {
            result = params.get(i).isOrPredicate()
              ? Specification.where(result).or(new UserSpecification(params.get(i))) 
              : Specification.where(result).and(new UserSpecification(params.get(i)));
        }
        
        return result;
    }

    public final UserSpecificationsBuilder with(UserSpecification spec) {
        params.add(spec.getCriteria());
        return this;
    }

    public final UserSpecificationsBuilder with(SpecSearchCriteria criteria) {
        params.add(criteria);
        return this;
    }
}