package com.kh.chapter3.field;

public class B_StaticField {
	public static String publicStaticField = "public static";
	private static String privateStaticField = "private static";
	
	// static 필드에 대한 getter / setter 메소드 또한 static 키워드가 붙어야 한다.
	public static String getPrivateStaticField() {
		return privateStaticField;
	}
	public static void setPrivateStaticField(String privateStaticField) {
//		객체를 생성하지 않고 클래스명으로 접근한다.
//		즉, 객체를 생성하지 않아서 this는 존재하지 않는다.
//		this.privateStaticField = privateStaticField;
		B_StaticField.privateStaticField = privateStaticField;
	}
	
	
	
	
	
}
