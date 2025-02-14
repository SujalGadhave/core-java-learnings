package overloading_inheritance;

public class Tiger extends Animal {
	
	String species;

	public void roar() {
		System.out.println(name+" is roaring");
	}
	public void hunt() {
		System.out.println(name+" is hunting");
	}
	// Overload
	public void run() {
		System.out.println(name+" is running");
	}
	public void run(String alias) {
		System.out.println(alias+ name+" is running");
	}
	
	public void run(int duration) {
		System.out.println(name+" is running since "+duration+" hours");
		
	}
	public void run(String alias,int duration) {
		System.out.println(alias+ name+" is running since "+duration+" hours");
	}
}
