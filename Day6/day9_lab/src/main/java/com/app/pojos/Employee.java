package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="emps_tbls")
public class Employee extends BaseEntity{
	@Column(name="first_name",length=20)
	private String firstName;
	@Column(name="last_name",length=20)
	private String lastName;
	@Column(length=100)
	private String address;
	private double salary;
	@Column(name="join_date")
	private LocalDate joinDate;

	@ManyToOne
	@JoinColumn(name="dept_id")
	private Department myDepartment;
	
	
	public Employee() {
		
	}
	public Employee(String firstName, String lastName, String address, double salary, LocalDate joinDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.salary = salary;
		this.joinDate = joinDate;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	public Department getMyDepartment() {
		return myDepartment;
	}
	public void setMyDepartment(Department myDepartment) {
		this.myDepartment = myDepartment;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", salary="
				+ salary + ", joinDate=" + joinDate + "]";
	}
	

}
