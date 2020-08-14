package com.EW.mod;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmpWork")
public class EmpWork {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Employee_Id ;
	
	private String Last_Name ;
	private String First_Name; 
	private String Middle_Name; 
	private Integer Manager_Id;
	private  Date Hire_Date;
	private Integer Salary;
	private EmpStatus status;
	public EmpWork(Integer employee_Id, String last_Name, String first_Name, String middle_Name, Integer manager_Id,
			Date hire_Date, Integer salary, EmpStatus status) {
		super();
		Employee_Id = employee_Id;
		Last_Name = last_Name;
		First_Name = first_Name;
		Middle_Name = middle_Name;
		Manager_Id = manager_Id;
		Hire_Date = hire_Date;
		Salary = salary;
		this.status = status;
	}
	public EmpWork() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getEmployee_Id() {
		return Employee_Id;
	}
	public void setEmployee_Id(Integer employee_Id) {
		Employee_Id = employee_Id;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getMiddle_Name() {
		return Middle_Name;
	}
	public void setMiddle_Name(String middle_Name) {
		Middle_Name = middle_Name;
	}
	public Integer getManager_Id() {
		return Manager_Id;
	}
	public void setManager_Id(Integer manager_Id) {
		Manager_Id = manager_Id;
	}
	public Date getHire_Date() {
		return Hire_Date;
	}
	public void setHire_Date(Date hire_Date) {
		Hire_Date = hire_Date;
	}
	public Integer getSalary() {
		return Salary;
	}
	public void setSalary(Integer salary) {
		Salary = salary;
	}
	public EmpStatus getStatus() {
		return status;
	}
	public void setStatus(EmpStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "EmpWork [Employee_Id=" + Employee_Id + ", Last_Name=" + Last_Name + ", First_Name=" + First_Name
				+ ", Middle_Name=" + Middle_Name + ", Manager_Id=" + Manager_Id + ", Hire_Date=" + Hire_Date
				+ ", Salary=" + Salary + ", status=" + status + "]";
	}
	
	
	
	

	
	
	
	

}
