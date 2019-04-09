package com.testServices.restapi.restfulhandson.student;

import java.util.Date;

public class Student {
	private int ID;
	private int SSN;
	
	private String university;
	private Date date;
	
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	private String name;
	public Student(String name, int sSN, int iD, String university, Date date) {
		super();
		this.name = name;
		SSN = sSN;
		ID = iD;
		this.university = university;
		this.date = date;
	}
	

}


