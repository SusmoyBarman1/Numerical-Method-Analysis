package secand_method_root_finding;

public class Secand_Method {
      
    void secant(double x1, double x2, double E) { 
          
    	Calculating_Function cf = new Calculating_Function();
        double n = 0, xm, x0, c; 
        if (cf.f(x1) * cf.f(x2) < 0)  
        { 
            do { 
                  
                // calculate the intermediate 
                // value 
                x0 = (x1 * cf.f(x2) - x2 * cf.f(x1)) 
                            / (cf.f(x2) - cf.f(x1)); 
          
                // check if x0 is root of 
                // equation or not 
                c = cf.f(x1) * cf.f(x0); 
          
                // update the value of interval 
                x1 = x2; 
                x2 = x0; 
          
                // update number of iteration 
                n++; 
          
                // if x0 is the root of equation  
                // then break the loop 
                if (c == 0) 
                    break; 
                xm = (x1 * cf.f(x2) - x2 * cf.f(x1))  
                     / (cf.f(x2) - cf.f(x1)); 
                              
                // repeat the loop until the  
                // convergence  
            } while (Math.abs(xm - x0) >= E);  
                                                  
            System.out.println("Root of the" + 
                    " given equation=" + x0); 
                      
            System.out.println("No. of "
                      + "iterations = " + n); 
        }  
          
        else
            System.out.print("Can not find a"
              + " root in the given inteval"); 
    }  
}
