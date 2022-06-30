package com.kh.chapter3.assiststream;

import java.io.Serializable;

public class Member implements Serializable{

	// add general longtime ID
	private static final long serialVersionUID = -5236124721796700179L;

	private String id;
	
	
	// transient => 직렬에서 제외한다 
	private transient String pwd;
	
	private String name;

	private int age;
	
	private double point;
	
	
	// 기본 생성자 
	public Member() {
	}


	public Member(String id, String pwd, String name, int age, double point) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.point = point;
	}


	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", age=" + age + ", point=" + point + "]";
	}
	
}
