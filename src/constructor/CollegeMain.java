package constructor;

public class CollegeMain {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student("Aayush", "Gadhave");
		Student s3 = new Student();
		
		s1.address = "Pune";
		s1.mobile = "8459102167";
		s1.age = "13";
		
		System.out.println(s1.firstname);
		System.out.println(s1.lastname);
		System.out.println("--------------------------");
		System.out.println(s2.firstname);
		System.out.println(s2.lastname);
	}
}
