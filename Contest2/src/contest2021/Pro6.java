package contest2021;


public class Pro6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10;
		int n2=100;
		if(n1 > n2)
		{
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		int total=0;
		for(int i=n1 ; i<=n2; i++)
		{
			total = total + i;
		}
		
		System.out.println(total);
	}

}
