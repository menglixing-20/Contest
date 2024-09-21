package contest2024;

import java.util.Arrays;

public class Q10 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int N=15;
		int arr[]= {11,9,6,13,8,14,5,12,7,10,15,5,13,6,10};
		int maximum=4; 
		
		int[] arrCooked=new int[maximum];
		
		Arrays.sort(arr);
		
//		// initial first phase cook array
		for(int i=0; i<maximum; i++)
		{
			arrCooked[i] = arr[i];
		}
		
		int orders=maximum; // initial next dish
		int cookedTime = 0;
		while(calculateLeftTime(arrCooked) > 0)
		{
			for(int i=0 ; i<maximum ; i++)
			{
				if(arrCooked[i] > 0)
				{
					arrCooked[i] = arrCooked[i] - 1;
					if(arrCooked[i] == 0 && orders<arr.length)
					{
						arrCooked[i] = arr[orders];
						orders++;
					}
				}
			}
			cookedTime = cookedTime + 1;
		}
		
		System.out.println("cookedTimes=" + cookedTime);
		
	}

	
	static int calculateLeftTime(int[] arrCooked)
	{
		int total = 0;
		for(int i=0 ; i<arrCooked.length ; i++)
		{
			total = total + arrCooked[i];
		}
		return total;
	}
	
}
