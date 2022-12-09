package com.codemind.HibernateProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="employee_details")
public class Employee {
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empfname=" + empfname + ", emplname=" + emplname + ", empemail=" + empemail
				+ ", mobileno=" + mobileno + ", salary=" + salary + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String empfname, String emplname, String empemail, String mobileno, String salary) {
		super();
		this.id = id;
		this.empfname = empfname;
		this.emplname = emplname;
		this.empemail = empemail;
		this.mobileno = mobileno;
		this.salary = salary;
	}
	@Column
	private String empfname;
	@Column
	private String emplname;
	@Column
	private String empemail;
	@Column
	private String mobileno;
	@Column
	private String salary;
	public int getId() {
		return id;
	}
	public void setId( int id) {
		this.id = id;
	}
	public String getEmpfname() {
		return empfname;
	}
	public void setEmpfname(String empfname) {
		this.empfname = empfname;
	}
	public String getEmplname() {
		return emplname;
	}
	public void setEmplname(String emplname) {
		this.emplname = emplname;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

}
