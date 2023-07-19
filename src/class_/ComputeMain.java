package class_;

public class ComputeMain {

	public static void main(String[] args) {
		
		Compute[] com = new Compute[3]; //객체배열
		for (int i = 0; i < com.length; i++ ) {
			com [i] = new Compute() ;
		} //for
		
		
		com[0].setX(320); com[0].setY(258);
		com[1].setX(258); com[1].setY(127);
		com[2].setX(572); com[2].setY(326);
		
		for(Compute data : com) {
			data.calc();
			System.out.println(data.getX() + "\t" +
					                 data.getY() + "\t" +
					                 data.getSum() + "\t" +
					                 data.getSub() + "\t" +
					                 data.getMul() + "\t" +
					                 data.getDiv());
			
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		/*Compute a = new Compute();
		a.setX(320);
		a.setY(256);
        a.calcSum();
        a.calcSub();
        a.calcMul();
        a.calcDiv();
        
        System.out.println("X" +"\t" + "Y" + "\t"+ "합" +"\t" + "차" +"\t" + "곱" + "\t\t"+ "몫");
        System.out.println(a.getX() + "\t"+ a.getY()+ "\t" + a.getSum() + "\t"+ a.getSub() + "\t" + a.getMul() + "\t"+ String.format("%.3f", a.getDiv()));
       
        
        Compute b = new Compute();
        b.setX(258);
        b.setY(127);
        b.calcSum();
        b.calcSub();
        b.calcMul();
        b.calcDiv();
        
        System.out.println("X" +"\t" + "Y" + "\t"+ "합" +"\t" + "차" +"\t" + "곱" + "\t\t"+ "몫");
        System.out.println(b.getX() + "\t"+ b.getY()+ "\t" + b.getSum() + "\t"+ b.getSub() + "\t" + b.getMul() + "\t"+ String.format("%.3f", b.getDiv()));
        
        
        Compute c = new Compute();
        c.setX(572);
        c.setY(326);
        c.calcSum();
        c.calcSub();
        c.calcMul();
        c.calcDiv();
        
        System.out.println("X" +"\t" + "Y" + "\t"+ "합" +"\t" + "차" +"\t" + "곱" + "\t\t"+ "몫");
        System.out.println(c.getX() + "\t"+ c.getY()+ "\t" + c.getSum() + "\t"+ c.getSub() + "\t" + c.getMul() + "\t"+ String.format("%.3f", c.getDiv()));

	}

}*/
