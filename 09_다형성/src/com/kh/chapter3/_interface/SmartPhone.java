package com.kh.chapter3._interface;

public class SmartPhone extends Product{

	private String mobileAgency; // 통신사 정보 
	
	public SmartPhone() {
		
	}

	public SmartPhone(String pCode, String name, String brand, int price, String mobileAgency) {
		super(pCode, name, brand, price);
		
		this.mobileAgency = mobileAgency;
	}
	
	

	public String getMobileAgency() {
		return mobileAgency;
	}

	@Override
	public String toString() {
		return "SmartPhone [" + super.toString() + " mobileAgency=" + mobileAgency + "]";
	}

	@Override
	public void turnOn() {
		System.out.println("스마트폰을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스마트폰을 종료합니다.");
		
	}
	
	
	
	
	
}
