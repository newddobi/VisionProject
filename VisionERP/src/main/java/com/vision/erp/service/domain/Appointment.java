package com.vision.erp.service.domain;

public class Appointment {
	//field
	private String appointDate;
	private String employeeNo;
	private String employeeName;
	private String preDepartCodeNo;
	private String preDepartCodeName;
	private String appointDepartCodeNo;
	private String appointDepartCodeName;
	private String preRankCodeNo;
	private String preRankCodeName;
	private String appointRankCodeNo;
	private String appointRankCodeName;
	private String reference;
	
	//constructor
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	//getter, setter
	
	public String getAppointDate() {
		return appointDate;
	}

	public void setAppointDate(String appointDate) {
		this.appointDate = appointDate;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPreDepartCodeNo() {
		return preDepartCodeNo;
	}

	public void setPreDepartCodeNo(String preDepartCodeNo) {
		this.preDepartCodeNo = preDepartCodeNo;
	}

	public String getPreDepartCodeName() {
		return preDepartCodeName;
	}

	public void setPreDepartCodeName(String preDepartCodeName) {
		this.preDepartCodeName = preDepartCodeName;
	}

	public String getAppointDepartCodeNo() {
		return appointDepartCodeNo;
	}

	public void setAppointDepartCodeNo(String appointDepartCodeNo) {
		this.appointDepartCodeNo = appointDepartCodeNo;
	}

	public String getAppointDepartCodeName() {
		return appointDepartCodeName;
	}

	public void setAppointDepartCodeName(String appointDepartCodeName) {
		this.appointDepartCodeName = appointDepartCodeName;
	}

	public String getPreRankCodeNo() {
		return preRankCodeNo;
	}

	public void setPreRankCodeNo(String preRankCodeNo) {
		this.preRankCodeNo = preRankCodeNo;
	}

	public String getPreRankCodeName() {
		return preRankCodeName;
	}

	public void setPreRankCodeName(String preRankCodeName) {
		this.preRankCodeName = preRankCodeName;
	}

	public String getAppointRankCodeNo() {
		return appointRankCodeNo;
	}

	public void setAppointRankCodeNo(String appointRankCodeNo) {
		this.appointRankCodeNo = appointRankCodeNo;
	}

	public String getAppointRankCodeName() {
		return appointRankCodeName;
	}

	public void setAppointRankCodeName(String appointRankCodeName) {
		this.appointRankCodeName = appointRankCodeName;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
	
	//toString
	@Override
	public String toString() {
		return "Appointment [appointDate=" + appointDate + ", employeeNo=" + employeeNo + ", employeeName="
				+ employeeName + ", preDepartCodeNo=" + preDepartCodeNo + ", preDepartCodeName=" + preDepartCodeName
				+ ", appointDepartCodeNo=" + appointDepartCodeNo + ", appointDepartCodeName=" + appointDepartCodeName
				+ ", preRankCodeNo=" + preRankCodeNo + ", preRankCodeName=" + preRankCodeName + ", appointRankCodeNo="
				+ appointRankCodeNo + ", appointRankCodeName=" + appointRankCodeName + ", reference=" + reference + "]";
	}

	

}
