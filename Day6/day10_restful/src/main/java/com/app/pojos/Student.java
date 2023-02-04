package com.app.pojos;

public class Student {
	private int rollNo;
	private String name;
	private String Course ;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public Student(int rollNo, String name, String course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		Course = course;
	}
}
