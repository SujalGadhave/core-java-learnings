package binomial;

public class Binomial_3 {
	public static void main(String[] args) {
		quadratic(4,6);
	}
	
	public static void quadratic(int x, int y) {
		int z = (x*x*x);
			z = z + (3*x*x*y);
			z = z + (3*x*y*y);
			z = z + (y*y*y);
		System.out.println("Answer is "+z);
	}
}
