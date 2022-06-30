package com.kh.chapter2._abstract;

public class FootBall extends Sports {

	public FootBall() {
	}
	
	public FootBall(int numberOfPlayers) {
		super(numberOfPlayers);
	}




	@Override
	public void rule() {
		System.out.println("FootBall의 선수의 수는 " + super.getNumberOfPlayers() 
		+ "명, 공을 차서 골대에 넣어야한다.");

	}

}
