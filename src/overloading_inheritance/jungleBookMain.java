package overloading_inheritance;

public class jungleBookMain {
	public static void main(String[] args) {
		
		Dog akela = new Dog();
		akela.name = "Akela";
		akela.drink();
		
		Tiger sher = new Tiger ();
		sher.name = "Sherkhan";
		sher.eat();
		sher.run();
		sher.run("Mr. ");
		sher.run(2);
		sher.run("Mr. ", 4);
	}
}
