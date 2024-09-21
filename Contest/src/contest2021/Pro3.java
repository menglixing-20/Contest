package contest2021;


public class Pro3 
{
	public static void main(String[] args) 
	{
		int N=10000;
		int ans = new aaa().calculate(N);
		
		System.out.println(ans);
		
	}
}

class aaa
{
	public int calculate(int N)
	{
		int total = 0;
		for(int temp=1; temp<=N; temp++)
		{
			if(N % temp == 0)
			{
				total = total + temp;
			}
		}
		return total;
	}
}
