package quiz;

import java.util.Scanner;

public class tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("请输入矩阵长度");
		int arrLength = in.nextInt();
		
		int arr1[] = new int [arrLength] ;
		System.out.println("请输入多个整数");
		
	
		
		// insert value to array1
		for ( int i = 0 ; i < arr1.length ; i++) 
			{
				arr1[i]=in.nextInt();
			}
		
		
		for ( int i = 0 ; i < arr1.length ; i++) 
			{
				if(i < arr1.length - 1 )
					System.out.print("【" + arr1[i] + "】," );	
			
				else
					System.out.println("【" + arr1[i] + "】。" );	
			}

		
		// copy array1 to array2 descending
		int arr2[] = new int[arrLength] ;
		for ( int i = 0 , k = arr1.length-1 ; i < arr1.length ; i++ , k-- )
			{
				arr2[k] = arr1[i];
			}
		
		
		//print out array 2
		for ( int i = 0 ;  i < arr2.length ; i++) 
			{
				if(i < arr2.length-1 )
					System.out.print("【" + arr2[i] + "】," );	
			
				else
					System.out.print("【" + arr2[i] + "】。" );	
			}

		
		
		
		
		
	}
}
