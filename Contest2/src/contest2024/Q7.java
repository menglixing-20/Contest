package contest2024;

import java.math.BigDecimal;

public class Q7 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s[] = {"1.45;0.60/10.30;6.35;3.21/1.99;2.88/0/0/0/0",
				      "1.25;10.60/5.40;1.20/1.80;7.45/0/0/2.45;1.55/3.5;5.55"};
		
		DeliveryDay[] alldays = new DeliveryDay[2];
		for(int i=0;i<s.length;i++)
		{
			String[] eachDay = s[i].split("/");
			DeliveryDay dd = new DeliveryDay();
			dd.setMondays(eachDay[0]);
			dd.setTuesday(eachDay[1]);
			dd.setWednesday(eachDay[2]);
			dd.setThursday(eachDay[3]);
			dd.setFriday(eachDay[4]);
			dd.setSaturday(eachDay[5]);
			dd.setSunday(eachDay[6]);
			alldays[i] = dd;
			
//			System.out.println("largest="+dd.getMondayIncome());
		}
		
		double largest = 0.00;
		int qty = 0;
		int line = 0;
		String dayString="";
		for(int k=0;k<alldays.length;k++)
		{
			DeliveryDay dd = alldays[k];
			if(dd.getMondayIncome() > largest)
			{
				largest = dd.getMondayIncome();
				qty = dd.getMondayQty();
				line = k+1;
				dayString="Monday";
//				System.out.println("largest="+largest);
			}
			if(dd.getTuesdayIncome() > largest)
			{
				largest = dd.getTuesdayIncome();
				qty = dd.getTuesdayQty();
				line = k+1;
				dayString="Tuesday";
//				System.out.println("largest="+largest);
			}
			if(dd.getWednesdayIncome() > largest)
			{
				largest = dd.getWednesdayIncome();
				qty = dd.getWednesdayQty();
				line = k+1;
				dayString="Wednesday";
//				System.out.println("largest="+largest);
			}
			if(dd.getThursdayIncome() > largest)
			{
				largest = dd.getThursdayIncome();
				qty = dd.getThursdayQty();
				line = k+1;
				dayString="Thursday";
//				System.out.println("largest="+largest);
			}
			if(dd.getFridayIncome() > largest)
			{
				largest = dd.getFridayIncome();
				qty = dd.getFridayQty();
				line = k+1;
				dayString="Friday";
//				System.out.println("largest="+largest);
			}
			if(dd.getSaturdayIncome() > largest)
			{
				largest = dd.getSaturdayIncome();
				qty = dd.getSaturdayQty();
				line = k+1;
				dayString="Saturday";
//				System.out.println("largest="+largest);
			}
			if(dd.getSundayIncome() > largest)
			{
				largest = dd.getSundayIncome();
				qty = dd.getSundayQty();
				line = k+1;
				dayString="Sunday";
//				System.out.println("largest="+largest);
			}
			
		}
		
		
		System.out.println(line+"  "+dayString+"   "+qty+"   "+new BigDecimal(largest).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
	}

}

class DeliveryDay
{
	String mondays="";
	String tuesday="";
	String wednesday="";
	String thursday="";
	String friday="";
	String saturday="";
	String sunday="";
	public void setMondays(String mondays) {
		this.mondays = mondays;
	}
	public void setTuesday(String tuesday) {
		this.tuesday = tuesday;
	}
	public void setWednesday(String wednesday) {
		this.wednesday = wednesday;
	}
	public void setThursday(String thursday) {
		this.thursday = thursday;
	}
	public void setFriday(String friday) {
		this.friday = friday;
	}
	public void setSaturday(String saturday) {
		this.saturday = saturday;
	}
	public void setSunday(String sunday) {
		this.sunday = sunday;
	}
	
	public double getMondayIncome()
	{
		String[] s = this.mondays.split(";");
		
		double total=0.00;
		for(int i=0;i<s.length;i++)
		{
			total = total + Double.parseDouble(s[i]);
		}
		return total;
	}
	
	public int getMondayQty()
	{
		String[] s = this.mondays.split(";");
		return s.length;
	}
	
	
	
	public double getTuesdayIncome()
	{
		String[] s = this.tuesday.split(";");
		
		double total=0.00;
		for(int i=0;i<s.length;i++)
		{
			total = total + Double.parseDouble(s[i]);
		}
		return total;
	}
	
	public int getTuesdayQty()
	{
		String[] s = this.tuesday.split(";");
		return s.length;
	}
	
	public double getWednesdayIncome()
	{
		String[] s = this.wednesday.split(";");
		
		double total=0.00;
		for(int i=0;i<s.length;i++)
		{
			total = total + Double.parseDouble(s[i]);
		}
		return total;
	}
	
	public int getWednesdayQty()
	{
		String[] s = this.wednesday.split(";");
		return s.length;
	}
	
	public double getThursdayIncome()
	{
		String[] s = this.thursday.split(";");
		
		double total=0.00;
		for(int i=0;i<s.length;i++)
		{
			total = total + Double.parseDouble(s[i]);
		}
		return total;
	}
	
	public int getThursdayQty()
	{
		String[] s = this.thursday.split(";");
		return s.length;
	}
	
	public double getFridayIncome()
	{
		String[] s = this.friday.split(";");
		
		double total=0.00;
		for(int i=0;i<s.length;i++)
		{
			total = total + Double.parseDouble(s[i]);
		}
		return total;
	}
	
	public int getFridayQty()
	{
		String[] s = this.friday.split(";");
		return s.length;
	}
	
	public double getSaturdayIncome()
	{
		String[] s = this.saturday.split(";");
		
		double total=0.00;
		for(int i=0;i<s.length;i++)
		{
			total = total + Double.parseDouble(s[i]);
		}
		return total;
	}
	
	public int getSaturdayQty()
	{
		String[] s = this.saturday.split(";");
		return s.length;
	}
	
	public double getSundayIncome()
	{
		String[] s = this.sunday.split(";");
		
		double total=0.00;
		for(int i=0;i<s.length;i++)
		{
			total = total + Double.parseDouble(s[i]);
		}
		return total;
	}
	
	public int getSundayQty()
	{
		String[] s = this.sunday.split(";");
		return s.length;
	}
	
}