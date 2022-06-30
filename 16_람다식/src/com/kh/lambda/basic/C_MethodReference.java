package com.kh.lambda.basic;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

import com.kh.lambda.standard.model.vo.Student;

public class C_MethodReference {
	public void method1() {
		// 2개의 정수값을 받은 후 큰 값을 리턴 

//		1) 간결화 전 
//		IntBinaryOperator binaryOperator = (int a, int b) -> {
//			return Math.max(a, b);
//		};
		
		
//		2) 1차 간결화 
//		IntBinaryOperator binaryOperator = (a, b) -> Math.max(a, b);
		
//		3) 2차 간결화 
//		정적 메소드를 참조할 경우에는 클래스 이름 뒤에 :: 기호를 붙이고 정적 메소드 이름을 기술하면 된다 
		IntBinaryOperator binaryOperator = Math::max;
		
		System.out.println(binaryOperator.applyAsInt(10, 20));
		
		// 객체의 메소드를 참조할 경우, 참조 변수 뒤에 :: 기호를 붙이고 메소드 이름을 기술하면 된다 
//		Consumer<String> consumer = s -> System.out.println(s);
		Consumer<String> consumer = System.out::println;
		
		consumer.accept("이정후짱짱맨");
		
		// 매개변수에 있는 객체를 리턴하고 있는 것 
//		Function<Student, String> function = s -> s.getName();
		// 매개변수에 있는 객체의 메소드를 참조하는 구문
		Function<Student, String> function = Student::getName;
		
		
		System.out.println(function.apply(new Student("김태진", 28)));
		
		// 생성자 참조하는 구
//		Supplier<Student> supplier = () -> new Student();
		Supplier<Student> supplier = Student::new;
		
		System.out.println(supplier.get());
		
		
//		BiFunction<String, Integer, Student> biFunction = (name, age) -> new Student(name, age);
		BiFunction<String, Integer, Student> biFunction = Student::new;
		
		System.out.println(biFunction.apply("이정후", 25));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
