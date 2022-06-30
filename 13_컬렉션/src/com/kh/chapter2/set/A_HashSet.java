package com.kh.chapter2.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.kh.chapter2.set.vo.Music;


public class A_HashSet {
	
	// HashSet을 생성하고 저장, 출력 테스트 
	public void method1() {
		Set<String> set = new HashSet<>();
		
		set.add(null);
		set.add("반갑습니다.");
		set.add(new String("반갑습니다."));
		set.add("여러분");
		set.add("반갑습니다.");
		set.add("여러분");
		set.add(null);
		
		/*
		 * 저장  순서가 유지되지 않고 중복된 데이터는 제거된다.
		 * 	- String 클래스에는 hashCode(), equals() 메소드가 오버라이딩 되어 있다.
		 * 	- 실제 데이터가 동일한 경우에 동일 객체로 인식되어서 저장되지 않는다.
		 */
		System.out.println("set : " + set); // set : [null, 여러분, 반갑습니다.]
		System.out.println();
		
		// Set에 저장된 객체에 접근하는 방법
		// 1. 향상된 for문 사용(인덱스로 접근하는 것이 아니기에)
		
		System.out.println("향상된 for문을 사용한 경우");
		for (String str : set) {
			System.out.println(str);
		}
		
		System.out.println();
		
		// 2. Iterator 반복자를 사용하는 방법 
		// 	- 가져올 객체가 있는지 확인할 때는 hasNext() 메소드를 사용한다.
		// 	- 하나의 객체를 가져올 때는 next() 메소드를 사용한다.
		Iterator<String> iterator = set.iterator();
		
		System.out.println("Iterator 반복자를 사용한 경우");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		
		
		// 3. HashSet에 저장된 객체들을 ArrayList에 담아서 사용하는 방법 
		System.out.println("HashSet에 저장된 객체들을 ArrayList에 담아서 사용한 경우");
		ArrayList<String> list = new ArrayList<>(set);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		
		
		
	}

	
	// HashSet에 Music 객체를 저장, 출력 테스트 
	public void method2() {
		Set<Music> set = new HashSet<>();
		
		/*
		 * Music 클래스는 hashCode(), equals() 메소드를 오버라이딩하지 않았기 때문에 중복 제거가 되지 않는다.
		 * Object 클래스에 있는 hashCode(), equals() 메소드는 주소값을 가지고 비교하기 때문에 필드 값과 상관 없이
		 * 모두 다른 객체로 인식해서 중복이 제거되지 않는다.
		 * 
		 * Music 클래스에서 hashCode(), equals() 메소드를 오버라이딩(재정의)해야한다.
		 */
		set.add(new Music("Love Dive", "IVE", 1));
		set.add(new Music("Love Dive", "IVE", 1));
		set.add(new Music("나는 트로트가 싫어요", "임창정", 5));
		set.add(new Music("봄여름가을겨울", "빅뱅", 2));
		set.add(new Music("봄여름가을겨울", "빅뱅", 2));
		
		
		for (Music music : set) {
			System.out.println(music);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
