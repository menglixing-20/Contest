package quiz;

import java.util.Scanner;

public class TwoPointDistance {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        // 获取第一个点的坐标
        System.out.print("请输入第一个点的X坐标: ");
        int x1 = scanner.nextInt();
        System.out.print("请输入第一个点的Y坐标: ");
        int y1 = scanner.nextInt();

        // 获取第二个点的坐标
        System.out.print("请输入第二个点的X坐标: ");
        int x2 = scanner.nextInt();
        System.out.print("请输入第二个点的Y坐标: ");
        int y2 = scanner.nextInt();
        scanner.close();
        
        
        boolean isOnXYaxis = (x1 == 0 || x2 == 0 || y1 == 0 || y2==0);
        if(isOnXYaxis)
        {
        	System.out.printf("两点不可在 X轴 或 Y轴 之上");

        }
        else
        {
            // 计算两个点之间的距离
            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            
            System.out.printf("两点之间的距离为: %.2f\n", distance);
        }


       
	}

}
