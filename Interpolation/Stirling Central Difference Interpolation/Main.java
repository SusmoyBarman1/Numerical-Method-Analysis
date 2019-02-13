package stirling_central_difference;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) 
    { 
		Stirling_Central sc = new Stirling_Central();
		Scanner in = new Scanner(System.in);
		
		System.out.print("Give the number of elements: ");
        int n = in.nextInt(); 
        
        double[] x = new double[n]; 
        double[] fx = new double[n];
        
        System.out.print("Give the values of x: ");
        for(int i=0;i<n;i++)
        {
        	x[i] = in.nextDouble();
        }
        
        System.out.print("Give the values of y: ");
        for(int i=0;i<n;i++)
        {
        	fx[i] = in.nextDouble();
        }
  
        // Value to calculate f(x) 
        System.out.print("Give the value of pointing position: ");
        double x1 = in.nextDouble(); 
  
        sc.Stirling(x, fx, x1, n); 
    } 
}
