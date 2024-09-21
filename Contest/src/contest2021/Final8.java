package contest2021;
import java.util.HashMap;

public class Final8 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<String, String> moseMap = new HashMap<String, String>();
		moseMap.put("-----", "0");
		moseMap.put(".----", "1");
		moseMap.put("..---", "2");
		moseMap.put("...--", "3");
		moseMap.put("....-", "4");
		moseMap.put(".....", "5");
		moseMap.put("-....", "6");
		moseMap.put("--...", "7");
		moseMap.put("---..", "8");
		moseMap.put("----.", "9");
		
//		char c = (char)97;
//		System.out.println(c);
		String decodingDigit = getDecodingDigit(moseMap , "----.---..----.--......-----..-....---.. -....-....--...----.---..----......--...");
		
		String digitToMsg = digitToMsg(decodingDigit);
		
		System.out.println(digitToMsg);
//		System.out.println(decodingDigit);
		
		
	}

	private static String digitToMsg(String decodingDigit)
	{
		// TODO Auto-generated method stub
		String decoding = "";
		for(int i=0; i<decodingDigit.length(); )
		{
			if(decodingDigit.substring(i, i+1).equals(" "))
			{
				decoding = decoding + " ";
				i++;
			}
			
			String sub = decodingDigit.substring(i, i+2);
			int number = Integer.parseInt(sub);
			if(number < 33)
			{
			    sub = decodingDigit.substring(i, i+3);
			    number = Integer.parseInt(sub);
			    i=i+3;
			}
			else
			{
				i=i+2;
			}
			
			// check valid msg
			if(number == 32 || (number>=65 && number<=90) || (number>=97 && number<=122)  )
			{
				char c = (char)number;
				decoding = decoding + c;
			}
			
		}
		
		if(decoding.replace(" ", "").equals(""))
		{
			return "No Valid message";
		}
		return decoding;
	}

	private static String getDecodingDigit(HashMap<String, String> moseMap, 
			String moseMessage) 
	{
		// TODO Auto-generated method stub
		String decoding = "";
		
		for(int i=0; i<moseMessage.length(); i=i+5)
		{
			if(moseMessage.substring(i, i+1).equals(" "))
			{
				decoding = decoding + " ";
				i++;
			}
			String sub = moseMessage.substring(i, i+5);
			decoding = decoding + moseMap.get(sub);
		}
		
		return decoding;
	}
}
