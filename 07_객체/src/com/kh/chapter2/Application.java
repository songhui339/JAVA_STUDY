package com.kh.chapter2;

import com.kh.chapter2._class.Person;
//import com.kh.chapter2._class.Phone; // is not visible 이라는 에러가 남 
// 완전히 동일한 패키지에서만 사용이 가능 

public class Application {

	public static void main(String[] args) {
		Person person = new Person();
		
		// 필드 값을 변경을 원하지 않는 경우 setter를 만들지 않음 
		person.setName("최송희");
		person.setAge(29);
		person.setPhone("갤럭시Z플립", "보라", "삼성");
		
		// 호출하기 
		person.whoAreYou();
	}

}
