package lagrange_interpolation;

public class LagrangeInterpolation {

	double interpolate(double x[],double y[], double xi, int n) 
	{ 
	    double result = 0; // Initialize result 
	  
	    for (int i=0; i<n; i++) 
	    { 
	        // Compute individual terms of above formula 
	        double term = y[i]; 
	        for (int j=0;j<n;j++) 
	        { 
	            if (j!=i) 
	                term = term*(xi - x[j])/(x[i] - x[j]); 
	        } 
	  
	        // Add current term to result 
	        result += term; 
	    } 
	  
	    return result; 
	} 
}
