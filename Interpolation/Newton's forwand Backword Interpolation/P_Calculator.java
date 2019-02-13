package newton_forward_backward_interpolation;

public class P_Calculator {
	double p_cal(double u, int n) 
	{ 
	    double temp = u; 
	    for (int i = 1; i < n; i++) 
	        temp = temp * (u - i); 
	    return temp; 
	}
}
