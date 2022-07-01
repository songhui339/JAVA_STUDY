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
public class Student {
	private String name;
	
	private int age;
	
	private String gender;
	
	private int math;
	
	private int english;

	
	
	

}
