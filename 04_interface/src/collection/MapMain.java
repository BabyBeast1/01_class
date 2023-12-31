package collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
	
	public MapMain() {
		Map<String, String > map = new HashMap<String, String>();
		map.put("book101", "백설공주");
		map.put("book201", "인어공주");
		map.put("book102", "백설공주"); // Value의 값 중복 허용
		map.put("book301", "피오나"); 
		map.put("book101", "엄지공주"); // Key의 값 중복 허용
		
		System.out.println(map.get("book101"));
		System.out.println(map.get("book102"));
		System.out.println(map.get("book501"));  // null
	}
	
	public static void main(String[] args) {
		new MapMain();
	}

}
