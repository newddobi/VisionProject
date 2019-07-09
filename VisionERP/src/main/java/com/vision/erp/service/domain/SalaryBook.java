package com.vision.erp.service.domain;

public class SalaryBook {

	public SalaryBook() {
		super();
	}
	
	private String salaryDate;
	private String salaryBookName;
	private String totalSalary;
	
	public String getSalaryDate() {
		return salaryDate;
	}
	public void setSalaryDate(String salaryDate) {
		this.salaryDate = salaryDate;
	}
	public String getSalaryBookName() {
		return salaryBookName;
	}
	public void setSalaryBookName(String salaryBookName) {
		this.salaryBookName = salaryBookName;
	}
	public String getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(String totalSalary) {
		this.totalSalary = totalSalary;
	}
	@Override
	public String toString() {
		return "SalaryBook [salaryDate=" + salaryDate + ", salaryBookName=" + salaryBookName + ", totalSalary="
				+ totalSalary + "]";
	}
	
}
