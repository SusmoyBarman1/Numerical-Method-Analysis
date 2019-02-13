package regular_falsi_method_root_finding;

public class Falsi_Calculator {
	public static void main(String[] args) 
    { 
		RegularFalsi rf = new RegularFalsi();
		Calculating_Function cf = new Calculating_Function();
		
		int check = 0;
		double temp = -200;
		double a=0,b=0;
	
		// Initial values assuming
		while(check<2)
		{
			if(cf.func(temp)<0 && check==0)
			{
				a = temp;
				check++;
			}
			else if(cf.func(temp)>0 && check==1)
			{
				b = temp;
				check++;
			}
			temp++;
		}
		 
        rf.regulaFalsi(a, b); 
    }
}
