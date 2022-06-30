package com.kh.chapter3._interface;

// 인터페이스끼리 상속 가능 
public interface Basic3 extends Basic, Basic2 {
	void turnOn();
	void turnOff();
}
