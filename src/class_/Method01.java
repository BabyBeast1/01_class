package class_;

public class Method01 {
 
	 public static void disp() { // 구현
		 System.out.println("static method...");
	 }
   
	 public void output() { // 구현
		 System.out.println("non-static method...");
	 }
	 
	public static void main(String[] args) {
		Method01.disp(); // 호출
		Method01 m = new Method01();
		m.output();       // 호출
	}

}
