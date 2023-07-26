package io_;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {
	
	public static void main(String[] args) throws IOException {	
	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("data.txt")));
	
//	System.out.println(bis.read()); // 65
//	System.out.println(bis.read()); // 66
//	System.out.println(bis.read()); // 67
	
	int data;
	while(  (data=bis.read()) != -1 ) {
		System.out.print((char)data);
	} //while
	// char없이 결과로 나오는 숫자중에 1310 은 enter 로 \r\n 2바이트로 이루어져있다
	bis.close();
     }
}