package com.kh.lambda.standard;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import com.kh.lambda.standard.model.vo.Student;

public class C_Function {
	public void method1() {
		Student student = new Student("최송희", 29, "여자", 80, 70);
		
//		Function<Student, String> function = (Student s) -> {
////			return s.toString();
//			return s.getName();
//			
//		};
		
		
		Function<Student, String> function = s -> s.getName();
		
		System.out.println("넌 이름이 뭐니? : " + function.apply(student));
		
		
		
//		BiFunction<String, Integer, Student> biFunction =  (String name, Integer age) -> {
//			return new Student(name, age);
//			
//		};
		
		// 간소화!
//		BiFunction<String, Integer, Student> biFunction =  (name, age) -> new Student(name, age);
		BiFunction<String, Integer, Student> biFunction =  Student::new;
		
		System.out.println(biFunction.apply("이정후", 25));
		
		/*
		 * 람다식을 사용하지 않으면 수학, 영어 점수를 가져오게하는 메소드를 만들어야한다
		 * 번거로움을 줄이기 위해 자바스크립트의 콜백함수를 만들듯이 간결화하는 것이 자바의 람다식이
		 */
		System.out.print("[수학 점수] : ");
		printValue((s) -> {return s.getMath();}, student);
		
		System.out.print("[영어 점수] : ");
		printValue((s) -> {return s.getEnglish();}, student);
		
		
		// 수학 점수와 영어점수의 평균 점수 -> 모르겠음 ㅜㅠㅜㅠㅜㅠ
		// 평균점수를 구해보세요~! ((영어 + 수학) / 2)
		System.out.print("[영어&수학 점수의 평균] : ");
		// 2가지 방법 
		printValue((s) -> (s.getEnglish() + s.getMath()) / 2, student);
		printValue((s) -> s.getAvg(), student);
		
		
		
//		Student student2 = new Student("최송희", 29, "여자", 80, 70);
//		System.out.println(student.hashCode()); // 같은 값의 hashCode가 나
//		System.out.println(student2.hashCode());
		
		
	}
	

	public void printValue(ToIntFunction<Student> function, Student student) {
		System.out.println(function.applyAsInt(student));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
