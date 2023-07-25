package sungJuk;

import java.util.ArrayList;

public class SungJukList implements SungJuk {
    private ArrayList<SungJukDTO> arrayList;
    public SungJukList(ArrayList<SungJukDTO> arrayList) {
        this.arrayList = arrayList;
    }
    @Override
    public void disp() {
        System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
        for (SungJukDTO sj : this.arrayList) {
            System.out.println(sj.getNo() + "\t" + sj.getName() + "\t" + sj.getKor() + "\t"
                    + sj.getEng() + "\t" + sj.getMath() + "\t" + sj.getTot() + "\t" + sj.getAvg());
        }
    }
}
	
	/*- ArrayList에 저장된 모든 데이터를 출력한다.
	- 소수이하 2째자리까지 출력한다.
	 
	번호		이름		국어		영어		수학 		총점		평균
	*/
