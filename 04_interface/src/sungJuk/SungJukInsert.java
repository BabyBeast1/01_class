package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukInsert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<SungJukDTO> sungjukList = new ArrayList<>();
        
        while (true) {
            System.out.print("번호 입력: ");
            int no = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            boolean isDuplicate = false;
            for (SungJukDTO sj : sungjukList) {
                if (sj.getNo() == no) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                System.out.println("이미 입력된 번호입니다. 다른 번호를 입력하세요.");
                continue;
            }

            System.out.print("이름 입력: ");
            String name = sc.nextLine();
            System.out.print("국어 입력: ");
            int kor = sc.nextInt();
            System.out.print("영어 입력: ");
            int eng = sc.nextInt();
            System.out.print("수학 입력: ");
            int math = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            SungJukDTO sungJuk = new SungJukDTO(no, name, kor, eng, math);
            sungJuk.calc(); // calc() 메서드를 호출하여 총점과 평균 계산

            sungjukList.add(sungJuk);

            System.out.println("입력되었습니다. (계속 입력하시겠습니까? Y/N)");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("N")) {
                break;
            }
        }

        sc.close();
    }
}
	/*- 번호, 이름, 국어, 영어, 수학를 입력하여 총점과 평균을 계산한다.
	- 번호를 중복해서 입력하지 않는다.

	번호 입력 : 
	이름 입력 : 
	국어 입력 : 
	영어 입력 : 
	수학 입력 : 

	입력되었습니다*/
