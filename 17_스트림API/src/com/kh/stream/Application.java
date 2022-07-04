package com.kh.stream;

import com.kh.stream.intermediate.B_Sorted;
import com.kh.stream.intermediate.C_Mapping;
import com.kh.stream.intermediate.D_Looping;
import com.kh.stream.terminal.A_Match;
import com.kh.stream.terminal.B_Aggregate;
import com.kh.stream.terminal.C_Collect;

public class Application {

	public static void main(String[] args) {
		/*
		 * Stream API
		 * 	- 스트림은 자바 8부터 추가된 기능으로 컬렉션 또는 배열의 요소들을 하나씩 참조해서 
		 *    람다식으로 처리할 수 있도록 해주는 반복자이다. (iterator 생각하면 됨)
		 * 	- 스트림은 Iterator과 비슷한 역할을 하지만 람다식으로 요소를 처리하는 코드를 제공할 수 있고,
		 *    내부 반복자를 사용해서 병렬 처리와 중간 처리, 최정 처리 작업을 수행할 수 있다.
		 * 	- 스트림은 컬렉션(배열) 요소에 대해서 중간 처리와 최종 처리 작업을 할 수 있다.
		 * 
		 */

		/* 1) 생성 */
//		new A_Create().method1();
//		new A_Create().method2();
//		new A_Create().method3();
		
		/* 2) 중간 처리 함수 */
//		new A_Filtering().method1();
//		new A_Filtering().method2();
		
//		new B_Sorted().method1();
//		new B_Sorted().method2();
		
//		new C_Mapping().method1();
//		new C_Mapping().method2();
//		new C_Mapping().method3();
		
//		new D_Looping().method1();
		
		
		/* 3) 최종 처리 함수 */
//		new A_Match().method1();
//		new A_Match().method2();
		
//		new B_Aggregate().method1();
		
		new C_Collect().method1();
		
	
	}

}
