package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {
	
	public CollectionMain() {
		Collection coll = new ArrayList();  // 부모 = 자식
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이");  // 중복 허용, 순서대로
		coll.add(25);
		coll.add(43.8);
		coll.add("기린");
		coll.add("코끼리");
		
		Iterator  it = coll.iterator();  // 메소드를 이용하여 생성
		
		// it.hasNext() - 만약에 항목이 있으면 true, 없으면 False
//		it.next() - 현재 위치에서 항목을 꺼내 저장하고 다음 항목으로 이동
		
		while(it.hasNext()) {
			System.out.println(it.next());
		} // while
	}

	public static void main(String[] args) {
		new CollectionMain();

	}

}
