package com.kh.chapter1.file;

import java.io.File;
import java.io.IOException;

public class A_File {
	public void method1() {
		try {
			// 경로를 지정하지 않으면 현재 프로젝트 폴더에 파일이 생성된다.
			File file = new File("test.txt"); // 메모리상에만 존재하는 객체 
//			File file2 = new File("/Users/sssongxi/develop/test2.txt");
			File file3 = new File("/Users/sssongxi/temp/test3.txt"); // 지정된 경로가 없으면 에러가 뜸 -> IOException 발생한다.
		
			System.out.println(file.getName()); // 파일 이름 
			System.out.println(file.getAbsolutePath()); // 파일이 저장되어 있는 물리적인 위치 
			System.out.println(file.getPath()); // 상대 경로 
			System.out.println(file.length()); // 파일 용량 
			System.out.println(file.exists()); // 파일 존재 여부 
		
			file.createNewFile(); // 실제 파일이 생성된다.
			file.delete();
//			file2.createNewFile();
			
			// 폴더를 생성해줘!
			File tempDir = new File("/Users/sssongxi/temp"); // 존재하지 않는 폴더 만들기 
			tempDir.mkdir();
			file3.createNewFile();
			System.out.println(file3.exists());
			System.out.println(file3.isFile()); // true
			System.out.println(file3.isDirectory()); // false
			System.out.println(tempDir.isFile()); // false
			System.out.println(tempDir.isDirectory()); // true
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
 