package com.kh.chapter3._interface;

public interface Basic {
	// 인터페이스에서 필드는 무조건 상수 필드이다.
	// public static final이 생략 가능
	/* public static final */ int NUM = 10;
	
	// 인터페이스에서 메소드는 무조건 추상 메소드이다.
	// public abstract 생략 가능 
	/* public abstract */void turnOn();
	/* public abstract */void turnOff();

}
