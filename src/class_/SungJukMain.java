package class_;
public class SungJukMain {

	public static void main(String[] args) {
		SungJuk a = new SungJuk();
		a.setData("홍길동", 96, 85, 78);
        a.calcTot();
        a.calcAvg();
        a.calcGrade();
		
        System.out.println("이름" +"\t\t" + "국어" + "\t"+ "영어" +"\t" + "수학" +"\t" + "총점" + "\t"+ "평균" +"\t" + "학점");
        System.out.println(a.getName() + "\t"+ a.getKor()+ "\t" + a.getEng() + "\t"+ a.getMath() + "\t" + a.getTot() + "\t"+ a.getAvg()+ "\t" + a.getGrade());
//        System.out.println(a.getName() + a.getKor() + a.getEng() + a.getMath() + a.getTot() + a.getAvg() + a.getGrade());
    	
        SungJuk b = new SungJuk();
		b.setData("라이언", 80, 76, 85);
        b.calcTot();
        b.calcAvg();
        b.calcGrade();
        
        System.out.println("이름" +"\t\t" + "국어" + "\t"+ "영어" +"\t" + "수학" +"\t" + "총점" + "\t"+ "평균" +"\t" + "학점");
        System.out.println(b.getName() + "\t"+ b.getKor()+ "\t" + b.getEng() + "\t"+ b.getMath() + "\t" + b.getTot() + "\t"+ b.getAvg()+ "\t" + b.getGrade());

	    }
}