package com.kh.stream.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
// @Data에 아래 Getter~ EqualsAndHashCode 어노테이션이 포함되어 있음 
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable<Student>{
	// C_Collect 에서 새로 추가함 그러니 에러가 발생함 
	// AllArgsConstructor 어노테이션 땜에 그럼 
	private int idx;
	
	private String name;
	
	private int age;
	
	private String gender;
	
	private int math;
	
	private int english;
	
	
	public Student(String name, int age, String gender, int math, int english) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.math = math;
		this.english = english;
	}

	@Override
	public int compareTo(Student student) {
		return Integer.compare(this.age, student.age);
	}




	
	
	

}
