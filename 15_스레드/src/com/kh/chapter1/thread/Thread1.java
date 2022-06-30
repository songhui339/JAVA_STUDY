package com.kh.chapter1.thread;


/*
 * 스레드 생성 방법 #1
 * 
 * 1. Thread 클래스를 상속 받는 방법 
 * 		- Thread 클래스를 상속 후에 run() 메소드를 오버라이딩 한다.
 * 		- Thread 클래스를 상속하는 자식 클래스의 객체를 생성 후 start() 메소드를 호출 
 */
public class Thread1 extends Thread {

	@Override
	public void run() {
		// 작업하고자 하는 코드를 작성 
		
		for (int i = 1; i <= 1000; i++) {
			System.out.println(getName() + "[" + i + "]");
		}
		
	}
	
	

}
