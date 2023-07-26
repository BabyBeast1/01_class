package member;

import java.util.ArrayList;
import java.util.Scanner;


public class MemberInsert implements Member {

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		//데이터
		Scanner scan = new Scanner(System.in);
		
		System.out.print("번호 입력 : ");
		int no  = scan.nextInt();
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("나이 입력 : ");
		int age  = scan.nextInt();
		System.out.print("핸드폰 번호 입력 : ");
		String phone = scan.next();
		System.out.print("주소 입력 : ");
		String address = scan.next();
		
		MemberDTO memberDTO = new MemberDTO(no, name, age, phone, address);
		System.out.println("등록 완료");
		
		arrayList.add(memberDTO);
	}

}
