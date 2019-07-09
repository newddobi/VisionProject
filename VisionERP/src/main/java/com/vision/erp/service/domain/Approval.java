package com.vision.erp.service.domain;

public class Approval {
	//field
	private String approvalNo;
	private String approvalTitle;
	private String approvalContent;
	private String submitDate;
	private SimpleHumanResourceCard firstApprover;
	private SimpleHumanResourceCard secondApprover;
	private SimpleHumanResourceCard thirdApprover;
	private SimpleHumanResourceCard fourthApprover;
	private SimpleHumanResourceCard fifthApprover;
	private String approvalFormNo;
	private String approvalStatusCodeNo;
	private String approvalStatusCodeName;
	
	//constructor
	public Approval() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getter, setter
	public String getApprovalNo() {
		return approvalNo;
	}

	public void setApprovalNo(String approvalNo) {
		this.approvalNo = approvalNo;
	}
	public String getApprovalTitle() {
		return approvalTitle;
	}
	public void setApprovalTitle(String approvalTitle) {
		this.approvalTitle = approvalTitle;
	}
	public String getApprovalContent() {
		return approvalContent;
	}
	public void setApprovalContent(String approvalContent) {
		this.approvalContent = approvalContent;
	}
	public String getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(String submitDate) {
		this.submitDate = submitDate;
	}
	public SimpleHumanResourceCard getFirstApprover() {
		return firstApprover;
	}
	public void setFirstApprover(SimpleHumanResourceCard firstApprover) {
		this.firstApprover = firstApprover;
	}
	public SimpleHumanResourceCard getSecondApprover() {
		return secondApprover;
	}
	public void setSecondApprover(SimpleHumanResourceCard secondApprover) {
		this.secondApprover = secondApprover;
	}
	public SimpleHumanResourceCard getThirdApprover() {
		return thirdApprover;
	}
	public void setThirdApprover(SimpleHumanResourceCard thirdApprover) {
		this.thirdApprover = thirdApprover;
	}
	public SimpleHumanResourceCard getFourthApprover() {
		return fourthApprover;
	}
	public void setFourthApprover(SimpleHumanResourceCard fourthApprover) {
		this.fourthApprover = fourthApprover;
	}
	public SimpleHumanResourceCard getFifthApprover() {
		return fifthApprover;
	}
	public void setFifthApprover(SimpleHumanResourceCard fifthApprover) {
		this.fifthApprover = fifthApprover;
	}
	public String getApprovalFormNo() {
		return approvalFormNo;
	}
	public void setApprovalFormNo(String approvalFormNo) {
		this.approvalFormNo = approvalFormNo;
	}
	public String getApprovalStatusCodeNo() {
		return approvalStatusCodeNo;
	}
	public void setApprovalStatusCodeNo(String approvalStatusCodeNo) {
		this.approvalStatusCodeNo = approvalStatusCodeNo;
	}
	public String getApprovalStatusCodeName() {
		return approvalStatusCodeName;
	}
	public void setApprovalStatusCodeName(String approvalStatusCodeName) {
		this.approvalStatusCodeName = approvalStatusCodeName;
	}
	@Override
	public String toString() {
		return "Approval [approvalNo=" + approvalNo + ", approvalTitle=" + approvalTitle + ", approvalContent="
				+ approvalContent + ", submitDate=" + submitDate + ", firstApprover=" + firstApprover
				+ ", secondApprover=" + secondApprover + ", thirdApprover=" + thirdApprover + ", fourthApprover="
				+ fourthApprover + ", fifthApprover=" + fifthApprover + ", approvalFormNo=" + approvalFormNo
				+ ", approvalStatusCodeNo=" + approvalStatusCodeNo + ", approvalStatusCodeName="
				+ approvalStatusCodeName + "]";
	}
	
	
	
}
