package binomial;

public class Binomial_2 {
	public static void main(String[] args) {
		quadratic (3,5);
	}
	
	public static void quadratic(int p, int q) {
		int r = (p*p);
			r = r + (2*p*q);
			r = r + (q*q);
		System.out.println("Answer is "+r);
			
	}
}
