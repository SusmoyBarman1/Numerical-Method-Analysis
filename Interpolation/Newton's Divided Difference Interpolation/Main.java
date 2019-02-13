package newtons_divided_difference;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) 
	{ 
		NewtonsDividedDifference ndd = new NewtonsDividedDifference();
		Scanner in = new Scanner(System.in);
		
	    // number of inputs given 
		System.out.print("Give the number of elements: ");
	    int n = in.nextInt();
	    
	    float value, sum; 
	    float y[][]=new float[n][n]; 
	    
	    float[] x = new float[n];
	    
	    System.out.print("Give the values of x: ");
	    for(int i=0;i<n;i++)
	    {
	    	x[i] = in.nextFloat();
	    }
	  
	    // y[][] is used for divided difference 
	    // table where y[][0] is used for input 
	    System.out.print("Give the values of y: ");
	    for(int i=0;i<n;i++)
	    {
	    	y[i][0] = in.nextFloat();
	    } 
	  
	    // calculating divided difference table 
	    ndd.dividedDiffTable(x, y, n); 
	  
	    // displaying divided difference table 
	    ndd.printDiffTable(y,n); 
	  
	    // value to be interpolated 
	    System.out.print("Give the pointing value: ");
	    value = in.nextFloat(); 
	  
	    // printing the value 
	    DecimalFormat df = new DecimalFormat("#.##"); 
	    df.setRoundingMode(RoundingMode.HALF_UP); 
	      
	    System.out.println("\nValue at "+df.format(value)+" is " +df.format(ndd.applyFormula(value, x, y, n))); 
	}
}
