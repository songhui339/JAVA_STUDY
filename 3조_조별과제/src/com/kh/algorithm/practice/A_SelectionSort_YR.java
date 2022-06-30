package com.kh.algorithm.practice;

import java.util.Arrays;

/*
  	이예린 담당 
  	선택 정렬
 
	1. 주어진 리스트에서 최솟값을 찾는다.
	2. 최솟값을 맨 앞 자리의 값과 교환한다.
    3. 맨 앞 자리를 제외한 나머지 값들 중 최솟값을 찾아 위와 같은 방법으로 반복한다. 
    
    for i = 0 to n:
		a[i]부터 a[n - 1]까지 차례로 비교하여 가장 작은 값이 a[j]에 있다고 하자.
		a[i]와 a[j]의 값을 서로 맞바꾼다
		
	// i + 1번째 원소부터 선택한 위치(index)의 값과 비교를 시작한다.
	// 오름차순이므로 현재 선택한 자리에 있는 값보다 순회하고 있는 값이 작다면 위치(index)를 갱신해준다.
	// 서로 교환한다. (arr[indexMin], arr[i])	
	  
	[1]   9    4    6   11   10   3   15   2   13

	[1]  [2]   4    6   11   10   3   15   9   13

	[1]  [2]  [3]   6   11   10   4   15   9   13 

	. . .

	[1]  [2]  [3]  [4]  [6]  [9]  [10]  [11]  [13]  [15] 
*/
public class A_SelectionSort_YR {

	public void selectionSort() {
		int[] arr = {9, 12, 15, 20, 2};
		int indexMin, temp;


		
		for(int i = 0; i < arr.length-1; i++) {
			indexMin = i; 
			for(int j = i + 1; j < arr.length; j++) { 
				if (arr[j]< arr[indexMin]) {
				indexMin = j;
				}
			}
		
			temp = arr[indexMin];
			arr[indexMin] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
