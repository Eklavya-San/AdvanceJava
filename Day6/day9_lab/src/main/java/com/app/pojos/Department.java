package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name="depts")
public class Department extends BaseEntity{
	@Column(name="dept_name",length=20)
	private String deptName;
	@Column(length=20)
	private String location;
	
	
	
	public Department() {
		
	}
	
	public Department(String deptName, String location) {
		super();
		this.deptName = deptName;
		this.location = location;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", location=" + location + "]";
	}
	

	
}
