package com.vision.erp.service.domain;

public class Card {

	public Card() {
		super();
	}
	
	private String cardRegNo;
	private String cardNo;
	private String cardManager;
	private String cardCategoryCodeNo;
	private String cardCategoryCodeName;
	private String cardName;
	private String cardCompanyCodeNo;
	private String cardCompanyCodeName;
	private String cardImage;
	private String cardUsageStatusCodeNo;
	private String cardUsageStatusCodeName;
	private String accountNo;
	
	public String getCardRegNo() {
		return cardRegNo;
	}
	public void setCardRegNo(String cardRegNo) {
		this.cardRegNo = cardRegNo;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardManager() {
		return cardManager;
	}
	public void setCardManager(String cardManager) {
		this.cardManager = cardManager;
	}
	public String getCardCategoryCodeNo() {
		return cardCategoryCodeNo;
	}
	public void setCardCategoryCodeNo(String cardCategoryCodeNo) {
		this.cardCategoryCodeNo = cardCategoryCodeNo;
	}
	public String getCardCategoryCodeName() {
		return cardCategoryCodeName;
	}
	public void setCardCategoryCodeName(String cardCategoryCodeName) {
		this.cardCategoryCodeName = cardCategoryCodeName;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardCompanyCodeNo() {
		return cardCompanyCodeNo;
	}
	public void setCardCompanyCodeNo(String cardCompanyCodeNo) {
		this.cardCompanyCodeNo = cardCompanyCodeNo;
	}
	public String getCardCompanyCodeName() {
		return cardCompanyCodeName;
	}
	public void setCardCompanyCodeName(String cardCompanyCodeName) {
		this.cardCompanyCodeName = cardCompanyCodeName;
	}
	public String getCardImage() {
		return cardImage;
	}
	public void setCardImage(String cardImage) {
		this.cardImage = cardImage;
	}
	public String getCardUsageStatusCodeNo() {
		return cardUsageStatusCodeNo;
	}
	public void setCardUsageStatusCodeNo(String cardUsageStatusCodeNo) {
		this.cardUsageStatusCodeNo = cardUsageStatusCodeNo;
	}
	public String getCardUsageStatusCodeName() {
		return cardUsageStatusCodeName;
	}
	public void setCardUsageStatusCodeName(String cardUsageStatusCodeName) {
		this.cardUsageStatusCodeName = cardUsageStatusCodeName;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	@Override
	public String toString() {
		return "Card [cardRegNo=" + cardRegNo + ", cardNo=" + cardNo + ", cardManager=" + cardManager
				+ ", cardCategoryCodeNo=" + cardCategoryCodeNo + ", cardCategoryCodeName=" + cardCategoryCodeName
				+ ", cardName=" + cardName + ", cardCompanyCodeNo=" + cardCompanyCodeNo + ", cardCompanyCodeName="
				+ cardCompanyCodeName + ", cardImage=" + cardImage + ", cardUsageStatusCodeNo=" + cardUsageStatusCodeNo
				+ ", cardUsageStatusCodeName=" + cardUsageStatusCodeName + ", accountNo=" + accountNo + "]";
	}
	
	

}
