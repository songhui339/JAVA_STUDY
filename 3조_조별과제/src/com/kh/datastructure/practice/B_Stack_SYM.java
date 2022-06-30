package com.kh.datastructure.practice;

/* [정리 노트]
 * https://uiw6unoh.notion.site/cb3f3f0a214c4db0bb6fac0f73479c0c
 * 
 * 스택(Stack) 의 개념
 *  - 메모리 안에 데이터들을 효율적으로 관리하게 도와주는 자료 참고 방식
 *  - 한 쪽 끝에서만 자료를 넣고 뺄 수 있는 자료구조
 *  - LIFO(Last In First Out). 즉, 최근에 스택에 추가한 항목이 가장 먼저 제거될 항목이다. (후입선출)
 *  
 * 스택(Stack)의 메소드
 * 	- pop() : 스택에서 가장 위에 있는 항목을 제거한다.
 * 	- push(data) : data 하나를 스택의 가장 윗 부분에 추가한다.
 * 	- peek() : 스택의 가장 위에 있는 항목을 반환한다.
 *  - isEmpty() : 스택이 비어있는지 true 또는 false로 반환한다.
 */

public class B_Stack_SYM {
    private int top;				// 원소의 위치
    private int stackSize;			// stackSize
    private int stackArr[];		// 배열을 이용한 스택

    public B_Stack_SYM(int stackSize) {
        top = -1;					// 초기값은 -1
        stackArr = new int[stackSize];
        this.stackSize = stackSize;
    }
    
    // 스택에 데이터 입력
    public void push(int data) {
        stackArr[++top] = data;		// top의 위치를 증가시킨 후 입력
    }
    
    // 스택의 가장 위의 데이터 제거
    public int pop(){
        if (top == -1) {			// 스택에 데이터가 없으면 예외처리
            throw new ArrayIndexOutOfBoundsException();
        }
        return stackArr[top--];		// 스택에 데이터가 있으면 top값 감소
    }
    
    // 스택의 가장 위의 데이터 반환
    public int peek() {
        if (top == -1) {			// 스택에 데이터가 없으면 예외처리
            throw new ArrayIndexOutOfBoundsException();
        }
        return stackArr[top];		// 데이터가 있으면 top 반환
    }
    
    // 스택이 비어있는지 체크
    public boolean isEmpty() {		// 스택에 요소가 하나도 없다면 true, 하나라도 있으면 false
    	return top == -1 ? true : false;
    }
    
    // 스택 출력
    public void printStack() {
        System.out.println("== Stack List ==");
        for (int i = top; i >= 0; --i) {
            System.out.println(stackArr[i]);
        }
    }
}    