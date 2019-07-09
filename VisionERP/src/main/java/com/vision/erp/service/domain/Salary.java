package com.vision.erp.service.domain;

public class Salary {

	//constructor
	public Salary() {
		super();
	}
	
	//field
	private String salaryDate;
	private String employeeNo;
	private String individualTotalSalary;
	private String salaryStatusCodeNo;
	private String salaryStatusCodeName;
	private String wage;
	private String regularWorkTime;
	private String extendWorkTime;
	
	//getter, setter
	public String getSalaryDate() {
		return salaryDate;
	}
	public void setSalaryDate(String salaryDate) {
		this.salaryDate = salaryDate;
	}
	public String getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getIndividualTotalSalary() {
		return individualTotalSalary;
	}
	public void setIndividualTotalSalary(String individualTotalSalary) {
		this.individualTotalSalary = individualTotalSalary;
	}
	public String getSalaryStatusCodeNo() {
		return salaryStatusCodeNo;
	}
	public void setSalaryStatusCodeNo(String salaryStatusCodeNo) {
		this.salaryStatusCodeNo = salaryStatusCodeNo;
	}
	public String getSalaryStatusCodeName() {
		return salaryStatusCodeName;
	}
	public void setSalaryStatusCodeName(String salaryStatusCodeName) {
		this.salaryStatusCodeName = salaryStatusCodeName;
	}
	public String getWage() {
		return wage;
	}
	public void setWage(String wage) {
		this.wage = wage;
	}
	public String getRegularWorkTime() {
		return regularWorkTime;
	}
	public void setRegularWorkTime(String regularWorkTime) {
		this.regularWorkTime = regularWorkTime;
	}
	public String getExtendWorkTime() {
		return extendWorkTime;
	}
	public void setExtendWorkTime(String extendWorkTime) {
		this.extendWorkTime = extendWorkTime;
	}
	
	//toString
	@Override
	public String toString() {
		return "Salary [salaryDate=" + salaryDate + ", employeeNo=" + employeeNo + ", individualTotalSalary="
				+ individualTotalSalary + ", salaryStatusCodeNo=" + salaryStatusCodeNo + ", salaryStatusCodeName="
				+ salaryStatusCodeName + ", wage=" + wage + ", regularWorkTime=" + regularWorkTime + ", extendWorkTime="
				+ extendWorkTime + "]";
	}

	
}
