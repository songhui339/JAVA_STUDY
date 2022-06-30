package com.kh.chapter5;

import com.kh.chapter4.constructor.User;
import com.kh.chapter5.method.A_Method;
import com.kh.chapter5.method.C_StaticMethod;

public class Application {

	public static void main(String[] args) {
		A_Method method = new A_Method();
		
		// 1. 매개 변수가 없고 반환값도 없는 메소드 call
		method.method1();
		
		// 2. 매개 변수가 없고 반환값은 있는 메소드 
		String str = method.method2();
		System.out.println(str);
		
		// 3. 매개 변수가 있고 반환값이 없는 메소드 
		method.method3(10, 12);
		
		// 4. 매개 변수가 있고 반환값이 없는 메소드 
//		int result = method.method4(20, 30);
//		System.out.println(result);
		System.out.println(method.method4(20, 30));
		
		// 5. 매개 변수로 User 객체를 전달 받는 메소드 
		User user = new User();
		
		System.out.println(user.information());
		method.method5(user);
		
		System.out.println(user.information());
		
		
		// 6. 매개 변수로 가변 인자를 전달 받는 메소드 
		int[] arr = {1, 2, 3, 4};
		int[] arr2 = new int[0];
		
		method.method6(arr);
		
//		method.method6({1, 2, 3, 4}); // 오류 남 
		method.method6(new int[] {1, 2, 3, 4, 5});
		
//		System.out.println();
//		method.method7(1, 2, 3, 4, 5);
//		method.method7(1, 2, 3);
//		method.method7(); // numbers = new int[0];
		
		System.out.println();
	
		method.method7("최송희", 1, 2, (1 + 2));
		
		System.out.println("==================");
		
		// 정적 메소드 (Static Method)
		// 1. 매개 변수와 반환값이 없는 메소드 호출 
		C_StaticMethod.method1();
		C_StaticMethod.method1();
		
		System.out.println();
		
//		정적 멤버는 객체 참조 변수로도 접근이 가능하지만
//		정적 멤버는 클래스 이름으로 접근하는 것이 좋다.
//		new C_StaticMethod().method1();
		
		
		// 2. 매개 변수가 없고 반환값이 있는 메소드 호출 
		int result = 0;
		
		result = C_StaticMethod.method2();
		
		System.out.println(result);
		
		System.out.println();
		
		// 3. 매개 변수가 있고 반환값이 없는 메소드 호출 
		C_StaticMethod.method3(30);
		System.out.println();
		
		// 4. 매개 변수와 반환값이 있는 메소드 호출 
		result = C_StaticMethod.method4();
		
		System.out.println(result);
		
		System.out.println(C_StaticMethod.method4(8, 9));
		System.out.println(C_StaticMethod.method4(8, 9, 10, 20, 30));
	
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
