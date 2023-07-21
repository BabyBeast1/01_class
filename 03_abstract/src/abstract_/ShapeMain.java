package abstract_;

import java.util.Scanner;

abstract class Shape {
	  protected double area;
	  protected Scanner scan = new Scanner(System.in);
	  
	  public Shape() {
		  System.out.println("Shape 기본 생성자");
	  }
	  public abstract void calcArea();
	  public abstract void dispArea();
}
// ---------------------
class Sam extends Shape {
	protected int base, height;
	
  public Sam() {
	  System.out.println("Sam 기본생성자");
	  System.out.println("밑변 : ");
	  base = scan.nextInt();
	  System.out.println("높이 : ");
	  height = scan.nextInt();
  }
  
  @Override
  public void calcArea() {
	   area = base * height / 2.;
  }
  public void dispArea() {
	  System.out.println("삼각형 넓이 = " + area);
  }
}
// -----------------------
class Sa extends Shape {
	protected int width, height;
	
	public Sa() {
		  System.out.println("Sam 기본생성자");
		  System.out.println("가로 : ");
		  width = scan.nextInt();
		  System.out.println("세로 : ");
		  height = scan.nextInt();
	}
		  @Override
		  public void calcArea() {
			   area = width * height;
		  }
		  public void dispArea() {
			  System.out.println("사각형 넓이 = " + area);
		  }
		}
//-----------------------
class Sadari extends Shape {
	protected int top,bottom,height;
	
	public Sadari() {
		  System.out.println("Sadari 기본생성자");
		  System.out.println("윗변 : ");
		  top = scan.nextInt();
		  System.out.println("밑변 : ");
		  bottom = scan.nextInt();
		  System.out.println("높이 : ");
		  height = scan.nextInt();
	}
	  @Override
	  public void calcArea() {
		   area = (top + bottom) * height /2.;
	  }
	  public void dispArea() {
		  System.out.println("사다리꼴 넓이 = " + area);
	  }
	}
//-----------------------
public class ShapeMain {

	public static void main(String[] args) {
		/*
		Sam sam = new Sam();   // 1:1 관계, 결합도 100%
		sam.calcArea();
		sam.dispArea();
		
		Sa sa = new Sa();
		sa.calcArea();
		sa.dispArea();
		
		Sadari sadari = new Sadari();
		sadari.calcArea();
		sadari.dispArea();
		 */
		// 다형성
		Shape shape;
		shape = new Sam(); //부모 = 자식 
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new Sa(); //부모 = 자식 
		shape.calcArea();
		shape.dispArea();
		System.out.println();

		shape = new Sadari(); //부모 = 자식 
		shape.calcArea();
		shape.dispArea();
		System.out.println();

	}

}
