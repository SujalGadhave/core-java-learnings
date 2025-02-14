package constructor;

public class Student {
	public String firstname;
	public String lastname;
	public String address;
	public String branchname;
	public String age;
	public String mobile;
	
	
	// default constructor
	
	
	// No argument constructor
	public Student() {
		firstname ="Sujal";
		lastname = "Gadhave";
	}
	
	public Student (String fname, String lname) {
		firstname = fname;
		lastname = lname;
	}
	
	public void printFullName() { // Function
		System.out.println(firstname +" "+ lastname);
	}
	public void printMobileNumber() {
		System.out.println(mobile);
	}
	
	public String getMobileNumberWithCode(String countryCode) {
		return countryCode+mobile;
	}
}
