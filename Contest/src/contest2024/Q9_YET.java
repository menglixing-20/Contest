package contest2024;

import java.util.ArrayList;

public class Q9_YET {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char[] s1="daat".toCharArray();
		char[] s2="doat".toCharArray();
		
		ArrayList<String> s1List = new ArrayList<String>();
		ArrayList<String> s2List = new ArrayList<String>();
		
		for(int i=0; i<s1.length ; i++)
		{
			s1List.add(String.valueOf(s1[i])); 
		}
		for(int i=0; i<s2.length ; i++)
		{
			s2List.add(String.valueOf(s2[i])); 
		}
		
		
		for(int index=0; ; index++)
		{
			if(index == s1List.size() || index == s2List.size())
			{
//				System.out.print("   index="+index);
				break;
			}
			
//			if(index == s1List.size()-1 || index == s2List.size()-1)  // last char
//			{
//				if(s1List.size() == s2List.size() &&  
//						s1List.get(index).equals(s2List.get(index)))
//				{
//					// do nothing
//				}
//				else if(s1List.size() > s2List.size())
//				{
//					s2List.add(index, "#");
//				}
//				else
//				{
//					s1List.add(index, "#");
//				}
//				
//				break;
//			}
			
			
			if(s1List.get(index).equals(s2List.get(index)))
			{
				// do nothing
			}
			else
			{
				if(s1List.size() <= s2List.size())
				{
					int dist = getDistance(s1List, s2List, index);
					if(dist == 0)
					{
						// not found
						// do nothing
					}
					else
					{
						for(int k=0; k<dist; k++,index++)
						{
							s1List.add(index,"#"); 
						}
					}
				}
				else
				{
//					System.out.print("   index="+index);
					int dist = getDistance(s2List, s1List, index);
//					System.out.print("   dist="+dist);
					if(dist == 0)
					{
						// not found
						// do nothing
					}
					else
					{
						for(int k=0; k<dist; k++,index++)
						{
//							System.out.print("add");
							s2List.add(index,"#"); 
						}
					}
					
//					System.out.println();
//					for(int i=0; i<s2List.size(); i++)
//						{
//							System.out.print(s2List.get(i));		
//						}
				}
			}
			
			
		}
		
		int totalDiff = 0;
		for(int i=0; i<s1List.size(); i++)
		{
			if(! s1List.get(i).equals(s2List.get(i)))
			{
				totalDiff++;
			}
		}
		
		System.out.print("totalDiff="+totalDiff);		
	}

	
	static int getDistance(ArrayList<String> from, ArrayList<String> to, int fromIndex)
	{
		boolean found=false;
		int toIndex=fromIndex;
		while(toIndex<to.size())
		{
			if(from.get(fromIndex).equals(to.get(toIndex)))
			{
				found = true;
				break;
			}
			toIndex++;
		}
		
		if(found) return (toIndex - fromIndex);
		else return 0;
	}
	
}
