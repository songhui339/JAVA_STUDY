package com.kh.chapter3.field;

public class Application {

	public static void main(String[] args) {
		A_Field field = new A_Field();
		// 접근 제한자 테스트 
		// public : 필드에 직접 접근이 가능하다 
		System.out.println(field.publicField);
		
//		protected : 같은 패키지 내에 존재하거나, 자식 클래스에서만 직접 접근이 가능 
		System.out.println(field.protectedField);

//		default : 같은 패키지 내에서만 직접 접근이 가능 
		System.out.println(field.defaultField);
		
//		private : 같은 클래스 내에서만 직접 접근이 가능
//		System.out.println(field.privateField);		
	}

}
