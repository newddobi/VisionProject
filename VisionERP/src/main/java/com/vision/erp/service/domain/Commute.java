package com.vision.erp.service.domain;

public class Commute {
	//field
	private String employeeNo;
	private String goToWorkTime;
	private String leaveWorkTime;
	private String commuteDate;
	
	//constructor
	public Commute() {
		super();
		// TODO Auto-generated constructor stub
	}

	//getter, setter
	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getGoToWorkTime() {
		return goToWorkTime;
	}

	public void setGoToWorkTime(String goToWorkTime) {
		this.goToWorkTime = goToWorkTime;
	}

	public String getLeaveWorkTime() {
		return leaveWorkTime;
	}

	public void setLeaveWorkTime(String leaveWorkTime) {
		this.leaveWorkTime = leaveWorkTime;
	}

	public String getCommuteDate() {
		return commuteDate;
	}

	public void setCommuteDate(String commuteDate) {
		this.commuteDate = commuteDate;
	}

	
	//toString
	@Override
	public String toString() {
		return "Commute [employeeNo=" + employeeNo + ", goToWorkTime=" + goToWorkTime + ", leaveWorkTime="
				+ leaveWorkTime + ", commuteDate=" + commuteDate + "]";
	}

	
}
