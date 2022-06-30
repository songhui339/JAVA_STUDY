package com.kh.chapter3.field;

/*
 * 상수 (static final)
 * 
 * 	[표현법]
 * 		public static final 상수명 = 값;
 * 
 * 	- static과 final의 순서는 상관 없으며 선언과 동시에 초기화 해주어야한다. 
 * 	  (static 블록으로 초기화 가능)
 * 	- 초기화 해주고 값을 변경할 수 없기때문에 setter가 필요 없다.
 * 	- public으로 선언되었기 때문에 getter도 필요 없다.
 * 	- 상수의 이름은 모두 대문자로 작성하는 것이 관례이다. (암묵적인 약속)
 *    만약 서로 다른 단어가 혼합된 이름이라면 언더바(_)로 단어들을 연결한다. (카멜방식 X)
 *    
 */

public class C_StaticFianlField {
	public static final int MAX_LEVEL = 90;
	

}
