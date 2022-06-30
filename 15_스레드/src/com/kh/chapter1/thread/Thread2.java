package com.kh.chapter1.thread;

/*
 * Thread 생성 방법 #2
 * 
 * 2. Runnable 인터페이스를 구현하는 방법 
 * 		- Runnable 인터페이스를 구현 후에 run() 추상메소드를 오버라이딩 한다.
 * 		- Runnable 인터페이스를 구현하는 구현 클래스의 객체를 생성 후 
 * 		  Thread 클래스의 생성자로 전달하면 된다.
 * 		- 생성된 Thread 객체의 start() 메소드를 호출한다.
 */
public class Thread2 implements Runnable{

	@Override
	public void run() {
		
		// 작업하고자 하는 코드 작성 
		for (int i = 1; i <= 1000; i++) {
			System.out.println(Thread.currentThread().getName() + "[" + i + "]");
		}
	}

}
