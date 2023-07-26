package nested;

public class Outer {
	private String name;
	
	public void output() {
		System.out.println("이름 = " + this.name + "  나이 = "  + new Inner().age);
	}
	
	class Inner {
		private int age;
		
		public void setName(String name) {
			Outer.this.name = name;
		}
		
		public void disp() {
			System.out.println("이름 = " + Outer.this.name + "  나이 = "  + this.age);
		}
		
	}// class Inner
	
	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.name = "홍길동";
		ou.output();
		
		Outer.Inner in = ou.new Inner();
		in.age = 25;
		in.disp();
		
		Outer.Inner in2 = ou.new Inner();
		in2.age = 30;
		in2.disp();
		
		Outer.Inner in3 = new Outer().new Inner();
		in3.setName("코난");// in3.name = "코난";  - error  절대 접근 불가
		in3.age = 35;
		in3.disp();
	}

}
