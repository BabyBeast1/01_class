package class_;

public class SungJukMain2 {

	public static void main(String[] args) {
//		SungJuk a = new SungJuk();  //객체
//		SungJuk b = new SungJuk();
//		SungJuk c = new SungJuk();
		
		SungJuk[] ar = new SungJuk[3]; // 객체 배열
		ar[0] = new SungJuk();
		ar[1] = new SungJuk();
		ar[2] = new SungJuk();
		
		ar[0].setData("홍길동", 96, 85, 78);
		ar[1].setData("코 난", 100, 78, 55);
		ar[2].setData("라이언", 80, 76, 85);
		
		System.out.println("이름\t\t국어\t영어\t수학\t총점\t평균\t학점");
		for(int i = 0; i<ar.length; i++) {
			ar[i].calcTot();
			ar[i].calcAvg();
			ar[i].calcGrade();
			System.out.println(ar[i].getName()+"\t"
			                         +ar[i].getKor()+"\t"
					                 +ar[i].getEng()+"\t"
			                         +ar[i].getMath()+"\t"
					                 +ar[i].getTot()+"\t"
			                         +String.format("%.2f",ar[i].getAvg())
			                         +"\t"+ar[i].getGrade());
		}
		System.out.println("---------------------------------------------------------------");
		
		for(SungJuk data : ar) {    //ar의 (배열) 크기만큼 for을 반복한다.
			data.calcTot();
			data.calcAvg();
			data.calcGrade();
			System.out.println(data.getName()+"\t"
			                         +data.getKor()+"\t"
					                 +data.getEng()+"\t"
			                         +data.getMath()+"\t"
					                 +data.getTot()+"\t"
			                         +String.format("%.2f",data.getAvg())
			                         +"\t"+data.getGrade());
		}
 	}
	}