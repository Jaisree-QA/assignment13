package thirteenpackage;

public class Mainaddition extends Additionresult {
		
	   void result()
	{
	super.sum(a,b);// normal method calling
System.out.println("Divisible by 10 : "+sum%10);
	}
	
	public static void main(String[] args) {
		Mainaddition c= new Mainaddition();
		c.sum(40, 5);
		c.displaymode();
		c.result();
	}

}
