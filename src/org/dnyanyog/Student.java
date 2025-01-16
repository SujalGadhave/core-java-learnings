package org.dnyanyog;

public class Student {
	private String fisrtName;
	private String lastName;
	private String email;
	private String mobile;
	
	private String year;
	private String branch;
	
	private Address address = new Address();

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [fisrtName=" + fisrtName + ", lastName=" + lastName + ", email=" + email + ", mobile=" + mobile
				+ ", year=" + year + ", branch=" + branch + ", address=" + address + "]";
	}
	
	
}
