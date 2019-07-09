package com.vision.erp.service.domain;

public class Statement {

	public Statement() {
		super();
	}

	private String statementNo;
	private String tradeTargetName;
	private String tradeDate;
	private String accountNo;
	private String tradeAmount;
	private String statementCategoryCodeNo;
	private String statementCategoryCodeName;
	private String statementUsageStatusCodeNo;
	private String statementUsageStatusCodeName;
	private String statementDetail;
	public String getStatementNo() {
		return statementNo;
	}
	public void setStatementNo(String statementNo) {
		this.statementNo = statementNo;
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
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
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
	
	@Override
	public String toString() {
		return "Statement [statementNo=" + statementNo + ", tradeTargetName=" + tradeTargetName + ", tradeDate="
				+ tradeDate + ", accountNo=" + accountNo + ", tradeAmount=" + tradeAmount + ", statementCategoryCodeNo="
				+ statementCategoryCodeNo + ", statementCategoryCodeName=" + statementCategoryCodeName
				+ ", statementUsageStatusCodeNo=" + statementUsageStatusCodeNo + ", statementUsageStatusCodeName="
				+ statementUsageStatusCodeName + ", statementDetail=" + statementDetail + ", getStatementNo()="
				+ getStatementNo() + ", getTradeTargetName()=" + getTradeTargetName() + ", getTradeDate()="
				+ getTradeDate() + ", getAccountNo()=" + getAccountNo() + ", getTradeAmount()=" + getTradeAmount()
				+ ", getStatementCategoryCodeNo()=" + getStatementCategoryCodeNo() + ", getStatementCategoryCodeName()="
				+ getStatementCategoryCodeName() + ", getStatementUsageStatusCodeNo()="
				+ getStatementUsageStatusCodeNo() + ", getStatementUsageStatusCodeName()="
				+ getStatementUsageStatusCodeName() + ", getStatementDetail()=" + getStatementDetail() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
