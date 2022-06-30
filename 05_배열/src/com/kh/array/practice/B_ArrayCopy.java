package com.kh.array.practice;

import java.util.Arrays;

public class B_ArrayCopy {

	/*
	 * 배열의 복사 
	 * 
	 * 1. 얕은 복사 
	 * 	- 배열의 주소만 복사하는 복사 
	 * 	
	 * 
	 * 2. 깊은 복사 
	 * 	- 동일한 새로운 배열을 하나 생성해서 실제 내부 값들을 복사한다.
	 */
	public void method1() {
		
//		int origin = 20;
//		int copy = origin;
		
//		System.out.printf("origin : %d, copy : %d", origin, copy);
		
		int[] origin = {5, 6, 7};
		// 배열 복사가 아닌 origin의 주소값만 복사 
		int[] copy = origin;
		
		// 원본 배열 출력 
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println();
		
		// 복사본 배열 출력 
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		
	
		copy[1] = 66; // 5 66 7 
		
		// 원본 배열 출력 
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println();
		
		// 복사본 배열 출력 
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
		System.out.println(origin.equals(copy)); // 주소값이 같으므로 true 출력 
		
	}
	
	public void method2() {
		// 1. for 문을 이용한 깊은 복사 
		// 새로운 배열을 생성하여 반복문을 통해 실제 값을 복사하는 방법 
		int origin[] = {6, 7, 8, 9, 10};
		int copy[] = new int[10];
		
		// 반복문을 통해서 Origin에 있는 값들을 copy에 대입한다.
		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		
		// 원본 배열 출력
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println();
		// 복사본 배열 출력 
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		copy[2] = 88;
		
		// 원본 배열 출력
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " "); // 6 7 8 9 10
		}
		
		System.out.println();
		// 복사본 배열 출력 
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " "); // 6 7 88 9 10
		}
		
		System.out.println();
		System.out.println(origin.hashCode()); // 주소가 다름 
		System.out.println(copy.hashCode());
		System.out.println(origin.equals(copy)); // false -> 주소 값을 비교 
		
//		new String("문인수").equals("문인수");
		
	}
	
	public void method3() {
//		String str1 = new String("java");
//		String str2 = "java";
//		String str3 = "java";
//		String str4 = new String("java");
//		
//		System.out.println(str1 == str2); // false
//		System.out.println(str2 == str3); // true
//		System.out.println(str1 == str4); // false
		
		// 2. System 클래스에서 제공하는 arraycopy() 메소드를 이용한 깊은 복사 
		int origin[] = {6, 7, 8, 9, 10};
		int copy[] = new int[10];
		
		// System,arrycopy(원본 배열, 복사 시작 인덱스, 복사본 배열, 복사 시직 위치, 복사할 길이)
		// 복사하고자 하는 배열의 시작 인덱스와 개수를 지정하고 싶을 떄 사용한다.
		// 복사되는 배열을 미리 생성해서 전달해야 한다.
		System.arraycopy(origin, 0, copy, 0, origin.length);
		
		// 원본 배열 출력
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println();
		// 복사본 배열 출력 
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		System.out.println(origin.hashCode());
		System.out.println(origin.length);
		System.out.println(copy.hashCode());
		System.out.println(copy.length);
	}
	
	public void method4() {
		// 3. Arrays 클래스에서 제공하는 copyOf() 메소드를 이용한 깊은 복사 
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = null;
		
		// Arrays.copyOf(원본 배열, 복사할 길이);
		// 복사하고자 하는 배열의 크기를 다시 지정해서 복사하고 싶을 떄 사용 
		// 복사되는 배열을 미리 생성하지 않고 메소드에 배열의 크기를 전달해서 생성 
		copy = Arrays.copyOf(origin, 10);
		
		// 원본 배열 출력 
		// 향상된 for 문 
		for(int value : origin) {
			System.out.print(value + " ");
		}
		
		System.out.println();
		
		// 복사본 배열 출력 
		for (int value : copy) {
			System.out.print(value + " ");
			
		}
		
		System.out.println();
		System.out.println(origin.hashCode());
		System.out.println(origin.length);
		System.out.println(copy.hashCode());
		System.out.println(copy.length);
	}
	
	
	public void method5() {
		// 4. clone() 메소드를 이용한 복사 
		// 원본 배열을 통째로 복사해서 새로운 배열을 생성한다.
		// 시작 인덱스를 지정할 수 없고 복사본 배열
		int[] origin = {11, 12, 13, 14, 15};
		int[] copy = origin.clone(); 
		
		// 원본 배열 출력 
		// 향상된 for 문 
		for(int value : origin) {
			System.out.print(value + " ");
		}
		
		System.out.println();
		
		// 복사본 배열 출력 
		for (int value : copy) {
			System.out.print(value + " ");
			
		}
		
		System.out.println();
		System.out.println(origin.hashCode());
		System.out.println(origin.length);
		System.out.println(copy.hashCode());
		System.out.println(copy.length);		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
