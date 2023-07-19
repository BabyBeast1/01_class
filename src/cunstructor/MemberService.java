package cunstructor;

import java.util.Scanner;

public class MemberService {
	Scanner scan = new Scanner(System.in);
	MemberDTO[] ar = new MemberDTO[3];
	
	
	public MemberService() {
		System.out.println("기본 생성자");
	}
	
	public void menu() {
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("************");
			System.out.println(" 1. 가입");
			System.out.println(" 2. 출력");
			System.out.println(" 3. 수정");
			System.out.println(" 4. 삭제");
			System.out.println(" 5. 끝");
			System.out.println("************");
			System.out.print(" 번호 : ");
			num = scan.nextInt();
			
			if(num == 5) break; //while을 벗어나라
			if(num == 1) insert();
			else if(num == 2) display();
			else if(num == 3) update();
			else if(num == 4) delete();

		}//while문
	}
	
	public void insert() {
		int i;
		for( i = 0; i < ar.length; i++) {
		if(ar[i] == null) { 
			System.out.print("이름 입력 :");
			String name = scan.next();
			System.out.println("나이 입력 : ");
			String age = scan.next();
			System.out.println("핸드폰 입력 : ");
			String phone = scan.next();
			System.out.println("주소 입력 : ");
			String address = scan.next();
			
			ar[i] = new MemberDTO(name, age, phone, address);
			System.out.println("가입 완료");
			
			break; // for문을 벗어나라
	      	} // if
		} // for
		
		if(i == ar.length) System.out.println("회원 마감");
	}
	public void display() {
		for( int i = 0; i < ar.length; i++) {
		if(ar[i] != null)	System.out.println(ar[i].getName() + "\t"
		                 	                        +ar[i].getAge() + "\t"
		                 	                        +ar[i].getPhone() + "\t"
		                 	                        +ar[i].getAddress());
		}
	}
	public void update() {
	    System.out.print("수정할 회원의 이름을 입력하세요: ");
	    String targetName = scan.next();
	    boolean found = false;

	    for (int i = 0; i < ar.length; i++) {
	        if (ar[i] != null && ar[i].getName().equals(targetName)) {
	            found = true;

	            System.out.print("새로운 이름을 입력하세요: ");
	            String newName = scan.next();
	            System.out.print("새로운 나이를 입력하세요: ");
	            String newAge = scan.next();
	            System.out.print("새로운 핸드폰 번호를 입력하세요: ");
	            String newPhone = scan.next();
	            System.out.print("새로운 주소를 입력하세요: ");
	            String newAddress = scan.next();

	                 ar[i] = new MemberDTO(newName, newAge, newPhone, newAddress);
	            System.out.println("회원 정보 수정 완료");
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("해당하는 회원이 존재하지 않습니다.");
	    }
	}
	public void delete() {
	    System.out.print("삭제할 회원의 이름을 입력하세요: ");
	    String targetName = scan.next();
	    boolean found = false;

	    for (int i = 0; i < ar.length; i++) {
	        if (ar[i] != null && ar[i].getName().equals(targetName)) {
	            found = true;
	            ar[i] = null;
	            System.out.println("회원 정보 삭제 완료");
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("해당하는 회원이 존재하지 않습니다.");
	    }
	}
}

