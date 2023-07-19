package class_;

public class StringMain2 {
	
	public static void main(String[] args) {
		
	// 1번 문제.	
		String a = "aabba";
		
		System.out.println("문자열 치환= " + a.replace("aa", "dd"));
		
	// 2번 문제
		String b = "aAbbA";
		
		System.out.println("문자열 치환= " + b.toLowerCase().replace("aa", "dd"));
		
    // 3번 문제
		
		String c = "aabbaa";
				
	  System.out.println("문자열 치환= " + c.replace("aa", "dd"));
	  
	// 4번 문제
	    String d = "AAccaabbaaaaatt";
	    
	   System.out.println("문자열 치환= " + d.toLowerCase().replace("aa", "dd"));
	   
    // 5번 문제
	   String e = "aabb";
	   String chg1, chg2;
	   chg1 = "aaaaa";
	   chg2 = "ddddd";
	  if (e.length()<chg1.length() || e.length()<chg2.length())
		  System.out.println("문자열의 길이가 작습니다.");
	  else
		  System.out.println("문자열 치환= " + e.replace(chg1, chg2));
	 
	}

}

/*
[문제] 치환하는 프로그램을 작성하시오 - indexOf(?, ?), replace()
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba (original)
현재 문자열 입력 : aa (Current)
바꿀 문자열 입력 : dd (Change)
ddbba
1번 치환

문자열 입력 : aAbbA     -  lowercase
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt    -lowercase
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb         
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다
*/