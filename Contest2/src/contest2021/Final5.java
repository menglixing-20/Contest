package contest2021;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Final5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[6];
		array1[0]=14;
		array1[1]=6;
		array1[2]=12;
		array1[3]=7;
		array1[4]=8;
		array1[5]=6;
		
		Arrays.sort(array1);
//		for(int k=0; k<array1.length; k++)
//		{
//		   System.out.println(array1[k]);
//		}
//		
		ArrayList<String> list = new ArrayList();
		
		boolean b = check24(array1,0,0,list);

		if(b)
		{
			Iterator<String> ite = list.iterator();
			while(ite.hasNext())
			{
			   String s = ite.next();
			   System.out.println(s);
			}
		}
		else
		{
			System.out.println("NONE");
		}
	}

	private static boolean check24(int[] array1, int i, int initial, 
			ArrayList<String> lists) 
	{
		// TODO Auto-generated method stub
//		System.out.println("------------------------------");
//		Iterator<String> ite = lists.iterator();
//		while(ite.hasNext())
//		{
//		   String s = ite.next();
//		   System.out.println(s);
//		}
//		System.out.println();
//		System.out.println();
		
		if(initial == 24) 
		{
			return true;
		}
		
		if(i >= array1.length)
		{
			return false;
		}
		
		for(int k=i; k<array1.length; k++)
		{
			initial = initial + array1[k];
			lists.add(""+array1[k]);
			boolean b = check24(array1, k+1, initial,
					lists);
			if(b)
			{
				return b;
			}
			else
			{
				lists.remove(lists.size()-1);
				initial = initial-array1[k];
			}
		}
		
		return false;
		
	}
	
	
	
}
