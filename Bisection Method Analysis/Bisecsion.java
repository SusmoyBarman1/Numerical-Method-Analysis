class Bisecsion{ 
    static final double ESP = (double)0.001; 
  
    // Bisection Method. The function is x^3 - x - 1 
    static double equation(double x) 
    { 
        return x*x*x - x - 1; 
    } 
  
    
    static void bisection(double a, double b) 
    { 
        if (equation(a) * (b) >= 0) 
        { 
            System.out.println("You must take better a and b."); 
            return; 
        } 
  
        double c = a; 
        while ((b-a) >= ESP) 
        {  
            c = (a+b)/2; 
  
            // Check if middle point is root 
            if (equation(c) == 0.0) 
                break; 
  
            // Decide the side to repeat the steps 
            else if (equation(c) * equation(a) < 0) 
                b = c; 
            else
                a = c; 
        } 
        //prints value of c upto 4 decimal places 
        System.out.printf("The value of root is : %.4f",c); 
    }
}