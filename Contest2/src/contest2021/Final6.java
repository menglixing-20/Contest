package contest2021;
import java.math.BigDecimal;

public class Final6 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int qty=4;
		
		Point[] ps = new Point[qty];
		ps[0] = new Point(2,3);
		ps[1] = new Point(2.866025,3.5);
		ps[2] = new Point(3,3);
		ps[3] = new Point(2.866025,2.5);
		
		
		Point westP = null;
		Point eastP = null;
		for(int i=0;i<ps.length;i++)
		{
			Point p = ps[i];
			// check west
			if(westP == null)
			{
				westP = p;
			}
			else if(p.x == westP.x)
			{
				if(p.y < westP.y)
				{
					westP = p;
				}
			}
			else if(p.x < westP.x)
			{
				westP = p;
			}
			
			// check east
			if(eastP == null)
			{
				eastP = p;
			}
			else if(p.x == eastP.x)
			{
				if(p.y > eastP.y)
				{
					eastP = p;
				}
			}
			else if(p.x > eastP.x)
			{
				eastP = p;
			}
		}
		
		westP.linked = true;
		Point linkingRoad = westP;
		double totalDistance = 0.00;
		while(linkingRoad != eastP)
		{
//			Point p = ps[i];
			
			double shortestPath = 99999999.9999999;
			Point shortestPoint = null;
			for(int k=0;k<ps.length;k++)
			{
				Point p2 = ps[k];
				if(p2.linked == false)
				{
					double sss = getDistant(linkingRoad, p2);
					if(sss < shortestPath)
					{
						shortestPath = sss;
						shortestPoint = p2;
					}
					
				}
			}
			totalDistance = totalDistance + shortestPath;
			shortestPoint.linked = true;
			linkingRoad = shortestPoint;
			
		}
		
		System.out.println("" + new BigDecimal(totalDistance).setScale(7, BigDecimal.ROUND_HALF_UP));
	}

	private static double getDistant(Point point1, Point point2) 
	{
		// TODO Auto-generated method stub
		double tempx = (point2.x - point1.x) * (point2.x - point1.x);
		double tempy = (point2.y - point1.y) * (point2.y - point1.y);
		double dis = Math.sqrt(tempx + tempy);
		return dis;
	}

}



class Point
{
	
	double x=0;
	double y=0;
	boolean linked = false;
	
	Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
}
