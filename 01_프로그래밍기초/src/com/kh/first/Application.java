package com.kh.first;

import com.kh.first.practice.ValuePrinter;

/*
 * 주석(Comment)
 *   - 소스 코드와는 무관하고 코드로 인식되지 않는다.
 *   - 주로 코드에 대한 설명을 작성할 때 사용한다.
 */

// 한 줄 주석
// 추가로 주석 작성

// 클래스명은 자바 파일명과 동일해야 한다.
// 실행 클래스
public class Application {
	// 실행 메소드
	// 프로그램의 시작점으로 java.exe가 Application.class를 실행시킬 때 제일먼저 실행되는 메소드이다.
	public static void main(String[] args) {
		// 1) 실행할 메소드가 있는 클래스를 생성(new)해야 한다.
		// [표현법]
		//   클래스명 사용할이름 = new 클래스명();
		
		// 방법 1) import 문을 사용하지 않고 클래스 생성 
		// com.kh.first.practice.ValuePrinter printer = new com.kh.first.practice.ValuePrinter();
		
		// 방법 2) import 문을 사용하여 클래스 생성
		//   - ctrl + space 키를 누르면 자동 완성 기능을 통해서 import 문을 자동으로 넣어준다.
		//   - ctrl + shift + o 키를 누르면 자동으로 import 문을 정리해준다.
		//   - ctrl + . 키를 누르면 에러가 발생한 곳으로 이동한다.
		//     ctrl + 1 키를 누르면 해당 에러에 대한 해결 방법을 제시해준다.
		ValuePrinter printer = new ValuePrinter();
		
		// 2) 생성한 클래스로 메소드 실행(호출)
		// [표현법]
		//   사용할이름.실행할메소드명();
		printer.print();
	}
	
	
	
	
	
	
	
	
	
	
	

}