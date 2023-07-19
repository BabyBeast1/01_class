package cunstructor;

public class ConstructorMain {
	private String name;
	private int age;
	
	public ConstructorMain() {
		System.out.println("기본 생성자");
	}
	
	public ConstructorMain(String name) {
		this();
		this.name = name;
	}
	public ConstructorMain(int age) {
		this("어피치");  //Overload된 다른 생성자를 호출
		this.age = age;
	}

	public static void main(String[] args) {
		ConstructorMain aa = new ConstructorMain();
		System.out.println(aa.name +"\t" + aa.age);
		System.out.println("----------------------------");
		
		ConstructorMain bb = new ConstructorMain("홍길동");
		System.out.println(bb.name +"\t" + bb.age);
		System.out.println("----------------------------");
		
		ConstructorMain cc = new ConstructorMain(25);
		System.out.println(cc.name +"\t" + cc.age);
		System.out.println("----------------------------");
		
	}

}
