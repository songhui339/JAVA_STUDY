package com.kh.datastructure.practice;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 김철환 담당
 * 
 * 힙(Heap)
 * 
 * - 이진 트리(Binary Tree)의 응용 버전
 * - 일차원 배열로 구현
 * - 일반적으로 그룹을 정렬(Sort)하거나 입력된 데이터 안에서 최소/최대 값을 찾을 때 사용함.
 * - 데이터의 삽입과 삭제가 빠르고 각각의 수행시간 : O(log N)
 * 
 * 최대 힙(Max Heap) / 최소 힙(Min Heap)
 * 최대 힙
 * - 부모 노드의 값이 자식 노드의 값보다 항상 큼
 * 최소 힙
 * - 부모 노드의 값이 자식 노드의 값보다 항상 작음
 * 
 * 트리 내에서 가장 크거나(최대 힙) 가장 작은(최소 힙) 키 값을 가진 노드는 항상 루트 노드가 됨
 * 
 * 힙 구현
 * 구현의 용이함을 위해 시작 인덱스(root)는 1 부터 시작한다.
 * 각 노드와 대응되는 배열의 인덱스는 불변한다.
 * 
 * 왼쪽 자식 노드 인덱스 = 부모 노드 인덱스 X 2
 * 오른쪽 자식 노드 인덱스 = 부모 노드 인덱스 X 2 + 1
 * 부모 노드 인덱스 = 자식 노드 인덱스 / 2
 * 
 * 힙의 삽입 연산
 * 1. 트리의 가장 마지막 위치에 노드를 삽입
 * 2. 추가된 노드와 그 부모 노드가 힙 조건을 만족하는지 확인(조건은 최대 힙/최소 힙에 따라 다르다)
 * 3. 만족하지 않는다면 부모와 자식의 키 값을 바꿈
 * 3. 조건에 만족하거나 추가된 노드가 루트에 도달할 때까지 2번~3번 과정을 반복함
 * 
 * 힙의 삭제 연산
 * 1. 삭제연산은 항상 루트 노드를 삭제
 * 2. 트리의 가장 마지막 노드를 루트 자리로 삽입
 * 3. 바꾼 위치의 노드가 힙 조건을 만족하는지 확인(조건은 최대 힙/최소 힙에 따라 다르다)
 * 4. 만족하지 않는다면 왼쪽 자식과 오른쪽 자식 중 적합한 노드와 키 값을 바꿈
 * 5. 조건을 만족하거나 리프 노드에 도달할 때까지 3번~4번을 반복
 *  
 */

public class F_Heap_KCH {
	public static class MinHeap {

        private ArrayList<Integer> heap;

        public MinHeap() {		// 생성자에서 heap을 초기화
            heap = new ArrayList<>();
            heap.add(0); // 0번 인덱스는 사용하지 않는다.
        }

        public void print() {		// heap 출력
            for (int i = 1; i < heap.size(); i++) {
                System.out.print(heap.get(i) + " ");
            }
            System.out.println();
        }

        public void insert(int val) {
            heap.add(val);
            int p = heap.size() - 1;
            
            print();
            
            while (p > 1 && heap.get(p / 2) > heap.get(p)) {
                System.out.println("swap");
                int temp = heap.get(p / 2);
                heap.set(p / 2, heap.get(p));
                heap.set(p, temp);

                p = p / 2;
                
                print();
                
            }
        }

        public int delete() {

            if (heap.size() - 1 < 1) {	// 예외처리 - heap이 존재하지 않을 경우
                return 0;
            }
            
            print();
            
            int deletedItem = heap.get(1);	// 출력시 삭제한 노드의 데이터를 출력하기 위함
            
            heap.set(1, heap.get(heap.size() - 1));
            heap.remove(heap.size() - 1);
            
            print();
            
            int pos = 1;		// 루트 노드 부터 비교를위해 루트 노드 인덱스 저장
            while ((pos * 2) < heap.size()) {	// (pos * 2) -> 왼쪽 자식 노드의 인덱스, 해당 인덱스가 heap.size보다 크다면 비교할 노드가 없음 

                int min = heap.get(pos * 2);
                int minPos = pos * 2;

                if (((pos * 2 + 1) < heap.size()) && min > heap.get(pos * 2 + 1)) { // (pos * 2 + 1) -> 오른쪽 자식 노드 , 오른쪽 노드의 존재 유무,
                    min = heap.get(pos * 2 + 1);                                    //                  좌우 자식 노드의 값 크기 비교
                    minPos = pos * 2 + 1;
                }

                if (heap.get(pos) < min) {
                    break;
                }else {
                	System.out.println("swap");
                	int temp = heap.get(pos);
                	heap.set(pos, heap.get(minPos));
                	heap.set(minPos, temp);
                	pos = minPos;
                	
                	print();
                }

                
            }
            return deletedItem;
        }

    }
// 3 10 35 23 19 47 60 35 80 44 5
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        MinHeap minHeap = new MinHeap();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            int val = sc.nextInt();

            if (val == 0) {
                System.out.println(minHeap.delete());
            } else if (val == -1) {
                minHeap.print();
            } else if (val == -2) {
            	break;
            } else {
                minHeap.insert(val);
            }
        }
    }
}
	
	



































