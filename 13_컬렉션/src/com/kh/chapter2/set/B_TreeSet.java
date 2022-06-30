package com.kh.chapter2.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.kh.chapter2.set.vo.Music;

public class B_TreeSet {
	
	// TreeSet을 생성하고 저장, 출력 테스트 
	public void method1() {
		TreeSet<String> ts = new TreeSet<>();
		
		// 중복 제거, 오름차순 자동 정렬됨, null은 저장 안됨 
		ts.add("하하하");
//		ts.add(null);
		ts.add("나나나");
		ts.add("가가가");
//		ts.add(null);
		ts.add("다다다");
		ts.add("다다다");		
//		ts.add(null);
		ts.add("하하하");
		
		
		System.out.println(ts);
		// [가가가, 나나나, 다다다, 하하하]
		// 검색 기능 
		System.out.println(ts.first()); // 가가가
		System.out.println(ts.last()); // 하하하
		
		
		
	}

	
	
	
	// TreeSet에 Music 객체를 저장, 출력 테스트 
	public void method2() {
		Set<Music> set = new TreeSet<>(new Comparator<Music>() { // 익명 구현 객체 
			
			// 타이틀 이름으로 정렬되도록 설정 
			@Override
			public int compare(Music o1, Music o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});
		
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
