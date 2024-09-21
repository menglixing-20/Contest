package contest2021;
import java.util.HashMap;

public class Final7 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<String, String> dec = new HashMap<String, String>();
		dec.put("A", "0");
		dec.put("B", "1");
		dec.put("C", "2");
		dec.put("D", "3");
		dec.put("E", "4");
		dec.put("F", "5");
		dec.put("G", "6");
		dec.put("H", "7");
		dec.put("I", "8");
		dec.put("J", "9");
		dec.put("K", "10");
		dec.put("L", "11");
		dec.put("M", "12");
		dec.put("N", "13");
		dec.put("O", "14");
		dec.put("P", "15");
		dec.put("Q", "16");
		dec.put("R", "17");
		dec.put("S", "18");
		dec.put("T", "19");
		dec.put("U", "20");
		dec.put("V", "21");
		dec.put("W", "22");
		dec.put("X", "23");
		dec.put("Y", "24");
		dec.put("Z", "25");
		
		HashMap<String, String> enc = new HashMap<String, String>();
		enc.put("0", "A");
		enc.put("1", "B");
		enc.put("2", "C");
		enc.put("3", "D");
		enc.put("4", "E");
		enc.put("5", "F");
		enc.put("6", "G");
		enc.put("7", "H");
		enc.put("8", "I");
		enc.put("9", "J");
		enc.put("10", "K");
		enc.put("11", "L");
		enc.put("12", "M");
		enc.put("13", "N");
		enc.put("14", "O");
		enc.put("15", "P");
		enc.put("16", "Q");
		enc.put("17", "R");
		enc.put("18", "S");
		enc.put("19", "T");
		enc.put("20", "U");
		enc.put("21", "V");
		enc.put("22", "W");
		enc.put("23", "X");
		enc.put("24", "Y");
		enc.put("25", "Z");
		
		
		
		String enOrdec = "D";
		String input1 = "HSVVPHCIMSNX";
		char[] i1 = input1.toCharArray();
		
		
		String input2 = "LOVE";
		
		while(input2.length() < i1.length)
		{
			input2 = input2 + input2;
		}
		
		char[] i2 = input2.substring(0, i1.length).toCharArray();
		
		System.out.println(i2);
		
		String[] finalStr = new String[i1.length];
		for(int i=0; i<i1.length; i++)
		{
			int num1 = Integer.parseInt(dec.get(i1[i]+""));
			int num2 = Integer.parseInt(dec.get(i2[i]+""));
			if(enOrdec.equals("E"))
			{
				if(num1+num2 > 26)
				{
					String key = ((num1+num2)-26) + "";
					finalStr[i] = enc.get(key);
				}
				else
				{
					String key = (num1+num2) + "";
					finalStr[i] = enc.get(key);
				}
			}
			else if(enOrdec.equals("D"))
			{
				if(num1 < num2)
				{
					String key = ((num1+26)-num2) + "";
					finalStr[i] = enc.get(key);
				}
				else
				{
					String key = (num1-num2) + "";
					finalStr[i] = enc.get(key);
				}
			}
			
		}
		
		for(int i=0; i<finalStr.length; i++)
		{
			System.out.print(finalStr[i]);
		}
		
	}
	
	

}
