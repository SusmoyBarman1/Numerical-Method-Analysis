package bisection_Method_Root_Finding;

public class Bisection_Calculator {

	public static void main(String[] args)
	{
		Bisection bm = new Bisection();
		Equation_Calculator ec = new Equation_Calculator(); 
		
		int check = 0;
		double temp = -20000;
		double a=0,b=0;
	
		while(check<2)
		{
			if(ec.func(temp)<0 && check==0)
			{
				a = temp;
				check++;
			}
			else if(ec.func(temp)>0 && check==1)
			{
				b = temp;
				check++;
			}
			temp++;
		}
		//System.out.println(a+"  "+b);
	    bm.bisection(a,b);
	}
}
