package com.kh.lambda.standard;

import java.util.function.BooleanSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class B_Supplier {
	
	public void method1() {
		Supplier<String> supplier = () -> {
			return "Supplier : 제네릭으로 지정한 타입의 객체를 리턴한다.";
			
		};
		
		System.out.println(supplier.get());
		
		
//		BooleanSupplier booleanSupplier = () -> {
//			return true;
////			또
////			return false;
//		};
		
		BooleanSupplier booleanSupplier = () -> true;
		
		System.out.println(booleanSupplier.getAsBoolean());
		
		
		LongSupplier longSupplier = () -> {
			return 234567788805959L;
		};
		
		System.out.println(longSupplier.getAsLong());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
