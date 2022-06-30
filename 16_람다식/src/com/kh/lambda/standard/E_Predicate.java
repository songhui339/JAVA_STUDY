package com.kh.lambda.standard;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import com.kh.lambda.standard.model.vo.Student;

public class E_Predicate {
	public void method1() {
		
		/*
		 * 객체 만들기 
		 */
		Student student1 = new Student("최송희", 29, "여자", 80, 70);
		Student student2 = new Student("이정후", 25, "남자", 100, 100);
		
		// 입력 받은 객체가 남자이면 false 여자이면 true
		Predicate<Student> predicate = (Student s) -> {
			return s.getGender().equals("여자");
		};
		
		System.out.println("최송희는 여자입니까? : " + predicate.test(student1));
		System.out.println("이정후는 여자입니까? : " + predicate.test(student2));
		
//		predicate.test
		
		IntPredicate intiIntPredicate = value -> 100 < value;
		
		System.out.println(intiIntPredicate.test(100)); // false
		System.out.println(intiIntPredicate.test(101)); // true
		
		// 성별이 같은지 확인해보는 작업
		BiPredicate<Student, Student> biPredicate = (s1, s2) -> {
			return s1.getGender().equals(s2.getGender());
//			return s1.getGender().equals("여자") && s2.getGender().equals("여자");
		};
		
		System.out.println(biPredicate.test(student1, student2));
		 
		
	}
}
