package com.kh.datastructure.practice;

/*
 * 이소희 담당
 * 자료구조 - 큐(Queue)
 * 
 * 자료구조란?
 * 프로그램에서 사용하는 데이터를 메모리 상에서 효율적으로 다루기 위해 만들어진 방식이다.
 * 효율적인 자료 구조가 성능 좋은 알고리즘의 기반이 되고 이는 수행 속도와 관련이 있게 된다. 
 * 구현하려는 프로그램에 맞는 최적의 자료 구조를 사용해야 하기 때문에
 * 자료 구조에 대한 이해가 필요하다. 
 * 
 * 
 * 큐(Queue)
 * - 양쪽 끝에서만 데이터를 넣고 뺄 수 있는 선형 구조
 * - 가장 먼저 입력 된 자료가 가장 먼저 출력되는 방식
 * 	 (선입선출 : First In First Out/ FIFO)
 * - 순차적으로 입력된 자료를 순서대로 처리하는데 많이 사용되는 구조
 * - 활용 예시) 최근 사용 문서, 인쇄 작업 대기 목록 등 
 * 
 * - 큐는 인터페이스이기 때문에 객체 생성이 안 된다.
 * - 그렇기 때문에 큐를 직접 구현하거나 큐를 구현한 클래스를 사용하면 된다.
 * - Java API를 참고해 큐 인터페이스를 구현한 클래스를 확인할 수 있다.
 *   대표적인 클래스 : LinkedList
 *   Queue q = new LinkedList(); 로 사용하면 된다. 
 *   
 * 
 * 사용 메소드
 * - offer() : 큐에 객체를 저장, 성공하면 true를 반환
 * 			   큐가 비어있으면 null 반환
 * - peek() : 큐에서 객체를 꺼내 반환 (데이터 삭제 x, 맨 위의 값 출력)
 * - poll() : 큐에서 객체를 꺼내 반환 후 삭제, 비어있으면 null 반환
 * 
 * - add() : 큐에 객체를에 추가, 성공하면 true를 반환하고 
 * 			 저장공간이 부족하면 lllegalStateException 발생
 * - remove() : 큐에서 객체를 꺼내 반환 후 삭제,
 *   			비어있으면 NoSuchElementException 발생
 * - clear() : 모든 데이터를 삭제
 * 
 * 
 */
public class C_Queue_LSH {
    int[] elements;
    private int front = 0;
    private int rear = 0;
    private int size = 2; // 기본 배열 사이즈
    private int exSize =0;

    public C_Queue_LSH(){
        elements = new int[size];
    }
    // 데이터 삽입
    public void offer(int data){
        if(rear == elements.length){
            System.out.println("Size : " + size +" -> " + (rear+5));
            exSize = rear + 5;
            int[] extendElements = new int[exSize];
            for(int i=0; i < rear; i++){
                extendElements[i] = elements[i];
            }
            elements = extendElements;
        }

        elements[rear++] = data;
        System.out.println("데이터 추가 : " + data + " -> front : " 
        					+ front +" , rear : "+ rear);
    }

    // 맨 앞의 데이터 출력
    public int peek(){
        return elements[front];
    }

    //데이터 출력 후 삭제
    public int poll(){
        if(front == rear) {
            System.out.println("데이터가 존재하지 않습니다");
            return -1;
        }
        int data = elements[front];
        elements[front++] = 0;
        return data;

    }

    //맨 앞의 데이터 삭제
    public void remove(){
        if(front == rear) {
            System.out.println("데이터가 존재하지 않습니다");
        }
        System.out.println("데이터 삭제 : " + elements[front]);
        elements[front] = 0;
        front++;
    }

    // 모든 데이터 삭제
    public void clear(){
        elements = new int[size];
        front=0;
        rear=0;
        System.out.println("모든 데이터 삭제");
    }
}

