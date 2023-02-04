package com.app.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="employee")
public class Employee {
	@Column (name="first_name", length = 20)
	private String firstName;
	@Column (name="last_name",length=20)
	private String lastName;
	@Column (name="email", length=50 , unique =true)
	private String email ;
	@Column(name="sex")
	private char sex;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name="birthdate")
	private Date dob;
	@Column(name="salary")
	private double salary;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="branch_id")
	private Branch branchId;
	public Employee(String firstName, String lastName, char sex, Date dob, double salary ,String email) {
		super();
		this.email= email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.dob = dob;
		this.salary = salary;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName +"email ="+email+ ", sex=" + sex + ", dob=" + dob
				+ ", salary=" + salary + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
