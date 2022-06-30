package com.kh.datastructure.practice;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
 * [Hash Function(해시 함수)]
 * 	- 해시와 해시테이블에 대해 알아보기 전에 해시 함수라는 것을 꼭 알아야한다.
 *  - 정의 : key를 고정된 길이의 hash로 변경해주는 역할을 한다. 이 과정을 hashing이라고 한다.
 *  - key를 해시함수에 Input으로 넣어서 Output으로 나오게하는 것이 Hash이고, Hash는 저장위치가 된다.
 *  - 즉, 해시 함수는 Key로 Hash를 만들어내는 함수
 *  
 * [HashTable 이란]
 * 	- 해시테이블은 (Key, Value)로 데이터를 저장하는 자료구조 중 하나로 빠르게 데이터를 검색할 수 있는 자료구조이다.
 *	- 해시테이블이 빠른 검색 속도를 제공할 수 있는 이유는 내부적으로 배열을 사용하여 데이터를 저장하기 때문이다.
 *	- 각각의 Key 값에 해시 함수를 적용하여 배열의 고유한 index를 생성하고 이 index를 활용해 값을 저장 혹은 검색하게 된다.
 *	- 실제 값이 저장되는 장소를 버킷 또는 슬롯이라고 한다.
 *
 *	(예시)
 *		("Junghoo", "5151") 인 데이터를 크기가 16인 해시 테이블에 저장하게 되면...
 *		1. index = hash_function("Junghoo")%16 연산을 통해 index 값을 계산
 *		2. array[index] = "5151"로 Value값을 저장
 * 	
 * 	(장점)
 * 		- 해시테이블은 key-value가 1:1로 매핑되어 있기 때문에 저장/삭제/조회의 과정에서 모두 평균적으로 O(1)의 시간 복잡도를 가지고 있다.
 * 	(단점)
 * 		- 해시 충돌이 발생(개방 주소법, 체이닝과 같은 기법으로 해결 필요)
 * 		- 순서/관계가 있는 배열에는 어울리지 않음	
 * 		- 공간 효율성이 떨어진다. (데이터가 저장되기 전에 저장공간을 미리 만들어하고 공간에 채워지지 않는 경우도 발생한다)
 * 		- 해시 함수의 의존도가 높다. (해시 함수가 복잡하다면 해시를 만들어 내는데 오래 걸림)
 *	
 *	[해시 값이 충돌하는 경우]
 *	- 만약 "Junghoo"를 해시 함수를 돌려 나온 값이 "Taejin"를 해시 함수롤 도려 나온 값이 동일하다면?
 *	- 이러한 충돌 문제는 2가지 방법으로 해결하고 있다.
 *	
 *	1) 분리 연결법(Separate Chaining)
 *		- 기존 값과 새로운 값을 연결리스트로 연결하는 방법 
 *		- 미리 충돌을 대비해서 공간을 많이 잡아놓을 필요가 없음, 충돌이 발생할때만 공간을 만들어서 연결해주면 됨
 *		- 단, 같은 Hash에 데이터들이 많이 연결되면 검색 효율이 낮아진다.
 *
 *	2) 개방 주소법(Open Addressing)
 *		- 추가 메모리 사용하는 방식이 아닌 비어있는 해시테이블의 공간을 활용하는 방법
 *		- 데이터를 삭제하면 삭제된 공간은 Dummy Space로 활용되기 때문에 Hash Table을 재정리해주는 작업이 별도로 필요함 
 *
 *	[HashMap과 HashTable의 차이]
 *	*동기화 지원여부*
 *	- 병렬 처리를 하면서 자원의 동기화를 고려해야하는 상황이라면 -> HashTable
 *	- 병렬 처리를 하지 않거나 자원의 동기화를 고려하지 않는 상황이라면 -> HashMap
 *
 *
 *  [참고 사이트] 
 *  	- https://mangkyu.tistory.com/102
 *  	- https://www.geeksforgeeks.org/hashtable-in-java/
 *  	- https://crazykim2.tistory.com/589
 *
 */

public class D_HashTable_CSH {
	
	// 1. HashTable 선언 
	public void method1() {
		// 1-1. 타입 설정 X 객체 설정만 
		Hashtable ht = new Hashtable();
		// 1-2. Integer, Integer 타입 선언 
		Hashtable<Integer, Integer> i = new Hashtable<Integer, Integer>();
		// 1-3. 타입 생략도 가능 
		Hashtable<Integer, Integer> i2 = new Hashtable<>();
		// 1-4. i의 HashTable을 i3으로 값 이전
		Hashtable<Integer, Integer> i3 = new Hashtable<Integer, Integer>(i);
		// 1-5. 초기 용량 지정 
		Hashtable<Integer, Integer> i4 = new Hashtable<Integer, Integer>(10);
		// 1-6. 변수 선언 + 초기값 지정 
		Hashtable<Integer, Integer> i5 = new Hashtable<Integer, Integer>() {{
			put(1, 100); put(2, 200); 
		}};
		
		// 1-7. String, String 타입 선언 
		Hashtable<String, String> str = new Hashtable<String, String>();
		// 1-8. Char, Char 타입 선언 
		Hashtable<Character, Character> ch = new Hashtable<Character, Character>();	

	}
	
	// 2. HashTable 값 관련 
	public void method2() {
		// Hashtable 선언 
		Hashtable<String, String> ht = new Hashtable<>();
		
		// 값 추가 
		ht.put("1", "Hello1"); 
		ht.put("2", "World2"); 
		ht.put("3", "Hello3"); 
		ht.put("4", "World4");
		ht.put("2", "WorldWorld2");
		
		System.out.println(ht);
		
		// 값 삭제 
//		ht.remove("2");
//		System.out.println(ht);
//		
//		// 모든 값 삭제 
//		ht.clear();
//		System.out.println(ht);
		
		// Hashtable 크기 구하기
		System.out.println("Hashtable Size : " + ht.size());
		System.out.println();
		
		// Hashtable 접근 방법 
		// 1. 향상된 for문 활용 
		System.out.println("[향상된 for문 활용]");
		for (Map.Entry<String, String> e : ht.entrySet()) {
			System.out.println("Key : " + e.getKey() + ", Value : " +  e.getValue());
			
		}
		
		System.out.println();
		System.out.println("[Iterator 방식 활용]");
		
		// 2. Iteraotor 방식 사용 
		// 	1) Iterator를 Entry로 선언하여 향상된 for문 처럼 entrySet()의 iterator() 방식으로 값을 가져옴 
		Iterator<Entry<String, String>> iter = ht.entrySet().iterator();
		
		while(iter.hasNext()){
			Map.Entry<String, String> entry = iter.next();
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		} 
		System.out.println("------------------------");
		
		//	2) Iterator를 String 타입으로 선언하여 Hashtable의 키 값을 iterator형태로 만들기 
		//	   String을 반복하여 String의 Key 값에 해당하는 Value를 반복해서 출력 
		Iterator<String> iter2 = ht.keySet().iterator();
		
		while(iter2.hasNext()) {
			String key = iter2.next();
			System.out.println("Key : " + key + ", Value : " + ht.get(key));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
