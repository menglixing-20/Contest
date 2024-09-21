package contest2021;
import java.util.HashMap;
import java.util.Map;

public class Final3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String paragraph="We approached the last hundred metres. I was only half a motorcycle�s " + 
				"length behind him. With a final flick, we crossed the finish line. We " + 
				"looked up at the giant screen. A camera replay was being shown. It was " + 
				"too close to call a win-ner. �And the win-ner is Will!� the commentator " + 
				"boomed the sound system.";
		
		paragraph = paragraph.toUpperCase();
		paragraph = paragraph.replaceAll("[^a-zA-Z0-9^-]", " ");
		System.out.println("sss="+paragraph);
		
//		paragraph = paragraph.toUpperCase();
//		paragraph = paragraph.replace(',', ' ');
//		paragraph = paragraph.replace(';', ' ');
//		paragraph = paragraph.replace('.', ' ');
//		paragraph = paragraph.replace('!', ' ');
//		paragraph = paragraph.replace('"', ' ');
//		paragraph = paragraph.replace('�', ' ');
//		paragraph = paragraph.replace('�', ' ');
//		paragraph = paragraph.replace('?', ' ');
//		paragraph = paragraph.replace('\'', ' ');
//		paragraph = paragraph.replace('(', ' ');
//		paragraph = paragraph.replace(')', ' ');
		
		Map<String,String> checkDuplicateMap= new HashMap<String,String>();
		
		int total=0;
		String[] s = paragraph.split(" ");
		for(int i=0; i<s.length; i++)
		{
			char[] tempS = s[i].toCharArray();
			int count=0;
			for(int k=0; k<tempS.length; k++)
			{
				if(tempS[k] == 'A' || tempS[k] == 'E' ||tempS[k] == 'I' ||tempS[k] == 'O' ||tempS[k] == 'U')
				{
					count++;
				}
			}
			if(count >= 3)
			{
				if(checkDuplicateMap.get(s[i]) == null)
				{
					System.out.println(s[i]);
					total++;
					checkDuplicateMap.put(s[i], s[i]);
				}
				
			}
		}
		
		System.out.println(total);
	}

}
