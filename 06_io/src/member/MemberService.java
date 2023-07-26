package member;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class MemberService{
private ArrayList<MemberDTO> arrayList = new ArrayList<MemberDTO>();

public void menu() throws ClassNotFoundException, IOException, Exception {
	Scanner scan = new Scanner(System.in);
	Member member = null;
	int num;
	
	while(true) {
		System.out.println();
		System.out.println("**************");
		System.out.println("    1. 등록");
		System.out.println("    2. 출력");
		System.out.println("    3. 파일 저장");
		System.out.println("    4. 파일 읽기");
		System.out.println("    5. 종료");
		num = scan.nextInt();
		
		if(num == 5) break;
		if(num == 1) member = new MemberInsert(); //부모 = new 자식
		else if(num == 2) member = new MemberPrint();
		else if(num == 3) member = new MemberFileOutput();
		else if(num == 4) member = new MemberFileInput();
		
		member.execute(arrayList); //호출
	}//while
	
}
}
