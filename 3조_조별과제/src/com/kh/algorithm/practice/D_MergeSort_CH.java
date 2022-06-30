package com.kh.algorithm.practice;

/* 
 * 김철환 담당
 * 
 * 병합 정렬(Merge Sort)
 *   - 일반적인 방법으로 구현했을 때 안정 정렬에 속한다.
 *   - 어떤 문제를 분할 정복(큰 문제를 나누어 작은 문제로 만들고 작은 문제 부터 해결해 큰 문제를 해결)한다는 개념을 이용한 정렬 방법
 *   - 배열의 경우 나눌수 없을때(배열의 크기가 0 또는 1 일때)까지 나누어 부분리스트로 만들고(분할) 부분리스트를 비교하여 정렬한다.(정복)
 *   - 정렬 시 비교한 데이터를 정렬(저장)할 공간이 필요하며 원본 배열 외에 정렬한 데이터를 저장할 임시 배열이 필요하다.
 *   - 병합 정렬의 경우 시간복잡도는 O(nlogn), 공간복잡도는 O(n)이다.
 * 
 * 병합 정렬 과정 
 *   1. 배열의 길이가 0 또는 1이면 이미 정렬된 것으로 본다.
 *   2. 정렬되지 않은 배열을 절반으로 잘라 비슷한 크기의 두 부분 배열로 나눈다.
 *   3. 각 부분 배열을 재귀 호출을 이용해 위 과정을 더 이상 나눌 수 없을 때 까지 반복한다.
 *   4. 부분 배열을 정렬하면서 합친다.
 *   5. 임시 배열에 정렬이 완료되면 원본 배열에 대입한다.
 */

public class D_MergeSort_CH {
	
	private static int[] tempArr;			// 정렬한 데이터를 저장할 임시 배열을 클래스 변수로 선언
	
	public void mergeSort(int[] arr) {		// 병합 정렬을 실행하고 출력하기 위한 메소드
		
		tempArr = new int[arr.length];		// 원본 배열과 같은 크기로 임시배열 초기화
		
		mergeSort(arr, 0, arr.length - 1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}
	
	private static void mergeSort(int[] arr, int startIndex, int endIndex) {
		
		int middleIndex;
		
		if(endIndex - startIndex < 1) {		// 배열을 더 이상 나눌수 없는지 판단
			return;
		}
		
		middleIndex = (startIndex + endIndex) / 2; 	// 배열을 절반씩 나누기 위해 배열의 중간 인덱스값을 찾아 초기화
		
		// 재귀 호출(메소드 내부에 동일한 메소드를 사용하여 반복 호출시키는 방법) 사용시 
		mergeSort(arr, startIndex, middleIndex);	// 중간 인덱스를 기준으로 왼쪽 리스트를 재귀 호출을 통해 다시 분할, 정복
		mergeSort(arr, middleIndex + 1, endIndex);	// 중간 인덱스를 기준으로 오른쪽 리스트를 재귀 호출을 통해 다시 분할, 정복
		
		// 나눌 수 없는 부분배열 비교 합병
		merge(arr, startIndex, middleIndex, endIndex);
		
	}
	
	private static void merge(int[]arr, int startIndex, int middleIndex, int endIndex) {
		
		int leftIndex = startIndex;									// 왼쪽 부분 배열의 시작인덱스 (startIndex ~ middleIndex)
		int rightIndex = middleIndex + 1;							// 오른쪽 부분 배열의 시작인덱스 (middelIndex + 1 ~ endIndex)
		int tempIndex = startIndex;									// 임시 배열에 저장할 시작인덱스
		
		while(leftIndex <= middleIndex && rightIndex <= endIndex) {	// 양쪽 부분 배열의 시작인덱스의 값을 비교하여 작은 값을 찾고 임시배열에 대입
			if(arr[leftIndex] < arr[rightIndex]) {					// 값을 찾은 쪽 부분 배열의 인덱스를 증가시켜 순차적 으로 비교
				tempArr[tempIndex++] = arr[leftIndex++]; 			// 임시 배열의 인덱스 또한 증가시켜 임시배열에 순차적으로 정렬되도록 함
			}														// 부분 배열의 인덱스가 해당 배열의 마지막 인덱스를 넘게되면 해당 부분 배열의 정렬이 완료
			else {
				tempArr[tempIndex++] = arr[rightIndex++];
			}
		}
		
		//한쪽 부분배열이 모두 임시배열에 저장된 경우 남은 반대쪽 부분배열을 임시배열에 대입 
		if(leftIndex > middleIndex) {				// 왼쪽 배열이 모두 저장된 경우	
			while(rightIndex <= endIndex) {
				tempArr[tempIndex++] = arr[rightIndex++];				
			}			
		}
		else{
			while(leftIndex <= middleIndex) {		// 오른쪽 배열이 모두 저장된 경우
				tempArr[tempIndex++] = arr[leftIndex++];			
			}
		}
		
		// 정렬된 임시배열을 원본배열로 복사한다.
		for(int i = startIndex; i <= endIndex; i++) {
			arr[i] = tempArr[i];
		}
	}
}
