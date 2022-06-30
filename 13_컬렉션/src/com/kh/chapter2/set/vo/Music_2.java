//package com.kh.chapter2.set.vo;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Music implements Comparable<Music>{
//	
//	private String title;
//	
//	private String artist;
//	
//	private int ranking;
//	
//	@Override
//	public int compareTo(Music music) {
//		// 랭킹 순서대로 정렬하는 코드
////		System.out.println(this.ranking + "," + music.ranking); // 비교하는 루트 확인용 
//		return (this.ranking > music.ranking) ? 1 : (this.ranking == music.ranking) ? 0 : -1;
//	}
//	
//	
//	
//	
//	
//	
//	
//
//}
//
////