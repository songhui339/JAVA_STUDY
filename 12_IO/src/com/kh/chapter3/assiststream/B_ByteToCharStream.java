package com.kh.chapter3.assiststream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 문자 변환 보조 스트림 
 */
public class B_ByteToCharStream {
	public void input() {
		
		String value = null; 
		
		// 여러 개의 보조 스트림을 사용하는 것도 가능하다.
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("문자열 입력 > ");
			
			value = br.readLine();
			
			System.out.println("value : " + value);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void output() {
		
		
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) { // System.out => console에 출력 
			bw.write("아직도 IO가 어려우신가요?ㅜㅠ");
			bw.newLine();
			bw.write("앞으로 Oracle, JDBC, HTML, CSS, ... 남아있습니다.");
			bw.newLine();
			bw.write("힘내세요!!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
