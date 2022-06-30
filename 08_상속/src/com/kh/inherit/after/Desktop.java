package com.kh.inherit.after;

public class Desktop extends Product {
	private boolean allInone; // 일치 여부 
	
	public Desktop() {
		
//		super();
		System.out.println("자식 클래스의 기본 생성자");
		
//		super(); // 맨 위에 있어야 함 안그럼 에러 뜸 
	}
	
	
	/*
	 * 부모 인스턴스 변수를 초기화 할 수 있는 방법 
	 * 1. 부모의 setter 메소드를 통해서 초기화 
	 * 		- 부모 클래스에서 setter 메소드를 제공하면 자식 객체에서 부모의 setter 메소드를 통해서
	 * 		  필드의 초기화가 가능하다. (setter는 public 접근 제한자를 갖는다.)
	 * 
	 * 2. 부모 생성자를 호출해서 초기화 
	 * 		- super를 통해서 부모의 필드, 메소드, 생성자에 접근 가능 
	 * 		- super([매개값, ...]) 을 통해서 자식의 생성자에서 부모의 생성자를 호출할 수 있다
	 * 
	 * 
	 */
	public Desktop(String pCode, String name, String brand, int price, boolean allInone) {
		
		// 1. 부모의 setter 메소드를 통해서 초기화 	
		// super라고 붙여도 됨 / 부모 요소인지 알기 쉽게 
//		super.setpCode(pCode);
//		setName(name);
//		setBrand(brand);
//		setPrice(price);
		
			
		// 2. 부모 생성자를 호출해서 초기화 
		super(pCode, name, brand, price);
		
		this.allInone = allInone;
	}


	@Override
	public String toString() {
		return "Desktop [" +  super.toString() +", allInone=" + allInone + "]";
	}
	
	
	
	

}
