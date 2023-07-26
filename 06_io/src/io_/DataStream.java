package io_;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class DataStream {
	
	public static void main(String[] args) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
		dos.writeUTF("홍길동");
		dos.writeInt(25);
		dos.writeDouble(185.3);
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
		String name = dis.readUTF();
		int age = dis.readInt();
		double height = dis.readDouble();
		
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		System.out.println("키 = " + height);

		dis.close();
	}
}
