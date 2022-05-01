package com.wuele8.swagger.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuele8.swagger.model.Student;
import com.wuele8.swagger.repository.StudentRepository;



@Service
public class StudentServiceimplements implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository; 
	
	List<Student> list;
      public StudentServiceimplements() {
    	  list=new ArrayList<>();
    	  list.add(new Student(2014,"praveen","mechanical"));
    	  list.add(new Student(2015,"naveen","computer science"));
    	  
      }
	@Override
	public List<Student> getstudents() {
		
		return list;
	}
	@Override
	public Student getstudentsById(int studentid) {
	
		return null;
	}
	@Override
	public void saveOrUpdate(Student student) {
	 //we need to save details in database
		studentRepository.save(student);
		
	}
	@Override
	public List<Student> getAllStudents(){
		List<Student> list = studentRepository.getAllRows();
		return list;
//		return studentRepository.getAllRows();
	}
	@Override
	public List<Student> getAllStudentsFromSheet() {
		List<Student> listStudents = new ArrayList<>();
		try {

			String excelFilePath = "C:\\Users\\User\\Downloads\\students(5).xlsx";
			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

			Workbook workbook = new XSSFWorkbook(inputStream);
			Sheet sheet = workbook.getSheetAt(0);
			Iterator<Row> iterator = sheet.iterator();

			while (iterator.hasNext()) {
				Row row = iterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				Student student = new Student();

				while (cellIterator.hasNext()) {
					Cell nextCell = cellIterator.next();
					int columnIndex = nextCell.getColumnIndex();

					switch (columnIndex) {
					case 1:
						student.setId(Integer.parseInt(getCellValue(nextCell)));
						break;
					case 2:
						student.setName((String) getCellValue(nextCell));
						break;
					case 3:
						student.setDepartment((String) getCellValue(nextCell));
						break;
					}

					listStudents.add(student);

				}

				workbook.close();
				inputStream.close();
				return listStudents;

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listStudents;

	}

	private String getCellValue(Cell nextCell) {
		// TODO Auto-generated method stub
		return null;
	}
}


	
	


