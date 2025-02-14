package arraylist;

import java.util.TreeSet;

public class ArrayListExample {
	public static void main(String[] args) {
		// Collection Framework
			// ArrayList
			// LinkedList
		// Set => Unique value
			// HashSet > Unique + Random order maintain
			// LinkedHashSet > Unique + Insertion order maintain
			// TreeSet > Unique + Sorted order
		TreeSet<String> algorithm = new TreeSet<>();
		
		algorithm.add("Sujal");
		algorithm.add("Sujal");
		algorithm.add("Sujal");
		algorithm.add("Sujal");
		algorithm.add("Shree");
		algorithm.add("Ravi");
		algorithm.add("Pankaj");
		algorithm.add("Chetan");
		
		for(String name:algorithm) 
		{
			System.out.println(name);
		}
	}
}
