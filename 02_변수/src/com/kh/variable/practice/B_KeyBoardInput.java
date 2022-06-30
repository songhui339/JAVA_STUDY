package com.kh.variable.practice;

import java.util.Scanner;

public class B_KeyBoardInput {
	public void inputByScanner() {
		/*
		 * Scanner 클래스 
		 * 	- 사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스 
		 */
		// Scanner 생성 
		String name = null;
		double height = 0.0;
		char gender ='\u0000';
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * scanner.nextLine() : 사용자가 입력한 값을 모두 읽어옴 (공백 포함)
		 * scanner.next() : 사용자가 입력한 값 중에 공백이 있을 경우 공백 이전까지의 값만 읽어옴 
		 * scanner.nextInt()  정수를 입력 받을 떄 사용 
		 * scanner.nextDouble()  실수를 입력 받을 떄 사용 
		 * ...
		 */
			
		System.out.println("당신의 이름은 무엇입니까?");
		name = scanner.nextLine();
		
		System.out.println("당신의 키는 몇 입니까? (소수점 첫째 자리까지 입력하세요.)");		
		height = scanner.nextDouble();
		
		System.out.println("당신의 성별은 무엇입니까? (남/여)");
		// 앞 부분의 버퍼를 확실하게 비워주기 위해 한번 더 호출하는 것임 
		// scanner.nextXXX () 메소드 뒤에 scanner.nextLine() 메소드를 사용하게 된다면 버퍼에 남아 있는 
		// '엔터'를 빼주기 위해서 scanner.nextLine() 메소드를 한번 더 호출 
		scanner.nextLine();
		// scanner.nextLine() 을 통해서 문자열을 읽어오고 String 클래스의  charAt() 통해서 원하는 문자를 뽑아낸다
		// charAt()에 위치를 지정하는 방법: 제일 앞 문자부터 0 으로 시작해 1씩 증가하며 원하는 문자 추출 
		gender = scanner.nextLine().charAt(0);
//		gender = "남자".charAt(0);
//		gender = new String("남자").charAt(0);
		
//		System.out.println("당신의 이름은 " + name + ", 키는 " + height + "cm, 성별은 " + gender + " 입니다.");
		// 문자 열 %s or %c / 숫자는 %f
		System.out.printf("당신의 이름은 %s, 키는 %.1fcm, 성별은 %c입니다.", name, height, gender);
		
		scanner.close();
	}
}
