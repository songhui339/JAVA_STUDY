package com.kh.inherit.override;

import java.util.Objects;

public class Book /* extends Object */{
	
	private String title;
	
	private String author;
	
	private int price;
	
	// 기본 생성자 
	public Book() {
		
	}
	
	
	// 매개변수 생성자 
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// getter setter 
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		
	}


	/*
	 * 1. Object 클래스의 toString() 메소드 오버라이딩 
	 * 		- toString() 메소드는 객체의 문자열 정보를 리턴한다 (객체를 문자열로 표현한 값)
	 * 		- 기본적으로 Object 클래스에서는 "클래스명@16진 해시코드"를 리턴하는데
	 * 		  자식클래스에서 객체에 대한 유용한 문자열 정보를 리턴하도록 재정의할 수 있다.
	 * 		- print 메소드의 경우 기본적으로 객체의 참조 값을 매개값으로 넘겨주면 내부적으로
	 * 		  참조값.toString() 메소드를 호출해서 리턴되는 값을 출력한다.
	 * 
	 */
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}


	
	/*
	 * 2. Object 클래스의 equals() 메소드 오버라이딩 
	 * 	- equals() 메소드는 매개 값으로 전달 받은 객체와 동일한 객체라면 true를 리턴하고 그렇지 않으면 false 리턴 
	 * 	  ㄴ equals 메소드의 역할 
	 * 	- 기본적으로 객체의 동등 비교 시 주소값을 비교하여 같으면 true 리턴, 그렇지 않으면 false 리턴 
	 * 	- 객체의 동등 비교 시 객체가 가지고 있는 필드의 값들이 모두 같으면 true 리턴, 그렇지 않으면 false 리턴하도록 재정의한다.
	 * 
	 * 
	 * @Override 어노테이션
	 * 	- 해당 메소드가 오버라이딩 된 메소드라는 것을 컴파일러에게 알려주는 역할 
	 * 	- 자식 메소드에서 재정의를 잘못하고 있는 경우에 컴파일 에러로 표시해 준다
	 * 	
	 * 
	 */
	
	
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		Book target = (Book) obj;
		
		// Private은 해당 클래스에서 직접 접근이 가능하기 때문에 
		// target 참조 변수로 private 멤버에도 직접 접근이 가능하다.
		if(this.title.equals(target.title) && 
				this.author.equals(target.author) && 
				this.price == target.price) {
			result = true;
		}
	
		return result;
	}
	
//	// 자동 생성 해준 결과 
//	@Override
//	public int hashCode() {
//		return Objects.hash(author, price, title);
//	}
//	
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Book other = (Book) obj;
//		return Objects.equals(author, other.author) && price == other.price && Objects.equals(title, other.title);
//	}
	
	
	/*
	 * 3. Object 클래스의 hashCode() 메소드 오버라이딩
	 * 	- 객체의 해시 코드란 객체를 식별할 수 있는 하나의 정수값을 의미 
	 *  - 기본적으로 Object 클래스의 hashCode() 메소드는 객체의 메모리 번지를 이용해서 만들어주기 때문에 
	 *    객체마다 다른 값을 가지고 있다.
	 *  - 컬렉션들은 hashCode() 메소드를 가지고 두 객체가 동등한지 비교. 해시코드가 같으면 equals() 메소드로 다시 비교
	 *  
	 */
	
	@Override
	public int hashCode() {
		int hashCode = 0;
		
		/*
		 * 해당 객체의 필드 값들을 하나의 문자열로 합쳐서 문자열의 해시코드를 리턴한다.
		 * 		- title + author + price => 문자열이 된다.
		 * String 클래스에서 같은 문자열일 경우 동일한 해시 코드를 리턴하도록 hashCode() 메소드가 이미 재정의 되어 있음 
		 * 
		 */
		hashCode = (this.title + this.author + this.price).hashCode();
		
		return hashCode;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
