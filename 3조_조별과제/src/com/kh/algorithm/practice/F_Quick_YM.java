package com.kh.algorithm.practice;

/*
 * 신영민 담당
 *  
 *  [정리 노트]
 * https://www.notion.so/a900f4725de24d7e861e948579cb2770
 *
 *	퀵 정렬(Quick Sort)
 * 	  - 분할 정복을 통해 구현
 * 	  -'피벗'을 하나 설정하고 피벗보다 작은 값들은 왼쪽에, 큰 값들은 오른쪽에 치중하도록 한다. (파티셔닝)
 * 	  - 시간복잡도(최악) : O(n^2) - 정렬 된 상태의 배열을 정렬하고자 할 때 (오름차순, 내림차순)
 *	  - 시간복잡도(최선) : O(n*logn) - 분할이 극단적으로 일어나지만 않는다면 대체로 수렴
 *    - 공간복잡도 : 주어진 배열 안에서 교환(swap)을 통해 정렬이 수행되므로 O(n)이다.
 * 
 * 	퀵 정렬 과정
 * 	  1. 피벗을 하나 선택한다.
 * 	  2. 피벗을 기준으로 양쪽에서 피벗보다 큰 값, 혹은 작은 값을 찾는다. 왼쪽에서부터는 피벗보다 큰 값을 찾고, 오른쪽에서부터는 피벗보다 작은 값을 찾는다.
 * 	  3. 양 방향에서 찾은 두 원소를 교환한다.
 * 	  4. 왼쪽에서 탐색하는 위치와 오른쪽에서 탐색하는 위치가 엇갈리지 않을 때 까지 2번으로 돌아가 위 과정을 반복한다.
 * 	  5. 엇갈린 기점을 기준으로 두 개의 부분리스트로 나누어 1번으로 돌아가 해당 부분리스트의 길이가 1이 아닐 때 까지 1번 과정을 반복한다. (Divide : 분할)
 * 	  6. 인접한 부분리스트끼리 합친다. (Conquer : 정복)
 */

public class F_Quick_YM {
	
	// 구현 코드
	/**
	 *  피벗 선택 방식
	 * @param a		정렬할 배열
	 * @param lo	현재 부분배열의 왼쪽
	 * @param hi	현재 부분배열의 오른쪽
	 */
	
