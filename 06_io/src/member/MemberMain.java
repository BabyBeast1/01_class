package member;

import java.io.IOException;

public class MemberMain {

	public static void main(String[] args) throws ClassNotFoundException, IOException, Exception {
		MemberService memberService = new MemberService();
		memberService.menu();
		System.out.println("프로그램 종료합니다.");
	}

}
