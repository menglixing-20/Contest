package contest2021;

import java.math.BigDecimal;

public class Pro4 
{
	public static void main(String[] args) 
	{
		double PAI=3.14;
		double h=50.4;
		double r=30.3;
		
		
		
		double ans = new aaaa().calculate(h, r, PAI);
		System.out.println(new BigDecimal(ans).setScale(2, BigDecimal.ROUND_HALF_UP));
		
	}
}

class aaaa
{
	public double calculate(double h, double r, double PAI)
	{
		 return 2*PAI*r*h + 2*PAI*(r*r);
	}
}

