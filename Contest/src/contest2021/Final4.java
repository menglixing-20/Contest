package contest2021;

public class Final4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paragraph="ggaccatgaccaccatttaaa";
		
		
		paragraph = paragraph.toUpperCase();
		paragraph = paragraph.replace('T', 'U');
		
		System.out.println(paragraph);
		
		int ind = paragraph.indexOf("AUG");
		System.out.println(ind+1);
		
		int end1 = paragraph.indexOf("UAG");
		int end2 = paragraph.indexOf("UAA");
		int end3 = paragraph.indexOf("UGA");
		
//		System.out.println(end1);
		
		
		if(end1 != -1)
		{
			String subPar= paragraph.substring(ind, end1);
			System.out.println(subPar.length() / 3);
			for(int i=0; i<subPar.length(); i+=3)
			{
				System.out.print(subPar.substring(i, i+3)+" ");
			}
		}
		else if(end2 != -1)
		{
			String subPar= paragraph.substring(ind, end2);
			System.out.println(subPar.length() / 3);
			for(int i=0; i<subPar.length(); i+=3)
			{
				System.out.print(subPar.substring(i, i+3)+" ");
			}
		}
		else if(end3 != -1)
		{
			String subPar= paragraph.substring(ind, end3);
			System.out.println(subPar.length() / 3);
			for(int i=0; i<subPar.length(); i+=3)
			{
				System.out.print(subPar.substring(i, i+3)+" ");
			}
		}
		
	}

}
