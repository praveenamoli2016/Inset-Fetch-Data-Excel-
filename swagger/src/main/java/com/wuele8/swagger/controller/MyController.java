package com.wuele8.swagger.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wuele8.swagger.model.ExcelFileExporter;
import com.wuele8.swagger.model.Student;
import com.wuele8.swagger.service.StudentService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/")
public class MyController {

	@Autowired
	private StudentService studentservice;

	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}

	// get the students
	@GetMapping("/students")
	public List<Student> getStudents() {

		return this.studentservice.getstudents();

	}

	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents() {

		return this.studentservice.getAllStudents();

	}

	// creating a get mapping that retrieves the detail of a specific student
	// this is an API
	@GetMapping("/students/{studentid}")
	public Student getstudents(@PathVariable("studentid") int studentid) {
		return studentservice.getstudentsById(studentid);
	}

	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student student) {
		studentservice.saveOrUpdate(student);
		return student;
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/returnallrowinExcelFile")
	public void downloadExcelFile(HttpServletResponse response) throws IOException {
		List<Student> students = studentservice.getAllStudents();
		ByteArrayInputStream byteArrayInputStream = ExcelFileExporter.studentListToExcelFile(students);
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment; filename=students.xlsx");
		IOUtils.copy(byteArrayInputStream, response.getOutputStream());
	}
	@GetMapping("/tofetchdatafromExcelFile")
	public List<Student> readStudentsFromExcelFile() throws IOException {
		List<Student> students = studentservice.getAllStudentsFromSheet();
		   return students;
		    
	}


   
}
