package secand_method_root_finding;

public class Secand_Calculator {

	// Driver code 
    public static void main(String[] args) { 
          
    	Secand_Method sm = new Secand_Method();
    	Calculating_Function cf =  new Calculating_Function();
    	
        // initializing the values 
        double x1 = 0, x2 = 1;
        double E = 0.0001f;
        int check = 0;
		double temp = -200;
        
        while(check<2)
		{
			if(cf.f(temp)<0 && check==0)
			{
				x1 = temp;
				check++;
			}
			else if(cf.f(temp)>0 && check==1)
			{
				x2 = temp;
				check++;
			}
			temp++;
		}
        sm.secant(x1, x2, E); 
    }
}
