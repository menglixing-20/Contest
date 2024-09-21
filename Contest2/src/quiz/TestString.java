package quiz;
public class TestString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "\u0048\u0065\u006C\u006C\u006F";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println("----------------------------------------------------------------------");

		System.out.println("宣告字串、读取长度。");
		String s3 = new String("Hello");
		String s4 = new String("\u0048\u0065\u006C\u006C\u006F");
		
		char[] ch = {'H','e','l','l','o'};
		String s5 = new String(ch);
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		int length = s3.length();
		System.out.println(length);
//		
		System.out.println("----------------------------------------------------------------------");

		System.out.println("字串连接");
		String s6 = s3.concat(" ").concat(s4);
		System.out.println(s6);
		
		String s7 = s3 +" "+ s4;
		System.out.println(s7);
//		
		System.out.println("----------------------------------------------------------------------");
//
		System.out.println("字串查找");
		char chAt = s6.charAt(4);
		System.out.println(chAt);
		
		String sub = s6.substring(2, 5);
		System.out.println(sub);
		
		int find1 = s6.indexOf("H");
		System.out.println(find1);
		
		int find2 = s6.indexOf("lo");
		System.out.println(find2);
		
		int find3 = s6.indexOf("LO");
		System.out.println(find3);
		
		int find4 = s6.indexOf("He",5);
		System.out.println(find4);
		
		System.out.println("----------------------------------------------------------------------");

		System.out.println("字串比较");
		String s8 = "Hello";
		String s9 = "HELLO";
		
		if(s8.equals(s9))
		{
			System.out.println("s8 = s9");
		}
		else
		{
			System.out.println("s8 != s9");
		}
		
		
		if(s8.equalsIgnoreCase(s9))
		{
			System.out.println("s8 = s9");
		}
		else
		{
			System.out.println("s8 != s9");
		}
		
		boolean b1 = s8.contains("he");
		System.out.println(b1);
		
		boolean b2 = s8.startsWith("He");
		System.out.println(b2);
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("字串更替与切割");
		
		String s10 = "I am xxx friend, not xxx foe.";
		String s11 = s10.replace("xxx", "your");
		System.out.println(s11);
		
		String[] arrayString = s11.split(" ");
		for(int i=0; i<arrayString.length; i++)
		{
			System.out.println(arrayString[i]);
		}
	}

}
