package contest2024;

import java.util.Arrays;
import java.util.Stack;

public class Q11 {

	static Point start = new Point(-4,-22);
	static Point end = new Point(7,46);
	
	static Point[] actions = new Point[3];
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		actions[0] = new Point(3,22);
		actions[1] = new Point(12,6);
		actions[2] = new Point(2,2);
		
		Arrays.sort(actions);
		
		for(int i=0 ; i<actions.length ; i++)
		{
			System.out.println(actions[i].getX());
		}
		
		Stack<Point> actionStack = new Stack<Point>();
		

		boolean found = calculate(actionStack, start.getX(), start.getY(),0);
		System.out.println(found);

		if(found)	
		{
			while(actionStack.isEmpty() == false)
			{
				Point a = actionStack.pop();
				System.out.println(a.getX()+","+a.getY());
			}
		}
		
	}
	
	static boolean calculate(Stack<Point> actionStack,int deltax, int deltay, int index)
	{
		//System.out.println("deltax="+deltax+" , deltay"+deltay);
		
		if(index == -1 || index == actions.length)
		{
			return false;
		}
		
		if(actions[index].getX() + deltax  ==  end.getX()  &&  
				actions[index].getY() + deltay  ==  end.getY())
		{
			//System.out.println("push="+actions[index].getX()+" , "+actions[index].getY());
			actionStack.push(new Point(actions[index].getX() , actions[index].getY()));
			return true;
		}
		else if(actions[index].getX() + deltax  >  end.getX()  ||  
				actions[index].getY() + deltay  >  end.getY())
		{
			if(index+1 == actions.length)
			{
				if(actionStack.empty() == false) 
				{
					Point a = actionStack.pop();
					//System.out.println("pop="+a.getX()+" , "+a.getY());
				}
			}
			return calculate(actionStack,deltax, deltay,  index+1);
			
		}
		else
		{
			System.out.println("push="+actions[index].getX()+" , "+actions[index].getY() +"     deltaX="+deltax+"    deltaY="+deltay);
			actionStack.push(new Point(actions[index].getX() , actions[index].getY()));
			boolean found =  calculate(actionStack,actions[index].getX()+ deltax, actions[index].getY()+ deltay,  index);
			
			return found;
		}
		
	}
	

}

class Point implements Comparable<Point>
{
	private int x=0;
	private int y=0;
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		if (this.x == o.getX()) {
            return 0;
        } else if (this.x > o.getX()) {
            return -1;
        } else {
            return 1;
        }
	}
	
}
