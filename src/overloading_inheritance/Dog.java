package overloading_inheritance;

public class Dog extends Animal {
	String breed;
	String nails;
	
	@Override
	public void drink() {
		System.out.println(name+ " is lapping");
	}
	public void bark() {
		System.out.println(name+ " is barking");
	}
}
