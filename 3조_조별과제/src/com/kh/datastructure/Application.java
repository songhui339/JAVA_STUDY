package com.kh.datastructure;

import java.util.LinkedList;
import java.util.Queue;

import com.kh.datastructure.practice.A_LinkedList_LYR;
import com.kh.datastructure.practice.B_Stack_SYM;
import com.kh.datastructure.practice.C_Queue_LSH;
import com.kh.datastructure.practice.D_HashTable_CSH;

public class Application {
/*
1. Linked List(연결 리스트) - 예린님
2. Stack(스택) - 영민님
3. Queue(큐) - 소희님
4. Hash table(해시 테이블) - 송희
5. Tree(트리) - 상현님
6. Heap(힙) - 철환님
*/

	public static void main(String[] args) {
		// 1. Linked List - 예린님
    	A_LinkedList_LYR list = new A_LinkedList_LYR(); 
    	
    	list.addFirst(500); 
    	list.addFirst(400);
	    list.addFirst(300); 
	    list.addFirst(200); 
	    list.addFirst(100); 
		System.out.println(list.toString()); // 100 200 300 400 500 
		
		list.add(1, 150); 
		System.out.println(list.toString()); // 100 150 200 300 400 500 
		
		list.remove(1); 
		System.out.println(list.toString()); // 100 200 300 400 500 
		System.out.println(list.size()); // 5 
		
		list.removeFirst(); System.out.println( list.toString()); // 200 300 400 500 
		
		System.out.println(list.get(2)); // 400  
		
		
		// 2. Stack - 영민님 
		B_Stack_SYM st = new B_Stack_SYM(5);
    	st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.printStack(); // 5 4 3 2 1
        System.out.println("peek : " + st.peek()); // peek : 5
//        st.pop();
//        st.printStack(); // 4 3 2 1
//        st.pop();
//        st.pop();
//        st.pop();
//        st.pop();
//        System.out.println();
//        st.printStack(); // 없음 
//        System.out.println(st.isEmpty());	// true
        
        // 3. Queue(큐) - 소희님
        Queue q = new LinkedList();
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("==LinkedList 클래스를 사용 Queue==");
	
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		System.out.println();

		System.out.println("==배열로 구현한 Queue==");
		C_Queue_LSH c_Queue_LSH = new C_Queue_LSH();
		
			// 데이터 삽입
		 	c_Queue_LSH.offer(1);
		 	c_Queue_LSH.offer(5);
	        c_Queue_LSH.offer(9);

	        System.out.println();
	        
	        // 데이터 삭제
	        c_Queue_LSH.remove(); // 첫 번째로 입력한 1이 삭제됨.
	       
	        System.out.println("맨 앞의 데이터 출력 : "+ c_Queue_LSH.peek());
	        // 1이 삭제된 이후 다음 값인 2가 출력 됨.
	        System.out.println();
	        
	        // 모든 데이터 삭제
	        c_Queue_LSH.clear();
	        System.out.println(c_Queue_LSH.poll()); 
	        // 모든 데이터 삭제 후 출력 시 데이터 확인 안 됨.
	        System.out.println();

	        c_Queue_LSH.offer(1);
	        c_Queue_LSH.offer(2);
	        c_Queue_LSH.offer(3);
	        
	        System.out.println();
	        System.out.println("데이터 출력 후 제거 : "+ c_Queue_LSH.poll());
	        System.out.println("데이터 출력 후 제거 : "+ c_Queue_LSH.poll());
	        System.out.println("데이터 출력 후 제거 : "+ c_Queue_LSH.poll());
	        System.out.println("데이터 출력 후 제거 : "+ c_Queue_LSH.poll());
		// 4. Hash Table - 송희
		new D_HashTable_CSH().method2();
		
		// 5. Tree- - 상현님
//		TreeNode bt1 = new TreeNode(1);
//		TreeNode bt2 = new TreeNode(2);
//		TreeNode bt3 = new TreeNode(3);
//		TreeNode bt4 = new TreeNode("song");
//		
//		bt1.makeLeftSubTree(bt2);
//		bt1.makeRightSubTree(bt3);
//		bt2.makeLeftSubTree(bt4);
//		
//		//bt1의 왼쪽 자식노드의 데이터 출력
//		System.out.println(bt1.getLeftSubTree().getData());
//		//bt1의 오른쪽 자식노드의 데이터 출력
//		System.out.println(bt1.getRightSubTree().getData());

	}

}

