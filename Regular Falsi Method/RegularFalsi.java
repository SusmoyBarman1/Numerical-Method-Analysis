package regular_falsi_method_root_finding;

public class RegularFalsi {

	Calculating_Function cf = new Calculating_Function();
	static int MAX_ITER = 1000000; 
  
    // Prints root of func(x)  
    // in interval [a, b] 
    void regulaFalsi(double a, double b) 
    { 
        if (cf.func(a) * cf.func(b) >= 0)  
        { 
            System.out.println("You have not assumed right a and b"); 
        } 
        // Initialize result 
        double c = a;  
  
        for (int i = 0; i < MAX_ITER; i++)  
        { 
            // Find the point that touches x axis 
            c = (a * cf.func(b) - b * cf.func(a))  
                 / (cf.func(b) - cf.func(a)); 
  
            // Check if the above found point is root 
            if (cf.func(c) == 0) 
                break; 
  
            // Decide the side to repeat the steps 
            else if (cf.func(c) * cf.func(a) < 0) 
                b = c; 
            else
                a = c; 
        } 
        System.out.println("The value of root is : " + c); 
    }  
} 