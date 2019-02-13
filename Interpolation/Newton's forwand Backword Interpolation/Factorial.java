package newton_forward_backward_interpolation;

public class Factorial {
	int fact(int n) 
	{ 
	    int f = 1; 
	    for (int i = 2; i <= n; i++) 
	        f *= i; 
	    return f; 
	}
}
