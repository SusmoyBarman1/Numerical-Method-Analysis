package stirling_central_difference;

import java.io.*;
import java.util.Scanner;

import static java.lang.Math.*; 

public class A { 
	static void Stirling(double x[], double fx[], 
						double x1, int n) 
	{ 
		double h, a, u, y1 = 0, N1 = 1, d = 1, 
			N2 = 1, d2 = 1, temp1 = 1, 
		temp2 = 1, k = 1, l = 1, delta[][]; 
		
		delta = new double[n][n]; 
		int i, j, s; 
		h = x[1] - x[0]; 
		s = (int)floor(n / 2); 
		a = x[s]; 
		u = (x1 - a) / h; 

		// Preparing the forward difference 
	// table 
		for (i = 0; i < n - 1; ++i) { 
			delta[i][0] = fx[i + 1] - fx[i]; 
		} 
		for (i = 1; i < n - 1; ++i) { 
			for (j = 0; j < n - i - 1; ++j) { 
				delta[j][i] = delta[j + 1][i - 1] 
							- delta[j][i - 1]; 
			} 
		} 

		// Calculating f(x) using the Stirling 
		// formula 
		y1 = fx[s]; 

		for (i = 1; i < n; ++i) { 
			if (i % 2 != 0) { 
				if (k != 2) { 
					temp1 *= (pow(u, k) - 
							pow((k - 1), 2)); 
				} 
				else { 
					temp1 *= (pow(u, 2) - 
							pow((k - 1), 2)); 
				} 
				++k; 
				d *= i; 
				s = (int)floor((n - i) / 2); 
				y1 += (temp1 / (2 * d)) * 
					(delta[s][i - 1] + 
					delta[s - 1][i - 1]); 
			} 
			else { 
				temp2 *= (pow(u, 2) - 
						pow((l - 1), 2)); 
				++l; 
				d *= i; 
				s = (int)floor((n - i) / 2); 
				y1 += (temp2 / (d)) * 
					(delta[s][i - 1]); 
			} 
		} 

		System.out.print(+ y1); 
	} 

	// Driver main function 
public static void main(String args[]) 
	{ 
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

		Stirling(x, fx, x1, n); 
	} 
} 
