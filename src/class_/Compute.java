package class_;

public class Compute {
	  private int x;
	  private int y;
	  private int sum;
	  private int sub;
	  private int mul;
	  private double div;
	  
	  public void setX(int x) {
		  this.x = x;
	  }
	  public void setY(int y) {
		  this.y = y;
	  }

	  public void calc() {
		  sum = x + y ;
		  sub = x - y ;
		  mul = x * y ;
		  div = (double)x / y ;
	  }
		/*
		 * public void calcSum() { sum = x + y; } public void calcSub() { sub = x - y ;
		 * } public void calcMul() { mul = x * y; } public void calcDiv() { div =
		 * (double) x / y; }
		 */
		  public int getX() {
		        return x;
		    }
		    public int getY() {
		        return y;
		    }
		    public int getSum() {
		        return sum;
		    }
		    public int getSub() {
		        return sub;
		    }
		    public int getMul() {
		    	return mul;
		    }
		    public double getDiv() {
		    	return div;
		    }
}
