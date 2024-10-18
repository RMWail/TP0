package dz.Biskra.Info.exo1;


import java.time.LocalDate;

public class Student {

	
	private String name ; 
	private String firstName;
	private LocalDate dateOfBirth;
	private String emailAddress;
	private String postalAddress;
	
	
	public Student(String n,String fn,LocalDate dob,String email,String pA) {
		this.name=n;
		this.firstName=fn;
		this.dateOfBirth=dob;
		this.emailAddress=email;
		this.postalAddress=pA;
	}
	
	


	
	public String toString() {
		return "Student : name=" + name + " firstName=" + firstName + " dateOfBirth=" + dateOfBirth + " emailAddress=" + emailAddress + " postalAddress=" + postalAddress + "\n";
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getPostalAddress() {
		return postalAddress;
	}


	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}


	
	
	
}
