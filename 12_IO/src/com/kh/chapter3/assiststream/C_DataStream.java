package com.kh.chapter3.assiststream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 기본 타입 입출력 보조 스트림
 */
public class C_DataStream {

	public void fileSaveAndRead() {
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("d_data.txt"));
			DataInputStream dis = new DataInputStream(new FileInputStream("d_data.txt"))) {
			
			// 파일에 출력하기 
			dos.writeUTF("최송희");
			dos.writeInt(20);
			dos.writeChar('W');
			dos.writeBoolean(false);
			dos.writeDouble(176.5);
			
			// 파일에서 값을 읽어오기 
			// 굳이 반복문 안 써도 괜찮음 
			while(true) {
				System.out.println(dis.readUTF());
				System.out.println(dis.readInt());
				System.out.println(dis.readChar());
				System.out.println(dis.readBoolean());
				System.out.println(dis.readDouble());
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) {
			System.out.println("파일 읽기 완료");
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
