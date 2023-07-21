package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
//		NumberFormat nf = new NumberFormat();  - 추상클래스라 생성이 안됨 error
		
//		3자리마다 ,를 찍고 소수이하 3자리 까지 제공
		
		NumberFormat nf = new DecimalFormat(); // sub class 이용하여 생성
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		// 유효숫자가 아닌 것은 표시하지 않는다.
		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		//강제로 0을 표시한다.
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
//		NumberFormat nf4 = NumberFormat.getInstance(); // 메소드를 이용하여 생성
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(); // 메소드를 이용하여 생성
		nf4.setMaximumFractionDigits(2); // 소수이하 2째자리 까지 들어옴
		nf4.setMinimumFractionDigits(2); // 0을 강제로 표시
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();

		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US); // 메소드를 이용하여 생성
		nf5.setMaximumFractionDigits(2); // 소수이하 2째자리 까지 들어옴
		nf5.setMinimumFractionDigits(2); // 0을 강제로 표시
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
	}

}
