package lagrange_interpolation;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		LagrangeInterpolation li = new LagrangeInterpolation();
		// creating an array of 4 known data points 
		// Data f[] = {{0,2}, {1,3}, {2,12}, {5,147}}; 
		//int n = 4;
		//double x[] = {0,1,2,5};
		//double y[] = {2,3,12,147};
		System.out.println("Put the number of elements: ");
		int n = in.nextInt();
		
		double[] x = new double[n];
		System.out.print("Give the values of x: ");
		for(int i=0;i<n;i++)
		{
			x[i] = in.nextDouble();
		}
		
		double[] y = new double[n];
		System.out.print("Give the values of y: ");
		for(int i=0;i<n;i++)
		{
			y[i] = in.nextDouble();
		}
			
		System.out.print("Give the pointing value: ");
        double x1 = in.nextDouble();
        System.out.println("Value of "+x1+" is: "+li.interpolate(x,y,x1,n));
	}
}
