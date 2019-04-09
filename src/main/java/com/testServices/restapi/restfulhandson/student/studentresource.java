package com.testServices.restapi.restfulhandson.student;


import java.util.ArrayList;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class studentresource {
	
	@Autowired

	private StudentDaoService service;

	@GetMapping("/getAllStudents")

	public ArrayList<Student> displayStudent(){

		return service.displayStudent();

	}
	@PostMapping("/addStudent")

	public Student addStudent(@RequestBody Student std) {

		service.addStudent(std);

		return std;

		

	}

	

	
	
	

}
