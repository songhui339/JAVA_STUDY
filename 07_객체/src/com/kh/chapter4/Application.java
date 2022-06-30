package com.kh.chapter4;

import com.kh.chapter4.constructor.User;

public class Application {

	public static void main(String[] args) {
		// 왜 클래스를 타입이라고 하냐...
//		자료형  변수명 = 초기화;
//		여러 자료형의 데이터들을 모아서 새로운 자료형을 만들었기때문에 
//		= 사용자 정의 자료형이라고 한다.
		User user = null;
		// 기본 생성자로 객체 생성 
		user = new User();
		
		System.out.println(user.information());
		
		// 매개 변수가 있는 생성자로 객체 생성 (3개의 값 생성자로 전달)
		user = new User("sh.choi", "1234", "최송희");
		
		System.out.println(user.information());
		
		// 매개 변수가 있는 생성자로 객체 생성 (5개의 값 생성자로 전달)
		user = new User("sh.choi", "1234", "최송희", 29, '여');
		
		System.out.println(user.information());

	}

}
