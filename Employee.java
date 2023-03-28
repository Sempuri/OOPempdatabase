/**
 * 
 */


public class Employee {

	//attributes
	private String lastname;
	private String firstname;
	private String birthday;
	private String address;
	private String phonenumber;
	private String sss;
	
	//constructor
	public Employee(String lastname, String firstname, String birthday, String address, String phonenumber, String sss) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.birthday = birthday;
		this.address = address;
		this.phonenumber = phonenumber;
		this.sss = sss;
	}
	//getter method
	public String getLastname() {
		return lastname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhonenumber() {
		return phonenumber;
	}
	
	public String getSss() {
		return sss;
	}
	
	//method
	public void display() {
		System.out.println("");
    	System.out.println("==========================");
    	System.out.println("|| EMPLOYEE INFORMATION ||");
    	System.out.println("==========================");
    	System.out.println("");
    	System.out.println("*Last Name: " + lastname);
    	System.out.println("*First Name: " + firstname);
    	System.out.println("*Birthday: " + birthday);
    	System.out.println("*Address: " + address);
    	System.out.println("*Phone Number: " + phonenumber);
    	System.out.println("*SSS Number: " + sss);
    	System.out.println("");
    	System.out.println("");
	}
}