	/**
	 * pivot을 기준으로 파티션을 나누기 위한 정렬 메소드
	 * 
	 * @param a		정렬 할 배열 
	 * @param left	현재 배열의 가장 왼쪽 부분
	 * @param right	현재 배열의 가장 오른쪽 부분
	 * @return		최종적으로 위치한 피벗의 위치를 반환
	 */
	
	
	// 왼쪽 피벗 선택 방식
	public void QuickSort1(int[] a) {
		l_pivot_sort(a, 0, a.length - 1);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	private static void l_pivot_sort(int[] a, int lo, int hi) {
		
		if(lo >= hi) {	
			return;		// lo가 hi보다 크거나 같다면 정렬 할 원소가 1개 이하이므로 정렬하지 않고 return한다.
		}
		
		int pivot = partition1(a, lo, hi);	
		
		l_pivot_sort(a, lo, pivot - 1);		// 피벗을 기준으로 왼쪽 리스트를 다시 분할, 정복
		l_pivot_sort(a, pivot + 1, hi);		// 피벗을 기준으로 오른쪽 리스트를 다시 분할, 정복
	}

	private static int partition1(int[] a, int left, int right) {
		
		int lo = left;
		int hi = right;
		int pivot = a[left];		// 부분리스트의 왼쪽 요소를 피벗으로 설정
		
		while(lo < hi) {			// lo가 hi보다 작을 때 까지만 반복한다.
			while(a[hi] > pivot && lo < hi) {
				
				hi--;				// hi가 lo보다 크면서, hi의 요소가 pivot보다 작거나 같은 원소를 찾을 때 까지 hi를 감소시킨다.
			}
			while(a[lo] <= pivot && lo < hi) {
				
				lo++;				// hi가 lo보다 크면서, lo의 요소가 pivot보다 큰 원소를 찾을 때 까지 lo를 증가시킨다.
			}
			lSwap(a, lo, hi);		// 교환 될 두 요소를 찾았으면 두 요소를 바꾼다.
		}
		
		lSwap(a, left, lo);			// 마지막으로 맨 처음 pivot으로 설정했던 위치(a[left])의 원소와 lo가 가리키는 원소를 바꾼다.
		
		return lo;					// 두 요소가 교환되었다면 피벗이었던 요소는 lo에 위치하므로 lo를 반환한다.
	}
 
	private static void lSwap(int[] a, int i, int j) {
		int temp = a[i];	// i의 값을 임시로 저장할 변수 temp 선언, i의 값을 저장
		a[i] = a[j];		// j의 값을 변수 i에 저장
		a[j] = temp;		// 변수 temp에 저장된 기존의 i의 값을 변수 j에 저장
	}
	
	
	
	
	
	// 오른쪽 피벗 선택 방식
	public void QuickSort2(int[] a) {
		r_pivot_sort(a, 0, a.length - 1);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	private static void r_pivot_sort(int[] a, int lo, int hi) {

		if(lo >= hi) {	
			return;		// lo가 hi보다 크거나 같다면 정렬 할 원소가 1개 이하이므로 정렬하지 않고 return한다.
		}
				
		int pivot = partition2(a, lo, hi);	
		
		r_pivot_sort(a, lo, pivot - 1);		// 피벗을 기준으로 왼쪽 리스트를 다시 분할, 정복
		r_pivot_sort(a, pivot + 1, hi);		// 피벗을 기준으로 오른쪽 리스트를 다시 분할, 정복
	}
	
	private static int partition2(int[] a, int left, int right) {
		
		int lo = left;
		int hi = right;
		int pivot = a[right];		// 부분리스트의 오른쪽 요소를 피벗으로 설정
		
		while(lo < hi) {			// lo가 hi보다 작을 때 까지만 반복한다.
			
			while(a[lo] < pivot && lo < hi) {
				
				lo++;				// hi가 lo보다 크면서, lo의 요소가 pivot보다 큰 원소를 찾을 때 까지 lo를 증가시킨다.
			}
			while(a[hi] >= pivot && lo < hi) {
				
				hi--;				// hi가 lo보다 크면서, hi의 요소가 pivot보다 작거나 같은 원소를 찾을 때 까지 hi를 감소시킨다.
			}
			
			rSwap(a, lo, hi);		// 교환 될 두 요소를 찾았으면 두 요소를 바꾼다.
		}
		
		rSwap(a, right, hi);		// 마지막으로 맨 처음 pivot으로 설정했던 위치(a[right])의 원소와 hi가 가리키는 원소를 바꾼다.
		
		return hi;					// 두 요소가 교환되었다면 피벗이었던 요소는 hi에 위치하므로 hi를 반환한다.
	}
	
	private static void rSwap(int[] a, int i, int j) {
		int temp = a[i];	// i의 값을 임시로 저장할 변수 temp 선언, i의 값을 저장
		a[i] = a[j];		// j의 값을 변수 i에 저장
		a[j] = temp;		// 변수 temp에 저장된 기존의 i의 값을 변수 j에 저장
	}
	
	
	
	
	
	// 중간 피벗 선택 방식
	public void QuickSort3(int[] a) {
		m_pivot_sort(a, 0, a.length - 1);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	private static void m_pivot_sort(int[] a, int lo, int hi) {
		
		if(lo >= hi) {	
			return;		// lo가 hi보다 크거나 같다면 정렬 할 원소가 1개 이하이므로 정렬하지 않고 return한다.
		}
	
		int pivot = partition3(a, lo, hi);
		
		m_pivot_sort(a, lo, pivot);			// 피벗을 기준으로 왼쪽 리스트를 다시 분할, 정복
		m_pivot_sort(a, pivot + 1, hi);		// 피벗을 기준으로 오른쪽 리스트를 다시 분할, 정복
	}
	
	private static int partition3(int[] a, int left, int right) {
		
		int lo = left - 1;
		int hi = right + 1;		// lo와 hi는 각각 배열의 끝에서 1 벗어난 위치부터 시작한다.
		int pivot = a[(left + right) / 2];		// 부분리스트의 중간 요소를 피벗으로 설정
		
		while(true) {
		
			do { 
				lo++; 			// 1 증가시키고 난 뒤의 lo 위치의 요소가 pivot보다 큰 요소를 찾을 때 까지 반복한다.
			} while(a[lo] < pivot);			
 
			
			do {
				hi--;			//1 감소시키고 난 뒤의 hi 위치가 lo보다 크거나 같은 위치이면서 hi위치의 요소가 pivot보다 작은 요소를 찾을 때 까지 반복한다.
			} while(a[hi] > pivot && lo <= hi);
			
			if(lo >= hi) {
				return hi;		// 만약 hi가 lo보다 크지 않다면(엇갈린다면) swap하지 않고 hi를 리턴한다.
			}
			
			mSwap(a, lo, hi);	// 교환 될 두 요소를 찾았으면 두 요소를 바꾼다.
		}
	}

	private static void mSwap(int[] a, int i, int j) {
		int temp = a[i];	// i의 값을 임시로 저장할 변수 temp 선언, i의 값을 저장
		a[i] = a[j];		// j의 값을 변수 i에 저장
		a[j] = temp;		// 변수 temp에 저장된 기존의 i의 값을 변수 j에 저장
	}
}
