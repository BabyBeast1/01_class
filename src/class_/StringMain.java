package class_;

public class StringMain {

	public static void main(String[] args) {
		String a = "apple";  // literal 생성
		String b = "apple";  // literal 생성
		if(a==b) System.out.println("a와 b의 참조값은 같다.");
		else System.out.println("a와 b의 참조값은 다르다.");
		
		if(a.equals(b)) System.out.println("a와 b의 참조값은 같다.");
		else System.out.println("a와 b의 참조값은 다르다.");
		
		System.out.println();
		
		String c = new String("apple");
		String d = new String("apple");
		if(c==d) System.out.println("c와 d의 참조값은 같다.");
		else System.out.println("c와 d의 참조값은 다르다.");
		
		if(c.equals(d)) System.out.println("c와 d의 참조값은 같다.");
		else System.out.println("c와 d의 참조값은 다르다.");
		System.out.println();
		
		String e = "오늘 날짜는 " + 2023 + 07 + 19;
		System.out.println("e = " + e);
		
		/*
		"오늘 날짜는 "
		"오늘 날짜는 2023"
		"오늘 날짜는 20237"
		e ----> "오늘 날짜는 2023719"
		
		문자열은 편집이 안된다. -> 메모리에 4번의 생성이 일어난다.
		JVM에 의해서 삭제시 Garbage Collector로 보낸다.
		Garbage Collector가 실행되면 컴퓨터는 멈춘다.
		 
		 */
		for (int i=0; i<e.length(); i++) {
			System.out.print(e.charAt(i));
		}
		System.out.println();
		System.out.println("부분 문자열 추출 = " + e.substring(7));
		System.out.println("부분 문자열 추출 = " + e.substring(7,11)); //2023
		
		System.out.println("대문자 변경 = " + "Hello".toUpperCase());
		System.out.println("소문자 변경 = " + "Hello".toLowerCase());
		
		System.out.println("문자열 검색= " + e.indexOf("짜"));
		System.out.println("문자열 검색= " + e.indexOf("날짜"));
		System.out.println("문자열 검색= " + e.indexOf("개바부"));
		
		System.out.println("문자열 치환= " + e.replace("날짜", "일자"));
		
		
		/*
		System.out.println("문자열 크기 = " + e.length());
		  배열.length
		  문자열.length()
		 */
	}

}
