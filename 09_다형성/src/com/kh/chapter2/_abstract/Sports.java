package com.kh.chapter2._abstract;

public abstract class Sports {
	// 참여 하는 사람의 수 
	private int numberOfPlayers; 
	
	public Sports() {
	}
	

	public Sports(int numberOfPlayers) {
		super();
		this.numberOfPlayers = numberOfPlayers;
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	// 스포츠마다 적용될 룰을 추상 메소드로 정의 
	public abstract void rule();
	
	

}
 