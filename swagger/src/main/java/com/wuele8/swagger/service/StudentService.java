package com.wuele8.swagger.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.wuele8.swagger.model.Student;


public interface StudentService {
	public List<Student>getstudents();

	public Student getstudentsById(int studentid);

	public void saveOrUpdate(Student student);

	public List<Student> getAllStudents();

	public List<Student> getAllStudentsFromSheet();
	

}
