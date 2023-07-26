package nested;

public class AbstractMain {

	public static void main(String[] args) {
		AbstractTest at = new AbstractTest() { // 익명 InnerClass, new 한 AbstractTest 를 대신한 클래스
			@Override
			public void setName(String name) { // 구현
				this.name = name;
			}
		};
		
		at.setName("홍길동");
		System.out.println(at.getName());
		
		InterA in = new InterA() { // 익명 InnerClass
			public void aa() {}
			public void bb() {}
		};
		
		AbstractExam ae = new AbstractExam() { // 익명 InnerClass
			// AbstractExam에는 추상 메소드가 없기 때문에 원하는 메소드 선택하여 Override
			// 추상 메소드가 없는 추상 클래스
		};
	}

}
