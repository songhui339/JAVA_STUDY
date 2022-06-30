package com.kh.lambda.basic.functional;

@FunctionalInterface
public interface A_FunctionalInterface {
	// 매개 변수와 반환값이 없는 추상 메소드
	public void method();
	
	// B_Functional -> 에러
//	public void otherMethod();
}
