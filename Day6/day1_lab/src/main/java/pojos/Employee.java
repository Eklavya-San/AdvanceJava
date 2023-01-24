package pojos;
import javax.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="emps")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="empID")
	private Long empID;
	@Column(name="first_name",length=20)
	private String firstName;
	@Column(name="last_name",length=20)
	private String lastName;
	@Enumerated(EnumType.STRING)
	@Column(name="dept",length=20)
	private Department dept;
	@Column(name="salary")
	private double salary;
	@Column(name="dob")
	private LocalDate dob;
	@Column(name="isPermanent")
	private boolean isPermanent;
	public Employee(String firstName, String lastName, Department dept, double salary, LocalDate dob,
			boolean isPermanent) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
		this.salary = salary;
		this.dob = dob;
		this.isPermanent = isPermanent;
	}
	public Long getEmpID() {
		return empID;
	}
	public void setEmpID(Long empID) {
		this.empID = empID;
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
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public boolean isPermanent() {
		return isPermanent;
	}
	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", firstName=" + firstName + ", lastName=" + lastName + ", dept=" + dept
				+ ", salary=" + salary + ", dob=" + dob + ", isPermanent=" + isPermanent + "]";
	}
	
}
