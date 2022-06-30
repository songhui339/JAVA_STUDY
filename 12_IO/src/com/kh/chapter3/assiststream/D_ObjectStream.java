package com.kh.chapter3.assiststream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 객체 입출력 보조 스트림
 */
public class D_ObjectStream {
	public void fileSave() {
		Member member = new Member("sh.choi", "1234", "최송희", 20, 1843.7);
		
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e_object.dat"))){
//			FileOutputStream fos = new FileOutputStream("e_object.dat");
			// 기본 outputstream으로는 파일 저장할 수 없음 
//			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e_object.dat"));
			
			System.out.println("객체 출력 전");
			
			oos.writeObject(member);
			
			System.out.println("객체 출력 후");
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public void fileRead() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e_object.dat"))){
//			FileInputStream fis = new FileInputStream("e_object.dat");
//			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e_object.dat"));

			System.out.println("객체 입력 전");
			
			Member member = (Member) ois.readObject();
			
			System.out.println("객체 입력 후");
			System.out.println(member);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
