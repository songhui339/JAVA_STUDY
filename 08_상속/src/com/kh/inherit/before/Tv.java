package com.kh.inherit.before;

public class Tv {
	private String pCode;  // product code 상품 코드 
	
	private String name; // 이름 
	
	private String brand; // 브랜드 
	
	private int price; // 가격 
	
	private int inch; // 인치 
	
	public Tv() {
		
	}

	public Tv(String pCode, String name, String brand, int price, int inch) {
		super();
		this.pCode = pCode;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.inch = inch;
	}

	@Override
	public String toString() {
		return "Tv [pCode=" + pCode + ", name=" + name + ", brand=" + brand + ", price=" + price + ", inch=" + inch
				+ "]";
	}
	
	


}
