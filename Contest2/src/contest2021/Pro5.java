package contest2021;

import java.util.Scanner;

public class Pro5 
{
	public static void main(String[] args) 
	{
		
		int total = 0;
		Scanner myObj = new Scanner(System.in);
		int N = myObj.nextInt();
		
		if(N>=1 && N<=10)
		{
			int[] arr = new int[N];
			for(int i=0; i<N; i++)
			{
				int next = myObj.nextInt();
				arr[i] = next;
			}
			
			for(int i=0; i<N; i++)
			{
				if(arr[i] % 2 == 0)
				{
					total = total + 1;
				}
			}
			
			System.out.println(total);
		}
		else
		{
			System.out.println("Error......");
		}
	}
}
