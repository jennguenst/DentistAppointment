/* ****************
 * Name: Ben Davis
 * Class: CS 1233
 * ************** */

import java.util.Scanner;
public class PersonB{
	Scanner scnr = new Scanner(System.in);

	private String lastName;
	private String lName;
	private String firstName;
	private String fName;
	private String zipCode;
	private String zCode;

	public PersonB(){
		this.lastName = " X";
		this.firstName = "X";
		this.zipCode = "X";
	}
	public void getPersonInfo(){
		System.out.print("\nEnter first and last name: ");
		fName = scnr.next();
		lName = scnr.nextLine();

		System.out.print("Enter zipcode: ");
		zCode = scnr.nextLine();

		this.lastName = lName;
		this.firstName = fName;
		this.zipCode = zCode; 
	}
	public void display(){
		System.out.printf("\nPatient:%s, %s", lastName, firstName); 
		System.out.printf("\nZipcode: %s\n", zipCode);
	}
	public static void main(String [] args){
		
		PersonB testPerson = new PersonB();	
		PersonB realPerson = new PersonB();
		realPerson.getPersonInfo();

		testPerson.display();
		realPerson.display();

	}
}