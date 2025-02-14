package binomial;

public class Binomial_4 {
	public static void main(String[] args) {
		quadratic(3,5);
	}
	
	public static void quadratic(int l, int m) {
		int n = (l*l*l*l);
			n = n + (4*l*l*l*m);
			n = n + (6*l*l*m*m);
			n = n + (4*l*m*m*m);
			n = n + (m*m*m*m);
		System.out.println("Answer is "+n);
	}
}
