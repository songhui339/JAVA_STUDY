package com.kh.chapter3.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.kh.chapter3.map.vo.Snack;

public class A_HashMap {
	
	// HashMap 생성하고 저장, 출력 테스트 
	public void method1() {
//		Map<String, Snack> map = new HashMap<>();
		Map<String, Snack> map = new TreeMap<>(); // 에러는 안남 / Entry 객체를 키값의 가나다 순으로 정렬 
		
		// 키 값이 중복이 되면 마지막으로 저장한 값이 호출 됨 
		// 저장 순서 유지 X, 키 값 중복 X (단, 중복된 키값으로 저장하면 기존에 있던 값을 덮어쓴다.)
		map.put("다이제", new Snack("초코맛", 1000));
		map.put("칸쵸", new Snack("바나나맛", 250));
		map.put("프링글스", new Snack("오리지날", 500));
		map.put("프링글스", new Snack("어니언맛", 500));
		map.put("허니버터칩", new Snack("꿀버타맛", 520));
		map.put("꼬북칩", new Snack("콘소메", 1200));
		map.put("꼬북칩", new Snack("시나몬초코", 1200));
		
		
		System.out.println(map);
		System.out.println();
		
		// Map 컬렉션에서 키값에 해당하는 Value를 얻어오는 메소드 
		Snack snack = map.get("다이제");
		
		System.out.println(snack);
		// Snack [flavor=초코맛, calorie=1000]
		System.out.println();
		
		// Map 컬렉션에 담겨있는 객체들의 개수를 얻어오는 메소드 
		System.out.println("개수 : " + map.size()); // 5개 (중복 빠진 개수)
		System.out.println();
		
		// Map 컬렉션에서 키 값에 해당하는 Entry 객체를 삭제하는 메소
		map.remove("허니버터칩");
		
		System.out.println(map);
		System.out.println("개수 : " + map.size());
		System.out.println(map.isEmpty()); // false
		System.out.println();

		// Map 컬렉션에 담겨 있는 모든 Entry 객체를 삭제하는 메소드 
		map.clear();
		
		System.out.println(map);
		System.out.println("개수 : " + map.size());
		System.out.println(map.isEmpty()); // false
		System.out.println();
		
		
	}

	
	// HashMap
	public void method2() {
		Map<String, Snack> map = new HashMap<>();
		
		// 저장 순서 유지 X, 키 값 중복 X (단, 중복된 키값으로 저장하면 기존에 있던 값을 덮어쓴다.)
		map.put("다이제", new Snack("초코맛", 1000));
		map.put("칸쵸", new Snack("바나나맛", 250));
		map.put("프링글스", new Snack("오리지날", 500));
		map.put("허니버터칩", new Snack("꿀버타맛", 520));
		map.put("꼬북칩", new Snack("콘소메", 1200));
		
		// Map은 인덱스의 개념이 없어서 반복문을 사용할 수 없다.
//		 for (int i = 0; i < map.size(); i++) {
//			 map.get(???);
//		 }
		
		// Map은 Iterable 인터페이스를 구현하지 않아서 향상된 for 문을 사용할 수 없다.
//		for (Entry<String, Snack> entry : map) {
//		}
		
		
		// List랑 Map은 구조가 달라서 ArrayList 담아서 사용할 수 없다.
//		List<Entry<String, Snack>> list = new ArrayList<>(map);
		
		
		
		// [ 접근 방법 ]
		// 1. keySet() 메소드를 이용하는 방법 
		Set<String> set = map.keySet();
		
		System.out.println("===keySet() 메소드를 이용해 접근===");
		// 향상된 for 문 
		for (String key : set) {
			System.out.printf("key : %s, value : %s\n" ,key , map.get(key));
			/*
			 	key : 프링글스, value : Snack [flavor=오리지날, calorie=500]
				key : 다이제, value : Snack [flavor=초코맛, calorie=1000]
				key : 칸쵸, value : Snack [flavor=바나나맛, calorie=250]
				key : 꼬북칩, value : Snack [flavor=콘소메, calorie=1200]
				key : 허니버터칩, value : Snack [flavor=꿀버타맛, calorie=520]
			 */
		}
		
		System.out.println();
		
		
		
		Set<String> set1 = new HashSet<>();
		
		
		
		// 2. entrySet() 메소드를 이용하는 방법 
		Set<Entry<String, Snack>> entrySet = map.entrySet();
		
		Iterator<Entry<String, Snack>> iterator = entrySet.iterator();
		
		System.out.println("===entrySet() 메소드를 이용해 접근===");
		while(iterator.hasNext()) {
			Entry<String, Snack> entry = iterator.next();
			
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
			System.out.printf("key : %s, value : %s\n", entry.getKey(), entry.getValue());
		}
		
		System.out.println();
		
	}
	
	
	
	
}
