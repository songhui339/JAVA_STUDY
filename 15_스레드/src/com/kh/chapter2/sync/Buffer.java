package com.kh.chapter2.sync;

public class Buffer {

	private int data;
	
	// 플래그 변수 (객체의 상태를 저장하고 흐름을 제어하기 위한 변수)
	private boolean empty = true;
	
	public synchronized void getData() {
		while(empty) {
			try {
				wait(); // 객체의 잠금을 풀고 스레드를 일시 정지 상태로 만든다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		System.out.println("소비자가 " + this.data + "번 상품을 소비했습니다.");
		
		this.empty = true;
		notify(); // wait() 에 의해 일시정지된 스레드 중 한 개를 실행 대기 상태로 만든다.
	}
	
	
	public synchronized void setData(int data) {
		while(!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.data = data;
		this.empty = false;
		
		System.out.println("생산자가 " + this.data + "번 상품을 생산했습니다.");
		notify();
	}
}
