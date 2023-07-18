package class_;

public class Variable {
	static int b; // 필드, 초기화 
	static double c;
	int d;
	
    public static void main(String[] args) {
    	// 지역변수 (local variable)
    	short a = 65; // 0100 0001
    	int b = 65;
    
       System.out.println("지역변수 a = " + a);
       System.out.println("지역변수 b = " + b);
       
       System.out.println("필드 b = " + Variable.b);
       System.out.println("필드 c = " + c);
//       System.out.println("필드 d = " + new Variable().d);
       
       Variable v = new Variable();
       System.out.println("객체 v = " + v);
       System.out.println("필드 d = " + v.d);
    }
	
}
