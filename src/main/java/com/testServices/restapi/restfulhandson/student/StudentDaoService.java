package com.testServices.restapi.restfulhandson.student;

import java.util.ArrayList;

import java.util.Date;

import java.util.Iterator;



import org.springframework.stereotype.Component;



@Component

public class StudentDaoService {

	private static int studentCount = 5;

	private static ArrayList<Student> devOpsClass = new ArrayList<Student>();

	

	public StudentDaoService() {

		devOpsClass.add(new Student("Long",111,1,"CSU",new Date()));

		devOpsClass.add(new Student("Harkirat",134,2,"CSU",new Date()));

		devOpsClass.add(new Student("Feng",131,3,"CSU",new Date()));

		devOpsClass.add(new Student("Long",144,4,"CSU",new Date()));

		devOpsClass.add(new Student("Long",031,5,"CSU",new Date()));

	}



	public ArrayList<Student> displayStudent(){

		return devOpsClass;

	}
	public Student addStudent(Student std) {
		devOpsClass.add(std);
		return std;
	}

	

	

	

	

}