package cunstructor;

public class MemberMain {

	public static void main(String[] args) {
	     
		  MemberService ms = new MemberService();
		  ms.menu(); //호출
		  System.out.println("프로그램을 종료합니다.");

	}

}


/*
 * 클럽 회원관리 프로그램 작성 
 * 여기는 폐쇄적인 모임으로 회원은 총 5명으로 한다 
 * 회원의 정보는 이름, 나이, 핸드폰, 주소로 설정한다 회원
 * 가입, 수정, 출력 프로그램을 작성하시오 
 * 각각의 메소드로 구성하시오
 * 
 * [실행결과] 
 * menu()
 *************
 * 1. 가입 2. 출력 3. 수정 4. 삭제 5. 끝내기
 *************
 * 번호 :
 * 
 insert()
 이름 입력 : 
 나이 입력 : 
 핸드폰 입력 : 
 주소 입력 : 
 
 3. 수정 : update()
핸드폰 번호 입력 : 010-1111-1111
회원 정보를 찾을 수 없습니다.
또는
핸드폰 번호 입력 : 010-1234-5678

이름   나이   핸드폰   			주소
홍길동  25   010-1234-5678		서울

수정 할 이름 입력 : 
수정 할 핸드폰 입력 : 
수정 할 주소 입력 :

회원 정보 수정 완료

4. 삭제 : delete()
핸드폰 번호 입력 : 010-1111-1111
회원 정보를 찾을 수 없습니다.
또는
핸드폰 번호 입력 : 010-1234-5678

회원 정보 삭제 완료
 
 */