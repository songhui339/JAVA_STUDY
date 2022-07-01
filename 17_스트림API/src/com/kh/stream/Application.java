package com.kh.stream;

import com.kh.stream.basic.A_Create;

public class Application {

	public static void main(String[] args) {
		/*
		 * Stream API
		 * 	- 스트림은 자바 8부터 추가된 기능으로 컬렉션 또는 배열의 요소들을 하나씩 참조해서 
		 *    람다식으로 처리할 수 있도록 해주는 반복자이다. (iterator 생각하면 됨)
		 * 	- 스트림은 Iterator과 비슷한 역할을 하지만 람다식으로 요소를 처리하는 코드를 제공할 수 있고,
		 *    내부 반복자를 사용해서 병렬 처리와 중간 처리, 최정 처리 작업을 수행할 수 있다.
		 * 	- 스트림은 컬렉션(배열) 요소에 대해서 중간 처리와 최종 처리 작업을 할 수 있다.
		 */

		new A_Create().method1();
	}

}
