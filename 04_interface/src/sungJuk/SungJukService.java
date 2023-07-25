package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukService implements SungJuk {
    private ArrayList<SungJukDTO> arrayList = new ArrayList<>();

    public void display() {
        SungJukList sungJukList = new SungJukList(arrayList); // arrayList를 전달하여 SungJukList 생성
        sungJukList.disp();
    }

    @Override
    public void disp() {
        Scanner scan = new Scanner(System.in);

        System.out.print("번호 입력: ");
        int no = scan.nextInt();
        scan.nextLine(); // 버퍼 비우기

        boolean isDuplicate = false;
        for (SungJukDTO sj : arrayList) {
            if (sj.getNo() == no) {
                isDuplicate = true;
                break;
            }
        }

        if (isDuplicate) {
            System.out.println("이미 입력된 번호입니다. 다른 번호를 입력하세요.");
            return;
        }

        System.out.print("이름 입력: ");
        String name = scan.nextLine();
        System.out.print("국어 입력: ");
        int kor = scan.nextInt();
        System.out.print("영어 입력: ");
        int eng = scan.nextInt();
        System.out.print("수학 입력: ");
        int math = scan.nextInt();
        scan.nextLine(); // 버퍼 비우기

        SungJukDTO sungJuk = new SungJukDTO(no, name, kor, eng, math);
        arrayList.add(sungJuk);
        sungJuk.calc(); // calc() 메서드를 호출하여 총점과 평균 계산

        System.out.println("입력되었습니다.");
    }
}