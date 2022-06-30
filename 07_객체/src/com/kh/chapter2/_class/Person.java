package com.kh.chapter2._class;

/*
 * 클래스
 * 
 * 	[표현법]
 * 		[접근 제한자] [예약어] class 클래스명 {
 * 			// 1. 필드 (객체의 속성을 정의)
 * 			[접근 제한자] [예약어] 자료형 필드명 [= 초기값];
 *			private static int num; 
 *			...
 *	
 * 			// 2. 생성자 (필드를 초기화하거나, 객체를 사용할 준비) // 단축키 alt + command + s / 윈도우는 alt + shift + s
 * 			[접근 제한자] 클래스명([매개변수, ...]) {
 * 				...
 * 			}
 * 
 * 			// 3. 메소드 (객체의 기능을 정의)
 * 			[접근 제한자] [예약어] 반환형 메소드명()[매개변수, ...]) {
 * 				...
 * 				[return] [반환값];
 * 				// void가 오면 return + 반환값은 생략 가능
 * 			}
 * 		}
 * 
 * 클래스에서 사용 가능한 접근 제한자
 * 
 * 	1. public
 * 		- 클래스를 선언할 때 접근 제한자를 public을 붙였다면 클래스는 public 접근 제한을 갖는다.
 * 		- public으로 선언된 클래스를 아무 제약없이 사용할 수 있다.
 * 
 * 	2. default
 * 		- 클래스를 선언할 떄 접근 제한자를 생략했다면 default 접근 제한을 갖는다.
 * 		- 동일한 패키지에는 아무런 제약없이 사용할 수 있지만 다른 패키지에서는 사용할 수 없도록 접근이 제한된다.
 * 
 * 3. 
 */

public class Person {
	
	// 객체 생성 
	private String name;
	
	private int age;
	
	private Phone phone;
	
	public Person() {
		// return 도 필요 없음 
		
	}

	// getter setter 생성
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public String getPhone() {
		return this.phone.getBrand() + "의 " + this.phone.getName();
	}
	
	
	public void setPhone(String name, String color, String brand) {
//		this.phone = phone;
		this.phone = new Phone();
		
		// this 생략 가능 
		this.phone.setName(name);
		this.phone.setColor(color);
		this.phone.setBrand(brand);
		
	}

	public void whoAreYou() {
		System.out.println("안녕하세요. 저는 " + this.name + "입니다. 나이는 " + this.age + "세 입니다.");
		System.out.println("저는 " + this.phone.getBrand() + "의 " + this.phone.getName() + "을 가지고 있습니다.");
	}
	
	
	

}
















