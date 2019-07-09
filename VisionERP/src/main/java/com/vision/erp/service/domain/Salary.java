package com.vision.erp.service.domain;

public class Salary {

	public Salary() {
		super();
	}
	
	private String salaryNumbering;
	private String salaryDate;
	private String employeeNo;
	private String individualTotalSalary;
	private String salaryStatusCodeNo;
	private String salaryStatusCodeName;
	private String wage;
	private String totalRegularWorkTime;
	private String totalExtendWorkTime;
	public String getSalaryNumbering() {
		return salaryNumbering;
	}
	public void setSalaryNumbering(String salaryNumbering) {
		this.salaryNumbering = salaryNumbering;
	}
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
	public String getTotalRegularWorkTime() {
		return totalRegularWorkTime;
	}
	public void setTotalRegularWorkTime(String totalRegularWorkTime) {
		this.totalRegularWorkTime = totalRegularWorkTime;
	}
	public String getTotalExtendWorkTime() {
		return totalExtendWorkTime;
	}
	public void setTotalExtendWorkTime(String totalExtendWorkTime) {
		this.totalExtendWorkTime = totalExtendWorkTime;
	}
	
	
	@Override
	public String toString() {
		return "Salary [salaryNumbering=" + salaryNumbering + ", salaryDate=" + salaryDate + ", employeeNo="
				+ employeeNo + ", individualTotalSalary=" + individualTotalSalary + ", salaryStatusCodeNo="
				+ salaryStatusCodeNo + ", salaryStatusCodeName=" + salaryStatusCodeName + ", wage=" + wage
				+ ", totalRegularWorkTime=" + totalRegularWorkTime + ", totalExtendWorkTime=" + totalExtendWorkTime
				+ "]";
	}
	
}
