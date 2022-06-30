package com.kh.inherit.before;

public class SmartPhone {
	private String pCode; // product code 상품 코드 
	
	private String name; // 이름 
	
	private String brand; // 브랜드 
	
	private int price; // 가격 
	
	private String mobileAgency; // 통신사 정보 
	
	public SmartPhone() {
		
	}

	public SmartPhone(String pCode, String name, String brand, int price, String mobileAgency) {
		super();
		this.pCode = pCode;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.mobileAgency = mobileAgency;
	}

	@Override
	public String toString() {
		return "SmartPhone [pCode=" + pCode + ", name=" + name + ", brand=" + brand + ", price=" + price
				+ ", mobileAgency=" + mobileAgency + "]";
	}

	
	
	

}

