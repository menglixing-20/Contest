package contest2021;

public class Final1 {

	public static void main(String[] args) 
	{ 
		// TODO Auto-generated method stub
		int leftA = 2600;
		int leftB = 5000;
		int leftC = 1900;
		
		int needA = 60;
		int needB = 110;
		int needC = 50;
		 
		int tempA= (leftA/needA);
		int tempB= (leftB/needB);
		int tempC= (leftC/needC);
		
		
		if(tempA <= tempB && tempA <= tempC)
		{
			System.out.println(tempA+"sss");
			System.out.println((leftA-(tempA*needA))+"  "+(leftB-(tempA*needB))+"  "+(leftC-(tempA*needC)));
		}
		else if(tempB <= tempA && tempB <= tempC)
		{
			System.out.println(tempB);
			System.out.println((leftA-(tempB*needA))+"  "+(leftB-(tempB*needB))+"  "+(leftC-(tempB*needC)));
		}
		else if(tempC <= tempA && tempC <= tempB)
		{
			System.out.println(tempC);
			System.out.println((leftA-(tempC*needA))+"  "+(leftB-(tempC*needB))+"  "+(leftC-(tempC*needC)));
		}
		
	}

}
