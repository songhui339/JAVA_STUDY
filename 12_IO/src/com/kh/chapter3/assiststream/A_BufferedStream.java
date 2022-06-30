package com.kh.chapter3.assiststream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/*
 * 성능 향상 보조 스트림
 */
public class A_BufferedStream {
	public void fileSave() {
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {
			
			bw.write("안녕하세요.\n");
			bw.write("아직도 IO가 어려우신가요?");
			bw.newLine(); // 보조 스트림에서는 기반 스트림에서 제공하지 않는 다양한 기능들을 제공해줌 
			bw.write("줄바꿈이 적용되었나요?");
			bw.flush();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void fileRead() {
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {

//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine()); // 읽어올 데이터가 없으면 null 
			
			String value = null;
			
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
