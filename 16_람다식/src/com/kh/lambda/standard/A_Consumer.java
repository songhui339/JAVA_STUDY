package com.kh.lambda.standard;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class A_Consumer {
	/*
	 * Consumer
	 */
	
	public void method1() {
		// 익명 함수 
//		Consumer<String> consumer = new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				 
//			}
//			
//		};
		
		Consumer<String> consumer = (String str) -> {
			System.out.println(str);
		};
		
		consumer.accept("Consumer : 한 개의 매개값(제네릭으로 지정된 타입의 객체)을 받아서 소비한다.");
		
	
//		BiConsumer<String, String> biConsumer = (String str1, String str2) -> {
//			System.out.println(str1 + str2);
//		};
		
		BiConsumer<String, String> biConsumer = (str1, str2) -> System.out.println(str1 + str2);
		
		biConsumer.accept("BiConsumer : ", "두 개의 매개값(제네릭으로 지정된 타입의 객체)을 받아서 소비한다.");

//		DoubleConsumer dConsumer = (double value) -> {
//			System.out.println("DoubleConsumer : 하나의 double 타입의 값을 소비한다. \tvalue : " + value);
//		};
		
//		DoubleConsumer dConsumer = value -> System.out.println("DoubleConsumer : 하나의 double 타입의 값을 소비한다. \tvalue : " + value);
		DoubleConsumer dConsumer = System.out::println; // 단순하게 값을 받아서 찍고 싶을 때 사용하는 구문 
	
		
		dConsumer.accept(3.14);
		
		
		ObjIntConsumer<String> objIntConsumer = (String str, int value) -> {
			System.out.println("ObjIntConsumer : 두 개의 매개값(제네릭으로 지정된 타입의 객체, int 타입의 값)을 받아서 소비한다.");
			System.out.println(str + value);
		};
		
		objIntConsumer.accept("Java", 11);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
