package com.kh.chapter2._class;

// 내부에서만 사용할 때 주로 사용 
// 접근 제한자 생략 시 default 접근 제한이 적용된다.
class Phone {
	private String name;
	
	private String color;
	
	private String brand;

	
	// 기본 생성자 
	public Phone() {
		
	}
	
	// getter setter 생성

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	
	

}
