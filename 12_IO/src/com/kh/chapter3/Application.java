package com.kh.chapter3;

import com.kh.chapter3.assiststream.D_ObjectStream;

public class Application {

	public static void main(String[] args) {
		
//		new A_BufferedStream().fileSave();
//		new A_BufferedStream().fileRead();
		
//		new B_ByteToCharStream().input(); 
//		new B_ByteToCharStream().output();
		
//		new C_DataStream().fileSaveAndRead();
	
		
		new D_ObjectStream().fileSave();
		new D_ObjectStream().fileRead();

	}

}
