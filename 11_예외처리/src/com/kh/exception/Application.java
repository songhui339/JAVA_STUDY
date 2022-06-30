package com.kh.exception;

import java.io.IOException;

import com.kh.exception.practice.B_Throws;

public class Application {

	public static void main(String[] args)  {
		System.out.println("프로그램 실행");
		
		
//		new A_TryCatch().method1();
		new B_Throws().method1();
		
		
		
		
		System.out.println("프로그램 종료");
	}

}
