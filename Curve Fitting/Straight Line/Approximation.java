package straight_Line;

import java.io.*; 
import static java.lang.Math.pow; 

public class Approximation {

	void bestApproximate(double x[], double y[]) 
    { 
        int n = x.length; 
        double m, c, sum_x = 0, sum_y = 0;
        double sum_xy = 0, sum_x2 = 0; 
        
        for (int i = 0; i < n; i++) { 
            sum_x += x[i]; 
            sum_y += y[i]; 
            sum_xy += x[i] * y[i]; 
            sum_x2 += pow(x[i], 2); 
        } 
  
        m = (n * sum_xy - sum_x * sum_y) / (n * sum_x2 - pow(sum_x, 2)); 
        c = (sum_y - m * sum_x) / n; 
  
        System.out.println("m = " + m); 
        System.out.println("c = " + c); 
    } 
}
