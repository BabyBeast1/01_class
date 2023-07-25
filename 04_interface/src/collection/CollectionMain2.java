package collection;

import java.util.ArrayList;

public class CollectionMain2 {
	
	public CollectionMain2() {
		ArrayList<String> list = new ArrayList<String>();  // 부모 = 자식
		list.add("호랑이");
		list.add("사자");
		list.add("호랑이");  // 주옥 허용
//		list.add(25);
//		list.add(43.8);
		list.add("기린");
		list.add("코끼리");
		
	 for(int i =0; i < list.size(); i++) {
		 System.out.println(list.get(i));
		} // for
	 System.out.println("--------------------------------");
	 
	 for(String str : list) {
		 System.out.println(str);
	 }
	}

	public static void main(String[] args) {
		new CollectionMain2();

	}

}
