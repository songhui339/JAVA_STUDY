package com.kh.chapter1;

import com.kh.chapter1.encapsulation.Student;

public class Application {
	
	/*
	 * [4월7일 4교시]
	 * 추상화 캡슐화 
	 * 
	 * 1. 추상화 
	 * 	- 프로그램에서 사용할 객체들이 가진 공통의 특성을 파악하고 불필요한 특성을 제거하는 과정 
	 * 	- 최종적으로 선정된 속성들을 가지고 어떠한 자료형으로, 어떠한 필드명으로 사용할지 정리해 코드로 작성하는 것을 말한다 
	 * 
	 * 2. 캡슐화 
	 * 	- 추상화를 통해서 정의된 속성들과 기능을 하나로 묶어서 관리하는 기법 
	 * 	- 객체의 필드, 메소드를 하나로 묶고 실제 구현 내용을 감추는 것을 말한다.
	 * 	- 객체의 데이터에 직접 접근을 막고, 데이터를 간접적으로 처리하는 메소드들을 클래스 내부에 작성하여 제공하는 방법 
	 * 
	 */

	public static void main(String[] args) {
		// 최송희 학생 객체 생성 
		int sNum1 = 1001;
		String name1 = "최송희";
		int age1 = 20;
		int math1 = 90;
		int eng1 = 80;
		int sum1 = math1 + eng1;
		double avg1 = sum1 / 2;
		
		// 이슬기 학생 객체 생성 
		int sNum2 = 1002;
		String name2 = "이슬기";
		int age2 = 28;
		int math2 = 70;
		int eng2 = 65;
		int sum2 = math2 + eng2;
		double avg2 = sum2 / 2;
		// 관리가 너무 어려움!!!!!!!!
		
		
		// Student 클래스를 new 연산자를 통해서 Heap 영역에 인스턴스로 생성 
//		Student choi = new Student(); // 인스턴스(객체) 생성 
//		Student lee = new Student();
		
		// 필드에 직접 접근해서 초기화 
//		choi.sNum = 1001;
//		choi.name = "최송희";
//		choi.age = 20;
//		choi.math = 90;
//		choi.eng = 80;
//		
//		lee.sNum = 1002;
//		lee.name = "이슬기";
//		lee.age = 31;
//		lee.math = 100;
//		lee.eng = 65;
//		
//		// 필드에 직접 접근해서 값을 출력 
//		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d, 총점은 %d, 평균은 %.2f입니다. \n", 
//				choi.name, choi.math, choi.eng, choi.sum(), choi.avg());
//		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d, 총점은 %d, 평균은 %.2f입니다. \n", 
//				lee.name, lee.math, lee.eng, lee.sum(), lee.avg());
//		
		
		Student choi = new Student(); 
		Student lee = new Student(); 
		
//		com.kh.chapter1.abstraction.Student moon2 = new com.kh.chapter1.abstraction.Student(); 
		// 같은 이름의 다른 클래스를 사용하려면 위와 같이 패키지명을 포함한 클래스명을 작성해야 한다. 
		
		// 캡슐화를 사용하면 직접 접근이 불가능하다.
//		choi.sNum = 1001; -> 오류 뜸 
		
		// 캡슐화 작업으로 인해 필드에 직접 접근을 막았다면 간접적으로 접근을 할 수 있도록 메소드를 제공해야 한다.
		choi.setsNum(1001);
		choi.setName("최송희");
		choi.setAge(20);
		choi.setMath(90);
		choi.setEng(80);
		
		lee.setsNum(1002);
		lee.setName("이슬기");
		lee.setAge(32);
		lee.setMath(80);
		lee.setEng(65);
		
		
//		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d, 총점은 %d, 평균은 %.2f입니다. \n", 
//		choi.getName(), choi.getMath(), choi.getEng(), choi.sum(), choi.avg());
//		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d, 총점은 %d, 평균은 %.2f입니다. \n", 
//		lee.getName(), lee.getMath(), lee.getEng(), lee.sum(), lee.avg());
		
		System.out.println(choi.information());
		System.out.println(lee.information());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
