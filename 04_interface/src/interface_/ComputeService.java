package interface_;

import java.util.Scanner;

public class ComputeService {
	
	public void menu() {
		Scanner scan = new Scanner (System.in);
		Compute com = null;
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("************************");
			System.out.println("		1. 합");
			System.out.println("		2. 차");
			System.out.println("		3. 곱");
			System.out.println("		4. 몫");
			System.out.println("		5. 종료");
			System.out.println("*************************");
			System.out.println("		번호 : ");
			num = scan.nextInt();
			
			if (num == 5 ) break;
			if (num == 1 ) {
				//Sum sum = new Sum(); // 1:1관계, 결합도 100%
				com = new Sum();//부모 = 자식
//				com.disp();
			}else if (num == 2) {
				//Sub sub = new Sub();
				com = new Sub();
//				com.disp();
			}else if (num == 3) {
			   //Mul mul = new Mul();
				com = new Mul();
//				com.disp();
			}else if (num == 4) {
			    //Div div = new Div();
				com = new Div();
//				com.disp();
			}else {
				System.out.println(" 1 ~ 5 까지만 번호를 허용합니다.");
				continue;
			}
			com.disp();
		}

	} // menu()

}
