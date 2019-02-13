package newton_forward_backward_interpolation;

import java.util.Scanner;

public class Newtons_Backward_Interpolation {
	  
	public static void main(String[] args) 
	{ 
		Scanner in = new Scanner(System.in);
		Factorial f = new Factorial();
		P_Calculator p = new P_Calculator();
		
	    // Number of values given
	    System.out.print("Give the number of elements: ");
	    int n = in.nextInt();
	    
	    double[] x = new double[n]; 
	    System.out.print("Give the values of x: ");
	    for(int i=0;i<n;i++)
	    {
	    	x[i] = in.nextDouble();
	    }
	      
	    // y[][] is used for difference table 
	    // with y[][0] used for input 
	    
	    System.out.print("Give the values of y: ");
	    double y[][]=new double[n][n]; 
	    for(int i=0;i<n;i++)
	    {
	    	y[i][0] = in.nextDouble();
	    } 
	  
	    // Calculating the forward difference 
	    // table 
	    for (int i = 1; i < n; i++) 
	    { 
	        for (int j = 0; j < n - i; j++) 
	            y[j][i] = y[j + 1][i - 1] - y[j][i - 1]; 
	    } 
	  
	    // Value to interpolate at 
	    System.out.print("Give the pointing value: ");
	    double value = in.nextDouble(); 
	  
	    // initializing u and sum 
	    double sum = y[0][0]; 
	    double u = (value - x[0]) / (x[1] - x[0]); 
	    for (int i = 1; i < n; i++) { 
	        sum = sum + (p.p_cal(u, i) * y[0][i]) / 
	                                f.fact(i); 
	    } 
	  
	    System.out.println("\n Value at "+value+" is "+String.format("%.6g%n",sum)); 
	} 
}
