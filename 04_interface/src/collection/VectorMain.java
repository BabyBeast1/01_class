package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {
	
	public VectorMain() {
		Vector<String> v = new Vector<String>();
		System.out.println("벡터 크기 = " + v.size()); // 항목 개수, 0
		System.out.println("벡터 용량 = " + v.capacity()); // 용량, 10
		System.out.println();
		
		System.out.println("항목 추가");
		for(int i= 1; i <=10; i++) {
			v.add(i+"");
		} 
		
		for(int i= 0; i <10; i++) {
			System.out.print(v.get(i) + "  ") ;
	}
		System.out.println();
		System.out.println("벡터 크기 = " + v.size()); // 항목 개수, 0
		System.out.println("벡터 용량 = " + v.capacity()); // 용량, 10
		System.out.println();
		
		System.out.println("항목 1개 추가");
		v.add("5"); // 중복허용
		
		for(int i= 0; i <v.size(); i++) {
			System.out.print(v.get(i) + "  ") ;
	}
		System.out.println();
		System.out.println("벡터 크기 = " + v.size()); // 항목 개수, 0
		System.out.println("벡터 용량 = " + v.capacity()); // 용량, 10
		System.out.println();

		System.out.println("마지막 항목 삭제");
		// v.remove("5"); - 앞에 있는 "5"가 제거
		v.remove(10);
		
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() + "  ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		new VectorMain();
	}

}
