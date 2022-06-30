package com.kh.control.practice;

import java.util.Scanner;

public class D_While {
	/*
	 * while 문
	 * 
	 * [표현식]
	 * 
	 *  while(조건식) {
	 *  	..실행 코드..
	 *  	
	 *  	[증감식, 분기분]
	 *  }
	 *  
	 */
	public void method1() {
		// 1부터 랜덤값(1 ~ 10)까지의 합계 
		int sum = 0;
		int random = (int) (Math.random() * 10 + 1);
		
		int i = 0;
		
		while(i <= random) {
			sum += i ;
			
			i++;
		}
		
		System.out.printf("1부터 %d까지의 합 : %d", random, sum);
	}
	
	
	// 사용자에게 계속 문자열을 입력 받고 그 문자열을 출력한다.
	// 단, 사용자가 "exit" 문자열을 입력하면 프로그램을 종료한다.
	public void method2() {
		String str = "";
		Scanner scanner = new Scanner(System.in);
		
		
		// 1) 분기문을 넣는 방법 
//		while (true) {
//			System.out.print("문자열을 입력해 주세요. > ");
//			str = scanner.nextLine();
//			
//			// 문자열을 비교하는 방법 : str.equals
//			if(str.equals("exit")) {
//				break;
//			}
//			
//			System.out.println(str);
//		}
		
		while(!str.equals("exit")) {
			System.out.print("문자열을 입력해 주세요. > ");
			str = scanner.nextLine();
			
			System.out.println(str);
		}
		
		System.out.println("프로그램을 종료합니다.");
		
//		scanner.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
