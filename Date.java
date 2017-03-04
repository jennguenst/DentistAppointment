
/**
 * Used for Dentist appointment
 *
 * @author (Jennifer Guenst)
 * @version (1.0)
 */
import java.util.Scanner;
public class Date
{
    private int month;
    private int day;
    private int year;
    public Date()
    {
        this.month = 1;
        this.day = 1;
        this.year = 2000;
    }
    public Date(int monthInput, int dayInput, int yearInput)
    {
        this.month = monthInput;
        this.day = dayInput;
        this.year = yearInput;
    }
    public void display()
    {
        System.out.println("Your appointment is on: " + month + "/" + day + "/" + year);
    }
    public static void main(String[] args)
    {
        int month;
        int day;
        int year;
        Scanner sc = new Scanner(System.in);
        Date apptDate = new Date();

        System.out.println("Enter month number: ");
        month = sc.nextInt();

        System.out.println("Enter day number: ");
        day = sc.nextInt();

        System.out.println("Enter year number: ");
        year = sc.nextInt();

        Date apptDate2 = new Date(month, day, year);

        apptDate.display();
        apptDate2.display();
    }
}
