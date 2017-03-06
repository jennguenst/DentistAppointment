/* ****************
 * Name: Ben Davis
 * Class: CS 1233
 * ************** */


import java.util.Scanner;
public class DateB{
    private int month;
    private int day;
    private int year;

    public DateB(){ // set to defaults
        this.month = 1;
        this.day = 1;
        this.year = 2000;
    }
    public DateB(int mm, int dd, int yyyy){
        this.month = mm;
        this.day = dd;
        this.year = yyyy;
    }
    public void displayDate(){
        System.out.printf("\nYour appointment is on: %d/%d/%d", month, day, year);
    }

    public static void main(String[] args){
        int month; 
        int day;
        int year;
        Scanner scnr = new Scanner(System.in);
        DateB testDate = new DateB();

        System.out.println("Enter date in mm dd yyyy form: ");
        month = scnr.nextInt();
        day = scnr.nextInt();
        year = scnr.nextInt();

        DateB realApptDate = new DateB(month, day, year);

        testDate.displayDate();
        realApptDate.displayDate();
        System.out.println();
    }
}