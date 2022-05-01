package com.wuele8.swagger.controller;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Joiner;
import com.wuele8.swagger.model.User;
import com.wuele8.swagger.repository.UserRepository;
import com.wuele8.swagger.service.SearchOperation;
import com.wuele8.swagger.utility.UserSpecificationsBuilder;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/")
public class UserController {

	@Autowired
    private UserRepository repo;

	@GetMapping("/users")
	@ApiOperation(value="it will fetch all courses")
	@ResponseBody
	public List<User> findAllByOrPredicate(@RequestParam String search) {
	    Specification<User> spec = resolveSpecification(search);
	    return repo.findAll(spec);
	}

	protected Specification<User> resolveSpecification(String searchParameters) {
	    UserSpecificationsBuilder builder = new UserSpecificationsBuilder();
	    String operationSetExper = Joiner.on("|")
	      .join(SearchOperation.SIMPLE_OPERATION_SET);
	    Pattern pattern = Pattern.compile(
	      "(\\p{Punct}?)(\\w+?)("
	      + operationSetExper 
	      + ")(\\p{Punct}?)(\\w+?)(\\p{Punct}?),");
	    Matcher matcher = pattern.matcher(searchParameters + ",");
	    while (matcher.find()) {
	        builder.with(matcher.group(1), matcher.group(2), matcher.group(3), 
	        matcher.group(5), matcher.group(4), matcher.group(6));
	    }
	    
	    return builder.build();
	}
}

