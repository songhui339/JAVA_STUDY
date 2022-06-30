package com.kh.chapter4.constructor;

import com.kh.chapter3.field.A_Field;

/*
 * 생성자 
 * 	- 클래스로부터 객체를 생성할 때 호출되어 객체의 초기화를 담당한다. (필드 초기화, 객체를 사용할 준비)
 * 	- 생성자 작성 시 주의사항 
 * 	  - 생성자의 이름은 반드시 클래스 이름과 동일해야 한다. 
 * 	   ex. A_Field field = new A_Field();
 * 	  - 반환형이 존재하지 않는다.
 */
public class User {
	private String id;
	
	private String password;
	
	private String name;
	
	private int age;
	
	private char gender;
	
	
	// setter 생성 
	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	// 기본 생성자 
	public User() {
		
		System.out.println("기본 생성자 호출");
	}
	
	// private -> 외부에서 접근 불가 
//	private User() {
//		System.out.println("기본 생성자 호출");
//	}
	
	
	// 메소드의 경우 이름이 동일해도 여러개의 메소드를 만들 수 있음 
	// 오버 로딩이라고 함 
	// 매개 변수가 있는 생성자 (id, pw, name)
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	// 매개 변수가 있는 생성자 (id, pw, name, age, gender)
	public User(String id, String password, String name, int age, char gender) {
//		this.id = id;
//		this.password = password;
//		this.name = name;
		// 클래스 내에서 문자열 매개 변수 3개를 가지는  생성자를 호출한다.
		this(id, password, name);
		this.age = age;
		this.gender = gender;
	}
	
	public String information() {
		return this.id + ", " + this.password + ", " +  this.name + ", " + this.age + ", " + this.gender;
	}
	

}
