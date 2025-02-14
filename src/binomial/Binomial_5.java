package binomial;

public class Binomial_5 {
	public static void main(String[] args) {
		quadratic(2,4);
	}
	
	public static void quadratic(int e, int f)  {
		
		int g = (e*e*e*e*e);
			g = g + (5*e*e*e*e*f);
			g = g + (10*e*e*e*f*f);
			g = g + (10*e*e*f*f*f);
			g = g + (5*e*f*f*f*f);
			g = g + (f*f*f*f*f);
		System.out.println("Answer is "+g);
	}
}
