package com.vision.erp.service.domain;

public class SalesMenu {
	//field
	private String menuNo;
	private String menuName;
	private String menuPrice;
	
	//constructor
	public SalesMenu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getter, setter
	public String getMenuNo() {
		return menuNo;
	}
	public void setMenuNo(String menuNo) {
		this.menuNo = menuNo;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(String menuPrice) {
		this.menuPrice = menuPrice;
	}
	
	//toString
	@Override
	public String toString() {
		return "SalesMenu [menuNo=" + menuNo + ", menuName=" + menuName + ", menuPrice=" + menuPrice + "]";
	}
	
}
