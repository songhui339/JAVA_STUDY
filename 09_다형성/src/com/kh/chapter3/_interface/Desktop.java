package com.kh.chapter3._interface;

public class Desktop extends Product {
	private boolean allInone; // 일치 여부 
	
	public Desktop() {
		
//		super();
//		System.out.println("자식 클래스의 기본 생성자");
		
//		super(); // 맨 위에 있어야 함 안그럼 에러 뜸 
	}
	
	
	
	public boolean isAllInone() {
		return allInone;
	}



	public Desktop(String pCode, String name, String brand, int price, boolean allInone) {


		super(pCode, name, brand, price);
		
		this.allInone = allInone;
	}


	@Override
	public String toString() {
		return "Desktop [" +  super.toString() +", allInone=" + allInone + "]";
	}



	@Override
	public void turnOn() {
		System.out.println("데스크톱을 켭니다.");
		
	}



	@Override
	public void turnOff() {
		System.out.println("데스크톱을 종료합니다.");
		
	}
	
	
	
	

}
