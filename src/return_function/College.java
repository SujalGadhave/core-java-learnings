package return_function;

public class College {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.firstname = "Sujal";
		s1.lastname = "Gadhave";
		s1.address = "Pune";
		s1.mobile = "8459102167";
				
		
		String Dagad = s1.printFullName();
			System.out.println(Dagad);
			
		String Mati = s1.printAdress();
			System.out.println(Mati);
		
		
		String printMobileNumber= s1.getMobileNumberWithCode("+91");
			System.out.println("Calling on... "+ printMobileNumber);
			
	}
}
