package com.testServices.restapi.restfulhandson.student;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DevOpsStudent {

		@Id
		@GeneratedValue

		private Integer StudentID;
		private String StudentName;
		private String university;
		private Date Joiningdate;
		
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



}
