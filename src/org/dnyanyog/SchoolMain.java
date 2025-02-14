package org.dnyanyog;

public class SchoolMain {
	public static void main(String[] args) {
		
		Student std = new Student();
//		Student information
		std.setFisrtName("Sujal");
		std.setLastName("Gadhave");
		std.setEmail("sujalgadhave009@gmail.com");
		std.setMobile("8459102167");
		
		std.setYear("SE");
		std.setBranch("AI&DS");
		
//		Address information
		
		std.getAddress().setStreet1("Pune-Banglore Highway");
		std.getAddress().setStreet2("Dhangwadi");
		std.getAddress().setCity("Pune");
		std.getAddress().setState("Maharashtra");
		std.getAddress().setCountry("India");
		std.getAddress().setPincode("412205");
		System.out.println(std);
	}
}