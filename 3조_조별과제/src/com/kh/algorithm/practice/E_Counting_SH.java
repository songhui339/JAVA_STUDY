package com.kh.algorithm.practice;
/*
 * 최송희 담당 
 * 계수 정렬 (Counting sort)
 * 	- 카운팅 정렬은 시간복잡도가 𝚶(𝑛)으로 속도가 빠른 알고리즘
 * 	- 퀵 정렬, 합병 정렬의 평균 시간복잡도는 𝚶(nlogn)인데 카운팅 정렬은 속도가 아주 우수한 편 
 * 	- 데이터끼리 직접 비교하는 기본적인 정렬과는 어떤 다른 방식으로 작동되는지 아래에 설명 
 * 	 기본 매커니즘 :데이터의 값이 몇번 나왔는지 세주는 것
 * 
 * [정리 노트]
 * https://sssongxi.notion.site/a7829c3e232341bfb7e3e156f121583c
 */
public class E_Counting_SH {
	
	public void CountingSort() {
		
		// 1. 배열 선언 
		int[] array = new int[11]; // 수열의 원소 : 10개
		int[] counting = new int[8]; // 수의 범위 0 ~ 7
		int[] result = new int[11]; // 정렬 될 배열
		
		for(int i =0; i <array.length; i++) {
			array[i] = (int)(Math.random()*8); // 0 ~ 7 사이의 랜덤 숫자 
		}
		
		// 과정 1
		for(int i = 0; i < array.length; i++) {
			// array의 value값을 index로 하는 counting 배열 값 1 증가 
			counting[array[i]]++;
		}
		
		// 과정 2
		for(int i = 1; i < counting.length; i++) {
			// 누적 합 해주기 
			counting[i] += counting[i - 1];
		}
		
		// 과정 3 
		for(int i = array.length - 1; i >= 0; i--) {
			/*
			 *  i 번쨰 원소를 인덱스로 하는 counting 배열을 1 감소시킨 뒤 
			 *  counting 배열의 값을 인덱스로 하여 result에 value 값을 저장한다.
			 */
			int value = array[i];
			counting[value]--;
			result[counting[value]] = value;
		}
		
		// 초기 배열 
		System.out.println("array[]"); 
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println("\n\n");
		
		// Counting 배열 
		System.out.println("counting[]");
		for(int i = 0; i < counting.length; i++) {
			System.out.print(counting[i] + "\t");
		}
		System.out.println("\n\n");
		
		// 정렬된 배열
		System.out.println("result[]");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + "\t");
		}
		System.out.println();

	}

}
