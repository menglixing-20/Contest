package contest2024;

import java.math.BigDecimal;

public class Q8 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String xy1="18 10";
		String xy2="14 46";
		String xy3="7 15";
		String xy4="51 29";
		
		String[] xy1Arr = xy1.split(" ");
		String[] xy2Arr = xy2.split(" ");
		String[] xy3Arr = xy3.split(" ");
		String[] xy4Arr = xy4.split(" ");
		
		int[] xyAIntArr = {Integer.parseInt(xy1Arr[0]) , Integer.parseInt(xy1Arr[1])};
		int[] xyBIntArr = {Integer.parseInt(xy2Arr[0]) , Integer.parseInt(xy2Arr[1])};
		int[] xyCIntArr = {Integer.parseInt(xy3Arr[0]) , Integer.parseInt(xy3Arr[1])};
		int[] xyDIntArr = {Integer.parseInt(xy4Arr[0]) , Integer.parseInt(xy4Arr[1])};
		
		double distAB = getDistance(xyAIntArr , xyBIntArr);
		double distAC = getDistance(xyAIntArr , xyCIntArr);
		double distAD = getDistance(xyAIntArr , xyDIntArr);
		double distBC = getDistance(xyBIntArr , xyCIntArr);
		double distBD = getDistance(xyBIntArr , xyDIntArr);
		double distCD = getDistance(xyCIntArr , xyDIntArr);
		
		if(distAB > distAC &&
				distAB > distAD && 
				distAB > distBC && 
				distAB > distBD && 
				distAB > distCD)
		{
			double area1 = getArea(distAB, distAC, distBC);
			double area2 = getArea(distAB, distAD, distBD);
			System.out.println("area="+new BigDecimal(area1+area2).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		}
		else if(distAC > distAB &&
				distAC > distAD && 
				distAC > distBC && 
				distAC > distBD && 
				distAC > distCD)
		{
			double area1 = getArea(distAC, distAB, distBC);
			double area2 = getArea(distAC, distAD, distCD);
			System.out.println("area="+new BigDecimal(area1+area2).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		}
		else if(distAD > distAB &&
				distAD > distAC && 
				distAD > distBC && 
				distAD > distBD && 
				distAD > distCD)
		{
			double area1 = getArea(distAD, distAB, distBD);
			double area2 = getArea(distAD, distAC, distCD);
			System.out.println("area="+new BigDecimal(area1+area2).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		}
		else if(distBC > distAB &&
				distBC > distAC && 
				distBC > distAD && 
				distBC > distBD && 
				distBC > distCD)
		{
			double area1 = getArea(distBC, distAB, distAC);
			double area2 = getArea(distBC, distBD, distCD);
			System.out.println("area="+new BigDecimal(area1+area2).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		}
		else if(distBD > distAB &&
				distBD > distAC && 
				distBD > distAD && 
				distBD > distBC && 
				distBD > distCD)
		{
			double area1 = getArea(distBD, distBC, distCD);
			double area2 = getArea(distBD, distAB, distAD);
			
			System.out.println("area="+new BigDecimal(area1+area2).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		}
		else if(distCD > distAB &&
				distCD > distAC && 
				distCD > distAD && 
				distCD > distBC && 
				distCD > distBD)
		{
			double area1 = getArea(distCD, distAC, distAD);
			double area2 = getArea(distCD, distBC, distBD);
			
			System.out.println("area="+new BigDecimal(area1+area2).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		}
	}

	static double getDistance(int[] p1, int[] p2)
	{
		
		int temp = ((p2[0] - p1[0]) * (p2[0] - p1[0])) + ((p2[1] - p1[1]) * (p2[1] - p1[1])) ;
		
		return Math.sqrt(temp);
	}
	
	static double getArea(double len1, double len2, double len3)
	{
		double s = (len1+len2+len3) / 2;
		
		double temp = s*(s-len1)*(s-len2)*(s-len3) ;
		
		return Math.sqrt(temp);
	}
}
