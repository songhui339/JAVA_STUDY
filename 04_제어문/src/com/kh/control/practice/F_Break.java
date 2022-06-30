package com.kh.control.practice;

public class F_Break {
	/*
	 * break 문 
	 * 
	 *  [표현법]
	 * 		반복문/switch(조건식) {
	 * 			[break;] // 선택적으로 사용, 해당 구문을 빠져나가는 역할 
	 * 		}
	 * 
	 * 	- break 문은 반복문들과 switch 문의 실행을 중지하고 빠져나갈때 사용 
	 * 	- 반복문이 중첩되어 있는 경우 break 문이 포함되어 있는 반복문만 중지하고 빠져나간다 
	 */
	public void method1() {
		// 1부터 랜덤값 (1 ~ 10) 까지의 합계를 반복문을 통해서 출력 
		// 단, 랜덤값에 숫자 5가 나오면 프로그램을 종료 
		
		int sum;
		int random;
		
		while(true) {
			sum = 0;
			random = (int)(Math.random() *10 + 1);
			
			// 실제로 5가 나왔는지 확인하고 싶으면 Random값 추출 위에 올려두기 
			// 랜덤값을 가지고 온 다음에 break문 추가 
			if(random == 5) {
				break;
			}
			
			
			for(int i = 1; i <= random; i++) {
				sum += i;
			}
			
			System.out.printf("1부터 %d까지의 합계 : %d\n", random, sum);
		}
		System.out.printf("랜덤값이 %d이므로 프로그램을 종료합니다.", random);
	}

}
