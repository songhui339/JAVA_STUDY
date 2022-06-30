package com.kh.lambda.standard;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

import com.kh.lambda.standard.model.vo.Student;

public class D_Operator {
	public void method1() {
		
		/*
		 * Binary는 2개의 객체 값을 받아오고
		 * Unary는 1개의 객체 값을 받아온다 
		 */
//		IntBinaryOperator intBinaryOperator = (a, b) -> {
//			return a + b;
//		};
		
		IntBinaryOperator intBinaryOperator = (a, b) -> a *b;
		
		System.out.println(intBinaryOperator.applyAsInt(20, 30));
		
		IntUnaryOperator intUnaryOperator = (int a) -> {
			return a * a;
		};
		
		System.out.println(intUnaryOperator.applyAsInt(5));
		
	
		/*
		 * 객체 만들기 
		 */
		Student student1 = new Student("최송희", 29, "여자", 80, 70);
		Student student2 = new Student("이정후", 25, "남자", 100, 100);
		
		BinaryOperator<Student> binaryOperator = (s1, s2) -> {
			// 2개의 수학 점수를 받아온 후 더 높은 점수인 객체를 return 하자! 
			return s1.getMath() > s2.getMath() ? s1 : s2;
 		};
 		
 		System.out.println(binaryOperator.apply(student1, student2));
		
 		// java 8 이후부터 추가된 기능 / 참고만 해보기를 (복잡함)
 		binaryOperator = BinaryOperator.<Student>maxBy((s1, s2) -> Integer.compare(s1.getMath(), s2.getMath()));
 		
 		System.out.println(binaryOperator.apply(student1, student2));

		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
