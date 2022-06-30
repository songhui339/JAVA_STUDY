package com.kh.operator.practice;

public class F_Compound {
	/*
	 * 복합 대입 연산 
	 * - 다른 연산자와 대입 연산자를 함께 사용하는 연산자 
	 * - 내부적으로 연산 처리 속도가 빠르므로 사용을 권정한다 
	 * - 증감 연산자 (++, --)와 비슷해 보이지만 증감 연산자는 1씩 증감이 되고 
	 * 	 복합 대입 연산자는 내가 원하는 숫자만큼 값을 증감 시킬수 있다.
	 * 
	 * ex)
	 * 	  a + - 3; => a = a + 3;
	 * 	  a -= 3; => a = a - 3;
	 * 	  a *= 3; => a = a * 3;
	 * 	  a /= 3; => a = a / 3;
	 * 	  a %= 3; => a = a % 3;
	 * 	  
	 */
	
	public void method1() {
		int num = 12;
		String str = "Hello";
		
		num +=3; // num = num + 3;
		System.out.println("num += 3 는(은) " + num);
		
		num -=5; // num = num - 5;
		System.out.println("num -= 5 는(은) " + num);
		
		num *= 6; // num = num * 6;
		System.out.println("num *= 6 는(은) " + num);
		
		num /= 3; // num = num / 3;
		System.out.println("num /= 3 는(은) " + num);
		
		num %= 4; // num = num % 4;
		System.out.println("num %= 4 는(은) " + num);
		
		System.out.println();
		
		str += "World"; // str = str + "Word";
		System.out.println("str += \"World\" 는(은) " + str);
		
		str += 123; // str = str + 123;
		System.out.println("str += 123 는(은) " + str);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
