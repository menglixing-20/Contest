package contest2021;


public class Pro1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a0=-5;
		int n=5;
		
		int total = new a().calculate(a0, n);
		System.out.println(total);
	}
	
	

}

class a
{
	public int calculate(int a0,int max)
	{
		if(max == 0)
		{
			return a0;
		}
		
		return (5*calculate(a0 , --max))+7;
	}
}