package contest2021;

import java.math.BigDecimal;
import java.util.Arrays;

public class Pro2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 final double  g =  9.8;
		 double h=456.789;
			
		 double ans = new aa().calculate(g, h);
		 System.out.println(new BigDecimal(ans).setScale(2, BigDecimal.ROUND_HALF_UP));
		 
		 
		 int[] aaa = new int[5];
		 aaa[0]=90;
		 aaa[1]=190;
		 aaa[2]=920;
		 aaa[3]=-90;
		 aaa[4]=-900;
		 
		 Arrays.sort(aaa);
		 
		 System.out.println(aaa[0]);
		 
		 int def = 0;
		 String bigStr = 9912+"";
		 char[] cArr = bigStr.toCharArray();
		 while(cArr.length > 1)
		 {
			 def = 0;
			 for(int i=0; i < cArr.length ; i++)
			 {
				 char c = cArr[i];
				 def = def + Integer.parseInt(c+"");
			 }
			 bigStr = def+"";
			 cArr = bigStr.toCharArray();
		 }
		 
		 System.out.println("bigStr="+bigStr);
	}

}

class aa
{
	public double calculate(double g, double h)
	{
		return Math.sqrt((2*h)/g);
	}
}
