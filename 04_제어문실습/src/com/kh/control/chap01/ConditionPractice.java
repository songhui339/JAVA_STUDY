package com.kh.control.chap01;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		int num = 0;
		String menu = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		num = scanner.nextInt();
		
		switch(num) {
		case 1 : 
			menu = "입력 메뉴입니다.";
			
			break;
		case 2 :
			menu = "수정 메뉴입니다.";
			
			break;
		case 3 :
			menu = "조회 메뉴입니다.";
			
			break;
		case 4 : 
			menu = "삭제 메뉴입니다.";
			
			break;
		case 9 : 
			System.out.println("프로그램이 종료됩니다.");
			
			return;
		default : 
			System.out.println("잘못된 입력입니다.");
			
			return;
		}
		
		System.out.println(menu + "메뉴입니다.");
		
		
		scanner.close();
		
	}

	
	public void practice2() {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		num = scanner.nextInt();
		
//		if(num % 2 == 0 && num >= 0) {
//			System.out.println("짝수다");
//		} if (num % 2 != 0 && num >= 0) {
//			System.out.println("홀수다");
//		} else {
//			System.out.println("양수만 입력해주세요.");
//		}
		
		if (num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
	}


	public void practice3() {
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		int avg = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		kor = scanner.nextInt();
		
		System.out.print("수학점수 : ");
		math = scanner.nextInt();
		
		System.out.print("영어점수 : ");
		eng = scanner.nextInt();
		
		sum = kor + math + eng;
		avg = sum / 3;
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("수학 : %d\n", math);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("합계 : %d\n", sum);
			System.out.printf("평균 : %d\n", avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		
		scanner.close();
		
	}

	
	public void practice4() {
		int month = 0;
		String monthName = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		month = scanner.nextInt();
		
		switch (month) {
			case 12 : 
			case 1 :
			case 2 : 
				monthName = "겨울";
				
				break;
			case 3 : 
			case 4 :
			case 5 :
				monthName = "봄";
				
				break;
			case 6 : 
			case 7 : 
			case 8 : 
				monthName = "여름";
				
				break;
			case 9 :
			case 10 :
			case 11 : 
				monthName = "가을";
				
				break;
			default : 
				System.out.printf("%d월은 잘못 입력된 달입니다.", month);
				
				scanner.close();
				
				return;
		}
		
		System.out.printf("%d월은 %s입니다.", month, monthName);
		
	}
	
	
	public void practice5() {
		String id = null;
		String pw = null;
		String userId = "ismoon";
		String userPw = "1234";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		id = scanner.nextLine();
		
		System.out.print("비밀번호 : ");
		pw = scanner.nextLine();
		
		if (id.equals(userId) && pw.equals(userPw)) {
			System.out.println("로그인 성공");
		} else if (id.equals(userId)) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else if (pw.equals(userPw)) {
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("모두 틀렸습니다.");
		}
		
		scanner.close();
		
	}
	
	public void practice6() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		
		switch(scanner.nextLine()) {
		 	case "관리자" : 
		 		System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		 		
		 		break;
		 	case "회원" : 
		 		System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		 		
		 		break;
		 	case "비회원" : 
		 		System.out.println("게시글 조회");
		 		
		 		break;
		 	default : 
		 		System.err.println("잘못 입력했습니다.");
		 		
		 		return;
		 		
		}
		
		scanner.close();
		
	}
	
	
	public void practice7() {
		double height = 0.0;
		double weight = 0.0;
		double bmi = 0.0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요. : ");
		height = scanner.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요. : ");
		weight = scanner.nextDouble();
		
		bmi = weight / (height * height) ;
		
		System.out.printf("BMI 지수 : %f\n", bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi < 25) {
			System.out.println("과체중");
		} else if (bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도 비만");
		}
		
	}
	

	public void practice8() {
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		char op = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		num1 = scanner.nextInt();
		System.out.print("피연산자2 입력 : ");
		num2 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		op = scanner.nextLine().charAt(0);
		
		if (num1 >= 0 && num2 >= 0) {
			switch(op) {
				case '+' : 
					result = num1 + num2;
					
					break;
					
				case '-' :
					result = num1 - num2;
					
					break;
				case '*' : 
					result = num1 * num2;
					
					break;
				case '/' : 
					result = num1 / num2;
					
					break;
				case '%' : 
					result = num1 % num2;
					
					break;
				default : 
					System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
					
					return;
			}
		} else {
			System.out.println("양수가 아닌 값을 입력하셨습니다. 프로그램을 종료합니다.");
			
			return;
		}
		
		System.out.printf("%d %c %d = %d", num1, op, num2, result);
	
		
		
	}
	
	
	public void practice9() {
		double midScore = 0.0;
		double finalScore = 0.0;
		double homework = 0.0;
		double attendance = 0.0;
		double sum = 0.0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		midScore = scanner.nextInt() * 0.2;
		
		System.out.print("기말 고사 점수 : ");
		finalScore = scanner.nextInt() * 0.3;
		
		System.out.print("과제 점수 : ");
		homework = scanner.nextInt() * 0.3;
		
		System.out.print("출석 횟수 : ");
		attendance = scanner.nextInt();
		
		sum = midScore + finalScore + homework + attendance;
		
		System.out.println("===========결과==========");
		
		if(sum >= 70 && attendance >= 20 * 0.7) {
			System.out.printf("중간 고사 점수 (20) : %f\n", midScore);
			System.out.printf("기말 고사 점수 (30) : %f\n", finalScore);
			System.out.printf("과제 점수 (30) : %f\n", homework);
			System.out.printf("출석 점수 (20) : %f\n", attendance);
			System.out.printf("총점 : %f\n", sum);
			System.out.println("PASS");
		} else {
			if (attendance < 20 * 0.7) {
				System.out.printf("FAIL [출석 횟수 부족] (%.0f/20)\n", attendance);
			}
			
			if (sum < 70) {
				System.out.printf("FAIL [점수 미달] (총점 %.1f)\n", sum);
			}
		}
		
		
	}
	
	
	public void practice10() {
		int menu = 0;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.print("선택 : ");
		menu = scanner.nextInt();
		
		switch(menu) {
			case 1 :
				practice1();
				
				break;
			case 2 : 
				practice2();
				
				break;
			case 3 :
				practice3();
				
				break;
			case 4 :
				practice4();
				
				break;
			case 5 :
				practice5();
				
				break;
			case 6 :  
				practice6();
				
				break;
			case 7 : 
				practice7();
				
				break;
			case 8 : 
				practice8();
				
				break;
			case 9 : 
				practice9();
				
				break;
			default : 
				System.out.println("1~9 사이의 숫자를 입력해주세요.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
