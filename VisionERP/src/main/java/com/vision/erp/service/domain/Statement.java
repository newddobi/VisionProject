package com.vision.erp.service.domain;

public class Statement {
	
	//constructor
	public Statement() {
		super();
	}

	//field
	private String statementNo;
	private String tradeTargetNo;
	private String tradeTargetName;
	private String tradeDate;
	private String accountRegNo;
	private String tradeAmount;
	private String statementCategoryCodeNo;
	private String statementCategoryCodeName;
	private String statementUsageStatusCodeNo;
	private String statementUsageStatusCodeName;
	private String statementDetail;
	
	//getter, setter
	public String getStatementNo() {
		return statementNo;
	}
	public void setStatementNo(String statementNo) {
		this.statementNo = statementNo;
	}
	public String getTradeTargetNo() {
		return tradeTargetNo;
	}
	public void setTradeTargetNo(String tradeTargetNo) {
		this.tradeTargetNo = tradeTargetNo;
	}
	public String getTradeTargetName() {
		return tradeTargetName;
	}
	public void setTradeTargetName(String tradeTargetName) {
		this.tradeTargetName = tradeTargetName;
	}
	public String getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}
	public String getAccountRegNo() {
		return accountRegNo;
	}
	public void setAccountRegNo(String accountRegNo) {
		this.accountRegNo = accountRegNo;
	}
	public String getTradeAmount() {
		return tradeAmount;
	}
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	public String getStatementCategoryCodeNo() {
		return statementCategoryCodeNo;
	}
	public void setStatementCategoryCodeNo(String statementCategoryCodeNo) {
		this.statementCategoryCodeNo = statementCategoryCodeNo;
	}
	public String getStatementCategoryCodeName() {
		return statementCategoryCodeName;
	}
	public void setStatementCategoryCodeName(String statementCategoryCodeName) {
		this.statementCategoryCodeName = statementCategoryCodeName;
	}
	public String getStatementUsageStatusCodeNo() {
		return statementUsageStatusCodeNo;
	}
	public void setStatementUsageStatusCodeNo(String statementUsageStatusCodeNo) {
		this.statementUsageStatusCodeNo = statementUsageStatusCodeNo;
	}
	public String getStatementUsageStatusCodeName() {
		return statementUsageStatusCodeName;
	}
	public void setStatementUsageStatusCodeName(String statementUsageStatusCodeName) {
		this.statementUsageStatusCodeName = statementUsageStatusCodeName;
	}
	public String getStatementDetail() {
		return statementDetail;
	}
	public void setStatementDetail(String statementDetail) {
		this.statementDetail = statementDetail;
	}
	
	//toString
	@Override
	public String toString() {
		return "Statement [statementNo=" + statementNo + ", tradeTargetNo=" + tradeTargetNo + ", tradeTargetName="
				+ tradeTargetName + ", tradeDate=" + tradeDate + ", accountRegNo=" + accountRegNo + ", tradeAmount="
				+ tradeAmount + ", statementCategoryCodeNo=" + statementCategoryCodeNo + ", statementCategoryCodeName="
				+ statementCategoryCodeName + ", statementUsageStatusCodeNo=" + statementUsageStatusCodeNo
				+ ", statementUsageStatusCodeName=" + statementUsageStatusCodeName + ", statementDetail="
				+ statementDetail + "]";
	}
	
	
}
