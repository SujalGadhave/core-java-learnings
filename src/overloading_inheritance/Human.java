package overloading_inheritance;

public class Human extends Animal {	
	String height;
	String weight;
	
	public void Study() {
		System.out.println(name+"is Studying");
	}
	
	public void Sleep() {
		System.out.println(name+"is Sleeping ");
	}
}
