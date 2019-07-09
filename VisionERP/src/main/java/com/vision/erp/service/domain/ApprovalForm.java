package com.vision.erp.service.domain;

public class ApprovalForm {
	
	//field
	private String approvalFormNo;
	private String approvalFormTitle;
	private String approvalForm;
	private String approvalFormUsageStatusCodeNo;
	private String approvalFormUsageStatusCodeName;
	private String registrantEmployeeNo;
	private String registrantEmployeeName;
	private int useCount;
	
	//constructor
	public ApprovalForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	//getter, setter
	public String getApprovalFormNo() {
		return approvalFormNo;
	}

	public void setApprovalFormNo(String approvalFormNo) {
		this.approvalFormNo = approvalFormNo;
	}

	public String getApprovalFormTitle() {
		return approvalFormTitle;
	}

	public void setApprovalFormTitle(String approvalFormTitle) {
		this.approvalFormTitle = approvalFormTitle;
	}

	public String getApprovalForm() {
		return approvalForm;
	}

	public void setApprovalForm(String approvalForm) {
		this.approvalForm = approvalForm;
	}

	public String getApprovalFormUsageStatusCodeNo() {
		return approvalFormUsageStatusCodeNo;
	}

	public void setApprovalFormUsageStatusCodeNo(String approvalFormUsageStatusCodeNo) {
		this.approvalFormUsageStatusCodeNo = approvalFormUsageStatusCodeNo;
	}

	public String getApprovalFormUsageStatusCodeName() {
		return approvalFormUsageStatusCodeName;
	}

	public void setApprovalFormUsageStatusCodeName(String approvalFormUsageStatusCodeName) {
		this.approvalFormUsageStatusCodeName = approvalFormUsageStatusCodeName;
	}

	public String getRegistrantEmployeeNo() {
		return registrantEmployeeNo;
	}

	public void setRegistrantEmployeeNo(String registrantEmployeeNo) {
		this.registrantEmployeeNo = registrantEmployeeNo;
	}

	public String getRegistrantEmployeeName() {
		return registrantEmployeeName;
	}

	public void setRegistrantEmployeeName(String registrantEmployeeName) {
		this.registrantEmployeeName = registrantEmployeeName;
	}

	public int getUseCount() {
		return useCount;
	}

	public void setUseCount(int useCount) {
		this.useCount = useCount;
	}

	//toString
	@Override
	public String toString() {
		return "ApprovalForm [approvalFormNo=" + approvalFormNo + ", approvalFormTitle=" + approvalFormTitle
				+ ", approvalForm=" + approvalForm + ", approvalFormUsageStatusCodeNo=" + approvalFormUsageStatusCodeNo
				+ ", approvalFormUsageStatusCodeName=" + approvalFormUsageStatusCodeName + ", registrantEmployeeNo="
				+ registrantEmployeeNo + ", registrantEmployeeName=" + registrantEmployeeName + ", useCount=" + useCount
				+ "]";
	}

	
}
