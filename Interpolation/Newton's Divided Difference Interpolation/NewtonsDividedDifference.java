package newtons_divided_difference;

import java.text.*; 
import java.math.*; 

public class NewtonsDividedDifference {
	
	float proterm(int i, float value, float x[]) 
	{ 
	    float pro = 1; 
	    for (int j = 0; j < i; j++) { 
	        pro = pro * (value - x[j]); 
	    } 
	    return pro; 
	} 
	  
	// Function for calculating 
	// divided difference table 
	void dividedDiffTable(float x[], float y[][], int n) 
	{ 
	    for (int i = 1; i < n; i++) { 
	        for (int j = 0; j < n - i; j++) { 
	            y[j][i] = (y[j][i - 1] - y[j + 1] 
	                        [i - 1]) / (x[j] - x[i + j]); 
	        } 
	    } 
	} 
	  
	// Function for applying Newton's 
	// divided difference formula 
	float applyFormula(float value, float x[], float y[][], int n) 
	{ 
	    float sum = y[0][0]; 
	  
	    for (int i = 1; i < n; i++) { 
	    sum = sum + (proterm(i, value, x) * y[0][i]); 
	    } 
	    return sum; 
	} 
	  
	// Function for displaying  
	// divided difference table 
	void printDiffTable(float y[][],int n) 
	{ 
		System.out.println();
	    DecimalFormat df = new DecimalFormat("#.####"); 
	    df.setRoundingMode(RoundingMode.HALF_UP); 
	      
	    for (int i = 0; i < n; i++) { 
	        for (int j = 0; j < n - i; j++) { 
	            String str1 = df.format(y[i][j]); 
	            System.out.print(str1+"\t "); 
	        } 
	        System.out.println(""); 
	    } 
	} 
}
