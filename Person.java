
/**
 * Write a description of class Person here.
 *
 * @author (Jennifer Guenst)
 * @version (1.0)
 */
import java.util.Scanner;
public class Person
{
   private String firstName;
   private String lastName;
   private String zipCode;
   public Person(){
       this.firstName = "X";
       this.lastName = "X";
       this.zipCode = "X";
   }
   public Person(String name1, String name2, String zip){
       this.firstName = name1;
       this.lastName = name2;
       this.zipCode = zip;
   }
   public void display(){
       System.out.println();
       System.out.println("First Name: " + firstName);
       System.out.println("Last Name: " + lastName);
       System.out.println("Zip: " + zipCode);
       System.out.println();
    }
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       Person patient1 = new Person();

       System.out.print("What is your first name: ");
       String first = sc.nextLine();
       System.out.print("What is your last name: ");
       String last = sc.nextLine();
       System.out.print("What is your zip code: ");
       String zip = sc.nextLine();

       Person patient2 = new Person(first, last, zip);

       patient1.display();
       patient2.display();


    }
}
