package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// anotation used to define entity bean class

@Entity

//annotation used to define table
@Table
public class Employee {

	//annotaion used to define primary key in corresponding table
	@Id
	//annotation used to genrate id automatic 
	@GeneratedValue(strategy = GenerationType.AUTO)
 	private int eid;
 	private String ename;
 	private double salary;
 	
 	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
 	
 	
	
}
