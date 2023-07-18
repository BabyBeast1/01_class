package class_;

public class Method02 {

	public static void main(String[] args) {
	     Method02 m = new Method02();
	     
	     int s1  = m.sum(25, 36); //호출
	     System.out.println("합 = " + s1);
	   
	     int s2  = m.sub(25, 36); //호출
	     System.out.println("차 = " + s2);
	     
	     int s3  = m.mul(25, 36); //호출
	     System.out.println("곱 = " + s3);
	     
	     double s4  = m.div(25, 36); //호출
	 //    System.out.println("몫 = " + s4);
	     System.out.println("몫 = " + String.format("%.3f", s4));

		
	}

	public int sum(int x, int y){ // 구현
		
		return x +y;
		
	}
	
	public int sub(int x, int y) {
	
		return x - y;
	}

	public int mul(int x, int y) {
		
		return x * y;
	}
	
	public double div(int x, int y) {
		
		return (double)x / y;   // 강제형변환(cast연산)
	}
}
