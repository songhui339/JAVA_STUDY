package com.kh.chapter3._interface;

public abstract class Product implements Basic3 {
	private String pCode;  // product code 상품 코드 
	
	private String name; // 이름 
	
	private String brand; // 브랜드 
	
	private int price; // 가격 
	
	// 기본 생성자 
	public Product() {
//		System.out.println("부모 클래스의 기본 생성자");
	}

	public Product(String pCode, String name, String brand, int price) {
		super();
		this.pCode = pCode;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	
	
	// setter 생성 
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	// Getter 생성 
	public String getpCode() {
		return pCode;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "pCode=" + pCode + ", name=" + name + ", brand=" + brand + ", price=" + price;
	}
	
	
	
	
}
