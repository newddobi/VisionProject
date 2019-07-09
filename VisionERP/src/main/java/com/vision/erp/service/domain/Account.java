package com.vision.erp.service.domain;

public class Account {

	public Account() {
		super();
	}

	private String accountRegNo;
	private String accountNo;
	private String accountUsageStatusCodeNo;
	private String accountUsageStatusCodeName;
	private String accountHolder;
	private String bankCodeNo;
	private String bankCodeName;
	private String reference;
	private String accountCategoryCodeNo;
	private String accountCategoryCodeName;
	
	public String getAccountRegNo() {
		return accountRegNo;
	}
	public void setAccountRegNo(String accountRegNo) {
		this.accountRegNo = accountRegNo;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountUsageStatusCodeNo() {
		return accountUsageStatusCodeNo;
	}
	public void setAccountUsageStatusCodeNo(String accountUsageStatusCodeNo) {
		this.accountUsageStatusCodeNo = accountUsageStatusCodeNo;
	}
	public String getAccountUsageStatusCodeName() {
		return accountUsageStatusCodeName;
	}
	public void setAccountUsageStatusCodeName(String accountUsageStatusCodeName) {
		this.accountUsageStatusCodeName = accountUsageStatusCodeName;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public String getBankCodeNo() {
		return bankCodeNo;
	}
	public void setBankCodeNo(String bankCodeNo) {
		this.bankCodeNo = bankCodeNo;
	}
	public String getBankCodeName() {
		return bankCodeName;
	}
	public void setBankCodeName(String bankCodeName) {
		this.bankCodeName = bankCodeName;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getAccountCategoryCodeNo() {
		return accountCategoryCodeNo;
	}
	public void setAccountCategoryCodeNo(String accountCategoryCodeNo) {
		this.accountCategoryCodeNo = accountCategoryCodeNo;
	}
	public String getAccountCategoryCodeName() {
		return accountCategoryCodeName;
	}
	public void setAccountCategoryCodeName(String accountCategoryCodeName) {
		this.accountCategoryCodeName = accountCategoryCodeName;
	}
	
	
	@Override
	public String toString() {
		return "Account [accountRegNo=" + accountRegNo + ", accountNo=" + accountNo + ", accountUsageStatusCodeNo="
				+ accountUsageStatusCodeNo + ", accountUsageStatusCodeName=" + accountUsageStatusCodeName
				+ ", accountHolder=" + accountHolder + ", bankCodeNo=" + bankCodeNo + ", bankCodeName=" + bankCodeName
				+ ", reference=" + reference + ", accountCategoryCodeNo=" + accountCategoryCodeNo
				+ ", accountCategoryCodeName=" + accountCategoryCodeName + "]";
	}
	
}
