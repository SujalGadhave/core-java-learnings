package data_types;

public class MethodOverLoading {
	
	// Function Overloading
	
	public static void main(String[] args) {
		quadratic(2); // parameter
		quadratic(2,6); // parameter
		quadratic("Sujal"); // parameter
		quadratic("Sujal ", "Gadhave"); // parameter
		quadratic("Sujal", 12); // parameter
		quadratic(12, "Sujal"); // parameter
		quadratic();		
	}
	
	public static void quadratic(int a) { // Argument	// User defined Function
		System.out.println("Output is timepass"); // println <--- Function Call
	}
	
	public static void quadratic(int a, int b) { // Argument	// User defined Function
		int c = a / a;
			c = c + (2 / a / b);
			c = c + (b / b);
		System.out.println("Output is "+c);// println <--- Function Call
	}
	
	public static void quadratic(String a) { // Argument	// User defined Function
		System.out.println("Output is timepass"); // println <--- Function Call
	}
	
	public static void quadratic(String a, String b) { // Argument	// User defined Function
		String c = a + b;
		System.out.println("Output is "+c); // println <--- Function Call
	}
	
	public static void quadratic(String a, int b) { // Argument	// User defined Function
		System.out.println("Output is Timepass"); // println <--- Function Call
	}
	
	public static void quadratic(int a, String b) { // Argument	// User defined Function
		System.out.println("Output is Timepass "); // println <--- Function Call
	}
	
	public static void quadratic() { // Argument	// User defined Function
		System.out.println("Output is Timepass"); // println <--- Function Call
	}
}
