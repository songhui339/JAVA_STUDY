package com.kh.algorithm;

import com.kh.algorithm.practice.A_SelectionSort_YR;
import com.kh.algorithm.practice.B_Bubble_SH;
import com.kh.algorithm.practice.C_InsertionSort_SH;
import com.kh.algorithm.practice.D_MergeSort_CH;
import com.kh.algorithm.practice.E_Counting_SH;

public class Application {

	public static void main(String[] args) {
		new A_SelectionSort_YR().selectionSort();
		
		new B_Bubble_SH().bubble1();
		
		new C_InsertionSort_SH().method();
		
		int[] arr = {4, 8, 150, 123, 1, 36, 24, 85, 9, 200};
		
		D_MergeSort_CH Sort = new D_MergeSort_CH();
		
		Sort.mergeSort(arr);
		
		new E_Counting_SH().CountingSort();

	}

}
