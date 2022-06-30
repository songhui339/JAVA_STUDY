package com.kh.chapter1.list;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.kh.chapter1.list.compare.ArtistAcending;
import com.kh.chapter1.list.vo.Music;

public class A_ArrayList {
	
	// ArrayList를 생성하고 저장, 출력 테스트 
	public void method1() {
		List list = new ArrayList();
		// 배열도 Object 배열로 만들면 다양한 타입의 객체 생성은 가능함 
//		Object[] array = {"안녕", 1, LocalDateTime.now()};
		
		
		// 객체를 저장할 때는 add() 메소드를 사용한다.
		list.add("안녕하세요.");
		list.add(LocalDateTime.now());
		list.add(3.14); // 오토박싱이 적용되어 기본생성자도 객체로 바꿔준다 
		list.add(false);
		list.add('a');
		list.add(1);
		
		
		System.out.println("list : " + list); 
		// list : [안녕하세요., 2022-04-21T09:43:18.432951, 3.14, false, a]
		System.out.println("list.size() : " + list.size());
		// list.size() : 5
		System.out.println();
		
		// Object로 입력했고 Object로 리턴하기 때문에 String으로는 출력 불가 
//		String str = list.get(0); // 에러 남 
		// List에서 객체를 꺼내서 대입하려면 해당 자료형에 맞게 형 변환을 해야한다.
		String str = (String) list.get(0);
		LocalDateTime now = (LocalDateTime) list.get(1);
		double num = (Double) list.get(2);
		
	
//		for (int i = 0; i < list.size(); i++) {
//			// 인덱스에 해당하는 값을 가져올 때는 get() 메소드를 사용한다.
//			System.out.println(list.get(i));
//		}
		
		// 향상된 for문 
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		
		// 객체의 중복 저장을 허용한다.
		list.add("안녕하세요.");
		System.out.println("list : " + list);
		// list : [안녕하세요., 2022-04-21T10:13:30.802509, 3.14, false, a, 안녕하세요.] 
		
		// null 저장을 허용한다.
		list.add(null);
		list.add(null);
		System.out.println("list : " + list);
		// list : [안녕하세요., 2022-04-21T10:15:52.458447, 3.14, false, a, 안녕하세요., null, null]
		
		// 원하는 인덱스 위치에 객체를 추가할 수 있다.
		list.add(2, 125000);
		System.out.println("list : " + list);
		// list : [안녕하세요., 2022-04-21T10:18:00.661761, 125000, 3.14, false, a, 안녕하세요., null, null]
		
		// 원하는 인덱스 위치에 객체를 변경할 수 있다.
		list.set(2, 300000);
		System.out.println("list : " + list);
		// list : [안녕하세요., 2022-04-21T10:19:30.843476, 300000, 3.14, false, a, 안녕하세요., null, null]

		// 원하는 인덱스 삭제 
		list.remove(2); // 300000 삭제 
		list.remove("안녕하세요."); // 가장 앞 인덱스의 객체만 삭제 
		list.remove(3.14);
		list.remove(Integer.valueOf(1)); // 인덱스가 아닌 객체 1을 삭제하고 싶을때는 Integer.valueof() 메소드 사용 
		System.out.println("list : " + list);
		// list : [2022-04-21T10:23:59.497880, false, a, 안녕하세요., null, null]
		System.out.println("list.isEmpty() : " + list.isEmpty()); // false
		
		// List에 저장된 객체를 모두 삭제할 때는 clear() 메소드를 사용한다.
		list.clear();
		System.out.println("list : " + list);
		System.out.println("list.isEmpty() : " + list.isEmpty()); 
		
		
	}
	
	
	// ArrayList에 문자열, 정수를 저장, 정렬 테스트 
	public void method2() {
		/*
		 * 컬렉션에서 제네릭스(<>)를 사용하는 이유 
		 * 	- 명시된 타입의 객체만 저장하도록 제한을 두기 위해서 사용한다.
		 * 	- 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형 변환을 하지 않아도 된다.
		 * 
		 * 
		 * 리스트의 정렬 
		 * 	- Wrapper 객체, 문자열의 경우에는 Comparable 인터페이스가 내부적으로 구현되어 있어서
		 * 	  Collections.sort()를 통해서 정렬이 가능하다. 
		 * 	- 사용자가 작성하는 클래스의 객체도 Collections.sort()를 통해서 정렬이 가능하게 하고 싶다면
		 * 	  Comparable 인터페이스를 구현하면 된다.
		 */
		List<String> list = new ArrayList<String>();
		// <> type파라미터 안에는 클래스만 넣을 수 있어서 int가 아닌 Integer를 넣어야한다.
		List<Integer> list2 = new ArrayList<>();
		
		list.add("banana");
		list.add("apple");
		list.add("orange");
		list.add("mango");
		list.add("grape");
		
		list2.add(7); // 오토박싱
		list2.add(1);
		list2.add(8);
		list2.add(10);
		list2.add(3);
		list2.add(2);
		
		
		System.out.println("list : " + list); 
		// list : [banana, apple, orange, mango, grape]
		System.out.println("list2 : " + list2);
		// list2 : [7, 1, 8, 10, 3, 2]
		
		// 오름차순으로 리스트를 정렬 
		// Comparable 인터페이스를 구현하고 있는 요소를 가지고 있는 리스트를 인자로 전달한다.
		Collections.sort(list);
		Collections.sort(list2);
		
		System.out.println("list : " + list); 
		// list : [apple, banana, grape, mango, orange]
		System.out.println("list2 : " + list2);
		// list2 : [1, 2, 3, 7, 8, 10]
		
		
		// 내림차순으로 리스트를 정렬 (반드시 오름차순 해준 다음에 reverse 해줘야함) 
		// sort() 메소드를 통해서 오름차순으로 정렬 후에 reverse() 메소드를 호출하여 내림차순으로 정렬 
		Collections.reverse(list);
		Collections.reverse(list2);
		
		System.out.println("list : " + list); 
		// list : [orange, mango, grape, banana, apple]
		System.out.println("list2 : " + list2);
		// list2 : [10, 8, 7, 3, 2, 1]
		
		
		
		
		
		
	}
	
	
	// ArrayList에 Music 객체를 저장, 정렬 테스트 
	public void method3() {
		List<Music> list = new ArrayList<>();
		
		list.add(new Music("Love Dive", "IVE", 1));
		list.add(new Music("TOMBOY", "I-DLE", 3));
		list.add(new Music("소주한잔", "임창정", 6));
		list.add(new Music("나는 트로트가 싫어요", "임창정", 5));
		list.add(new Music("Feel My Rhythm", "레드벨벳", 4));
		list.add(new Music("봄여름가을겨울", "빅뱅", 2));
		
//		System.out.println(list);
		for (Music music : list) {
			System.out.println(music);
		}
		System.out.println();
		
		
		// 오름차순으로 리스트를 정렬하는 메소드 
		// 1. 하나의 매개변수를 받는 sort() 메소드는 Comparable 인터페이스를 구현하고 있는 요소를 가지는 리스트를 전달해야 한다.
		Collections.sort(list);
		
//		music1.compareTo(music2);
//		music2.compareTo(music3);
//		...반복....
		
		
		for (Music music : list) {
			System.out.println(music);
		}
		
		System.out.println();
		
		// 2. 두 개의 매개변수를 받는 sort() 메소드는 첫 번째 인자는 리스트 객체, 
		// 두 번째 인자는 리스트 내의 각 요소(객체)를 비교하는데 사용하게 될 Comparator 인터페이스의 구현 객체를 넘겨준다. 
		// 아티스트 이름 순대로 정렬 
		Collections.sort(list, new ArtistAcending());
		
		for (Music music : list) {
			System.out.println(music);
		}
		System.out.println();
		
		// 익명 구현 객체를 사용하는 방법 
		// Title 오름차순으로 정렬 
		// 딱 한번만 처리되어야할때 주로 사용 
		// Class 파일 안 만들어도 되어서 효율적으로 사용 가능 
		Collections.sort(list,  new Comparator<Music>() {

			@Override
			public int compare(Music o1, Music o2) {
				
				return o1.getTitle().compareTo(o2.getTitle());
			}
			
		});
		
		for (Music music : list) {
			System.out.println(music);
		}
		System.out.println();
		
		
		// 람다식 사용하는 방법 Java 8 부터 사용 가능 
		Collections.sort(list, (o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
		
		for (Music music : list) {
			System.out.println(music);
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
