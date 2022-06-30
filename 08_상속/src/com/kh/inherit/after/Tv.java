package com.kh.inherit.after;

public class Tv extends Product {
	private int inch; // 인치 
	
	public Tv () {
		
	}

	public Tv(String pCode, String name, String brand, int price, int inch) {
		super(pCode, name, brand, price);
		
		this.inch = inch;
	}

	@Override
	public String toString() {
		return "Tv [" + super.toString() + " inch=" + inch + "]";
	}
	
	
	
	
	
}
