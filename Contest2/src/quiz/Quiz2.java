package quiz;

import java.util.Scanner;


public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("请输入三个偶数：");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		
		if (a!=b && b!=c && c!=a)
		{
			System.out.println("请输入三个偶数:");
		} 
		else
		{
			System.out.println("请重新输入三个不同的偶数。");	
		}	
			
		if (a %2 != 0 || b %2 != 0 || c %2 != 0)
		{
			System.out.println("请输入三个偶数！");
		} 
		
		
		else
		{
			// 抓取最大值
			if(a>b && a>c)
			{
				System.out.print("最大值是" + a +",");
			}
			else if(b>a && b>c)
			{
				System.out.print("最大值是" + b +",");
			}
			else
			{
				System.out.print("最大值是" + c +",");
			}
			
			// 抓取最小值
			if(a<b && b<c)
			{
				System.out.print("最小值是" + a +".");
			}
			else if(b<a && b<c)
			{
				System.out.print("最小值是" + b +".");
			}
			else
			{
				System.out.print("最小值是" + c +",");
			}
			
		}
		if(a>b&&b>c)
		{
			System.out.printf("中间值是"+b);
		}
		if(c>b&&b>a)
		{
			System.out.printf("中间值是"+b);
		}
		
		if(c>a&&a>b)
		{
			System.out.printf("中间值是"+a);
		}
		if(b>a&&a>c)
		{
			System.out.printf("中间值是"+a);
		}
		
		if(a>c&&c>b)
		{
			System.out.printf("中间值是"+c);
		}
		if(b>c&&c>a)
		{
			System.out.printf("中间值是"+c);
		}
		
		

	} // end of main

} // end of class
