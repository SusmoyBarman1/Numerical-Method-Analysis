package bisection_Method_Root_Finding;

public class Bisection {

	final float EPSILON = (float)0.01; 
	
	Equation_Calculator ec = new Equation_Calculator(); 
     
  
    // Prints root of func(x) with error of EPSILON 
    void bisection(double a, double b) 
    { 
        if (ec.func(a) * ec.func(b) >= 0) 
        { 
            System.out.println("You have not assumed"+ " right a and b"); 
            return; 
        } 
  
        double c = a; 
        while ((b-a) >= EPSILON) 
        { 
            // Find middle point 
            c = (a+b)/2; 
  
            // Check if middle point is root 
            if (ec.func(c) == 0.0) 
                break; 
  
            // Decide the side to repeat the steps 
            else if (ec.func(c) * ec.func(a) < 0) 
                b = c; 
            else
                a = c; 
        } 
        //prints value of c upto 4 decimal places 
        System.out.printf("The value of root is : %.4f" ,c); 
    }
} 