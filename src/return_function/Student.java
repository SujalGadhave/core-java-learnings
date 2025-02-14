package return_function;

public class Student {
	public String firstname;
	public String lastname;
	public String address;
	public String mobile;
	
	public String printFullName () {
		return firstname+" "+lastname;
	}
	
	public String printAdress() {
		return address;
	}
	
	public String getMobileNumberWithCode(String CountryCode) {
		return CountryCode+mobile;
	}
}
