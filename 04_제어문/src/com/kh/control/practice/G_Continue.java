package com.kh.control.practice;

public class G_Continue {
	/*
	 * continue 문 
	 * 
	 * 	[표현법]
	 * 		반복문(조건식) {
	 * 		[continue;]
	 * 		}
	 * 	- continue 문은 반복문 안에서만 사용이 가능 
	 * 	- 반목문 안에서 continue 문을 만나게 되면 다음 구문들을 실행하지 않고 
	 * 	  continue 문이 포함되어 있는 반복문의 조건식 또는 증감식으로 이동 
	 */
	public void method1() {
		// 1부터 100까지의 정수들의 합을 출력하시오.
		// 단, 5의 배수는 제외하고 덧셈 연산을 한다.
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % 5 == 0) {
				continue;
			}
			
			sum += i; // sum = sum + i
			
		}
		
		System.out.printf("합계 : %d\n", sum);
	}
	
	public void method2() {
		// 구구단을(2 ~ 9단) 출력하시오.
		// 단, 홀수단을 빼고 출력한다.
		
		for(int i = 2; i <= 9; i++) {
			
			if(i % 2 != 0) {
				continue;
			}
			
			System.out.printf("== %d단 ==\n", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n", i, j, (i*j));
			}
			
			System.out.println();
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
