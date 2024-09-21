package quiz;

import java.util.Scanner;


public class Quiz3 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("请输入两个整数 (a<b)：");
		int a = in.nextInt();
		int b = in.nextInt();
		int oddsum=0;
		int evensum=0;
		
		for(int i = a+1 ; i < b ; i++) 
		{
			System.out.print( i +  ","  );
		}
		
		for (int i = a+1 ; i < b ; i++) 
		{
			if( i%2 != 0 )
			{
				oddsum = oddsum + i;
			}
		}
		
		for (int i = a+1 ; i < b ; i++) 
		{
			if( i%2 == 0 )
			{
				evensum = evensum + i;
			}
		}
		
		System.out.print("\n");
		System.out.println( "odd total = "+oddsum );
		System.out.print( "even total = "+evensum );
	}

}
