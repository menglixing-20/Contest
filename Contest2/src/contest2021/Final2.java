package contest2021;

public class Final2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] array1 = new int[6];
		array1[0]=6;
		array1[1]=10;
		array1[2]=8;
		array1[3]=6;
		array1[4]=3;
		array1[5]=-11;
		
		int smallest=array1[0];
		int largest=array1[0];
		
		for(int i=0; i<array1.length; i++)
		{
			if(array1[i] < smallest)
			{
				smallest = array1[i];
			}
			
			if(array1[i] > largest)
			{
				largest = array1[i];
			}
		}
//		Ssystem.out.println("smallest = "+smallest);
//		System.out.println("largest = "+largest);
		
		int[] arrayFinal = new int[6];
		int head=0;
		for(int k=0, tail=arrayFinal.length-1 ; k<arrayFinal.length; k++)
		{
			if(array1[k] == smallest)
			{
				arrayFinal[head] = smallest;
				head++;
			}
			else if(array1[k] == largest)
			{
				arrayFinal[tail] = largest;
				tail--;
			}
		}
		
		
		for(int k=0; k<array1.length; k++)
		{
			if(array1[k] != smallest && array1[k] != largest)
			{
				arrayFinal[head] = array1[k];
				head++;
			}
		}
		
		
		for(int k=0; k<arrayFinal.length; k++)
		{
			System.out.println(arrayFinal[k]);
		}
	}

}
