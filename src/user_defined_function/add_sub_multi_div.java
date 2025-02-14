package user_defined_function;

public class add_sub_multi_div {
	
	public static void main(String[] args) {
		add(45,56);
		sub(89,32);
		multi(52,69);
		div(74,12);
	}
	
	public static void add(int a,int b) {
		System.out.println("a "+a);
		System.out.println("b "+b);
		
		int c = a+b;
		System.out.println("Addition is "+c);
	}
	
	public static void sub(int f, int g) {
		System.out.println("f "+f);
		System.out.println("g "+g);
		
		int n = f-g;
	System.out.println("Subtraction is  "+n);
	}
	
	public static void multi(int q, int w) {
		System.out.println("q "+q);
		System.out.println("w "+w);
		
		int r = q*w;
	System.out.println("Multiplication is "+r);
	
	}
	public static void div(int l, int m) {
		System.out.println("l "+l);
		System.out.println("m "+m);
		
		int f = l/m;
		System.out.println("Division is "+f);
	}
}


