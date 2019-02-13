package straight_Line;

import java.util.Scanner;

public class Main {

	// Driver main function 
    public static void main(String args[]) 
    { 
    	Approximation ap = new Approximation();
    	Scanner in = new Scanner(System.in);
    	
    	System.out.print("Give the number of elements: ");
    	int n = in.nextInt();
    	
    	System.out.print("Give the values of x: ");
    	double x[] = new double[n];
    	for(int i=0;i<n;i++)
    	{
    		x[i] = in.nextDouble();
    	}
        
        double y[] = new double[n]; 
        System.out.print("Give the values of Y: ");
        for(int i=0;i<n;i++)
        {
        	y[i] = in.nextDouble();
        }
        ap.bestApproximate(x, y); 
    } 
}
