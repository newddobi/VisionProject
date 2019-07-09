package com.vision.erp.service.domain;

public class WorkAttitudeCode {
	//field
	private String workAttitudeCodeNo;
	private String workAttitudeCodeName;
	private String commuteApplyCode;
	private String commuteStartTime;
	private String commuteEndTime;
	private String workType;
	private String workDayOfWeek;
	
	//constructor
	public WorkAttitudeCode() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getter, setter
	public String getWorkAttitudeCodeNo() {
		return workAttitudeCodeNo;
	}
	public void setWorkAttitudeCodeNo(String workAttitudeCodeNo) {
		this.workAttitudeCodeNo = workAttitudeCodeNo;
	}
	public String getWorkAttitudeCodeName() {
		return workAttitudeCodeName;
	}
	public void setWorkAttitudeCodeName(String workAttitudeCodeName) {
		this.workAttitudeCodeName = workAttitudeCodeName;
	}
	public String getCommuteApplyCode() {
		return commuteApplyCode;
	}
	public void setCommuteApplyCode(String commuteApplyCode) {
		this.commuteApplyCode = commuteApplyCode;
	}
	public String getCommuteStartTime() {
		return commuteStartTime;
	}
	public void setCommuteStartTime(String commuteStartTime) {
		this.commuteStartTime = commuteStartTime;
	}
	public String getCommuteEndTime() {
		return commuteEndTime;
	}
	public void setCommuteEndTime(String commuteEndTime) {
		this.commuteEndTime = commuteEndTime;
	}
	public String getWorkType() {
		return workType;
	}
	public void setWorkType(String workType) {
		this.workType = workType;
	}
	public String getWorkDayOfWeek() {
		return workDayOfWeek;
	}
	public void setWorkDayOfWeek(String workDayOfWeek) {
		this.workDayOfWeek = workDayOfWeek;
	}
	
	//toString
	@Override
	public String toString() {
		return "WorkAttitudeCode [workAttitudeCodeNo=" + workAttitudeCodeNo + ", workAttitudeCodeName="
				+ workAttitudeCodeName + ", commuteApplyCode=" + commuteApplyCode + ", commuteStartTime="
				+ commuteStartTime + ", commuteEndTime=" + commuteEndTime + ", workType=" + workType
				+ ", workDayOfWeek=" + workDayOfWeek + "]";
	}

}
