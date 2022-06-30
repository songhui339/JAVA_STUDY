package com.kh.chapter1.string;

public class B_StringBuilder {

	public void method1() {
		/*
		 * StringBuilder의 기본 생성자를 통해서 객체를 생성하면 16개의 문자를 저장할 수 있는 버퍼가 생성된다.
		 * StringBuilder의 생성자에 정수값을 전달해주면 해당 크기 만큼의 버퍼가 생성된다.
		 * StringBuilder의 생성자에 문자열을 전달해주면 문자열 크기 + 16의 버퍼가 생성된다.
		 */
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder(30);
		StringBuilder sb2 = new StringBuilder("Hello");
		
		
		System.out.println("sb의 문자열 길이 : " + sb.length()); // 0
		System.out.println("sb의 버퍼의 크기 : " + sb.capacity()); // 16
		System.out.println("sb1의 문자열 길이 : " + sb1.length());
		System.out.println("sb1의 버퍼의 크기 : " + sb1.capacity());
		System.out.println("sb2의 문자열 길이 : " + sb2.length());
		System.out.println("sb2의 버퍼의 크기 : " + sb2.capacity());
	}
	
	public void method2() {
		// StringBuilder를 이용한 문자열의 변경 
		String str = "안녕하세요. ";
		StringBuilder sb = new StringBuilder("안녕하세요. ");
		
		System.out.println("sb의 주소값 : " + System.identityHashCode(sb));
		System.out.println("str의 주소값 : " + System.identityHashCode(str));
		System.out.println();
		
	
		// 기존 문자열 뒤에 문자열 추가하기 
		str += "저는 최송희입니다."; // str = str + "저는 최송희입니다."; 
		sb.append("저는 최송희입니다.");
		
		System.out.println(sb); // sb.toString() => 상속 마지막 부분 오버라이드 참고 
		System.out.println("sb의 문자열 길이 : " + sb.length()); 
		System.out.println("sb의 버퍼의 크기 : " + sb.capacity()); 
		System.out.println("sb의 주소값 : " + System.identityHashCode(sb));
		System.out.println("str의 주소값 : " + System.identityHashCode(str));
		System.out.println();
		
		sb.append("여러분 조금만 더 힘을 내세요~!");
		System.out.println(sb);
		System.out.println("sb의 문자열 길이 : " + sb.length()); 
		System.out.println("sb의 버퍼의 크기 : " + sb.capacity()); 
		System.out.println("sb의 주소값 : " + System.identityHashCode(sb));
		System.out.println();
		
		// insert(int offset, String str) : 문자열의 offset 위치부터 전달받은 문자열을 추가한다.
		sb.insert(1, "ㅎㅎㅎ");
		System.out.println(sb);
		System.out.println("sb의 문자열 길이 : " + sb.length()); 
		System.out.println("sb의 버퍼의 크기 : " + sb.capacity()); 
		System.out.println("sb의 주소값 : " + System.identityHashCode(sb));
		System.out.println();
		
		// delete(int start, int end) : start에서 end 이전까지의 index에 해당하는 문자열을 삭제한다.
		sb.delete(1, 4);
		System.out.println(sb);
		System.out.println("sb의 문자열 길이 : " + sb.length()); 
		System.out.println("sb의 버퍼의 크기 : " + sb.capacity()); 
		System.out.println("sb의 주소값 : " + System.identityHashCode(sb));
		System.out.println();
		
		// reverse() : 문자열의 순서를 역으로 바꾼다.
		sb.reverse();
		System.out.println(sb);
		System.out.println("sb의 문자열 길이 : " + sb.length()); 
		System.out.println("sb의 버퍼의 크기 : " + sb.capacity()); 
		System.out.println("sb의 주소값 : " + System.identityHashCode(sb));
		System.out.println();
		
		// * 메소드 체이닝 
		StringBuilder sb2 = new StringBuilder("Java Program ");
		// 메소드를 이어서 사용할 수 있는 것을 메소드 체이닝이라고 한다.
		sb2.append("API").delete(4, 11).reverse();
		
		System.out.println(sb2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
