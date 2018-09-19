import java.util.Scanner;

public class Bisection_test extends Bisecsion{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Bisecsion ob = new Bisecsion();
		
		double a;
		double b;
		
		a = input.nextDouble();
		b = input.nextDouble();
		
		Bisecsion.bisection(a, b);
		
		input.close();
	}
}
