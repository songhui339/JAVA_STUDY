package com.kh.chapter1;

import com.kh.chapter1.thread.Thread1;
import com.kh.chapter1.thread.Thread2;

public class Application {

	public static void main(String[] args) {
		System.out.println("메인 스레드 실행");
		
		Thread th1 = new Thread1();		
		
//		th1.setPriority(1);
		// 우선 순위 설정 
		th1.setPriority(Thread.MAX_PRIORITY);
		
//		th1.run();
		th1.start(); // 새로운 흐름을 생성해서 실행 
		
		
		Thread th2 = new Thread(new Thread2());
		th2.setPriority(Thread.MIN_PRIORITY);
		
		th2.start();
		
		
		// 익명 구현 객체를 사용하는 방법 
		Thread th3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for (int i = 1; i <= 1000; i++) {
					System.out.println(Thread.currentThread().getName() + "[" + i + "]");
				}
				
			}
		});
		
		th3.start();
		
		// 람다식을 사용하는 방법 *참고용
		Thread th4 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				System.out.println(Thread.currentThread().getName() + "[" + i + "]");
			}
		});
		
		th4.start();
		
		// join() 메소드는 스레드가 종료가 되길 기다림 
		try {
			th1.join();
			th2.join();
			th3.join();
			th4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("메인 스레드 종료");
	}

}
