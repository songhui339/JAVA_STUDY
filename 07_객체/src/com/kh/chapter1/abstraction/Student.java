package com.kh.chapter1.abstraction;

// [4월7일 5교시]
// 학생을 추상화해서 클래스를 만들어보자 
public class Student {
	// 필드 (속성)
	public int sNum; // 학번 
	public String name; // 이름 
	public int age; // 나이 
	public int math; // 수학 점수 
	public int eng; // 영어 점수 
	
	// 메소드 (기능)
	public int sum() {
		return math + eng;
	}
	
	public double avg() {
		return sum() / 2.0;
	}
}
