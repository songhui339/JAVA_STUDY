package com.kh.control.practice;

import java.util.Scanner;

public class E_DoWhile {
	/*
	 * do-while 문
	 * 
	 * [표현식]
	 * 
	 * 	do {
	 * 		..실행 코드..
	 * 
	 * 		[증감식, 분기문]
	 * } while (조건식); 
	 */
	public void method1() {
		// 조건에 상관없이 무조건 한 번은 출력이 되는지 확인 
		int num = 1;
		
		// 절대 실행 안됨
		while(num == 0) {
			System.out.println("while 문 실행");
		}
		
		// do-while은 조건에 상관 없이 한번은 출력 됨 
		do {
			System.out.println("do-while 문 실행");
		} while(num == 0);
	}
	
	public void method2() {
		/*
		 * 예시 )
		 * ============ 메뉴 =============
		 * 1. C_For 클래스의 method1() 실행
		 * 2. C_For 클래스의 method2() 실행
		 * 3. C_For 클래스의 method3() 실행
		 * Q(q). 프로그램 종료 
		 * ==============================
		 * > q
		 * 
		 * 프로그램이 종료됩니다.
		 * 
		 */
		
		char menu = '\u0000';
		C_For example = new C_For();
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("============ 메뉴 =============");
			System.out.println("1. C_For 클래스의 method1() 실행");
			System.out.println("2. C_For 클래스의 method2() 실행");
			System.out.println("3. C_For 클래스의 method3() 실행");
			System.out.println("Q(q). 프로그램 종료 ");
			System.out.println("==============================");
			System.out.print("> ");
			menu = scanner.nextLine().charAt(0);
			
			switch(menu) {
				case '1' : 
					example.method1();
					
					break;
				case '2' : 
					example.method2();
					
					break;
				
				case '3' : 
					example.method3();
					
					break;
				
				case 'Q' :
				case 'q' : 
					System.out.println("프로그램이 종료됩니다.");
					scanner.close();
					
					return;
				
				default :
					System.out.println("메뉴를 잘못 입력했습니다.");
			}
			
			
		} while(true);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
