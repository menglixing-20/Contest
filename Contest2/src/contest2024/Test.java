package contest2024;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String sen= "sdad,sdasda asdagery rtey4 ewre;sfdsdfs? dfsdfsfs dfsdfsffg 564rrd...etertre";
		char[] charsss = sen.toCharArray();
		int alphabetAndNum= 0;
		for(int i=0;i<charsss.length;i++)
		{
			if(charsss[i] >= 'a' && charsss[i] <= 'z' || charsss[i] >= 'A' && charsss[i] <= 'Z' || charsss[i] >= '0' && charsss[i] <= '9')
			{
				alphabetAndNum++;
			}
		}
		System.out.println(charsss.length);
		System.out.println(alphabetAndNum);
		
		String sentences= "sdad,sdasda asdagery rtey4 ewre;sfdsdfs? dfsdfsfs dfsdfsffg 564rrd...etertre";
		
		
		String s = sentences.replaceAll("[^a-zA-Z0-9]","#");
		System.out.println(s);
		
		String[] sArr = s.split("#");
		
		for(int i=0;i<sArr.length;i++)
		{
//			if(!sArr[i].equals(""))
//			{
				System.out.println(sArr[i]);
//			}
			
		}
	}

}
