import java.util.Scanner;
public class DentalAppointment{
    Person patientOne = new Person();
    Date dateOfAppt   = new Date();
    Time timeOfAppt   = new Time();
    private int durationMin;
    public DentalAppointment(){}
    public DentalAppointment(String firstName, String lastName, String zip, int month, int day, int year, int hour, int minute)
    {
        this.patientOne  = new Person(firstName, lastName, zip);
        this.dateOfAppt  = new Date(month, day, year);
        this.timeOfAppt  = new Time(hour, minute);
        this.durationMin = 30;

    }
    public DentalAppointment(String firstName, String lastName, String zip, int month, int day, int year, int hour, int minute, int duration)
    {
        Scanner sc = new Scanner(System.in);
        this.patientOne  = new Person(firstName, lastName, zip);
        this.dateOfAppt  = new Date(month, day, year);
        this.timeOfAppt  = new Time(hour, minute);
        while(duration > 240 || duration < 0){
          System.out.print("Let's try again. How long is your appointment: ");
          duration = sc.nextInt();
          sc.nextLine();
        }
        this.durationMin = duration;
        // I hope not having an alternate time variable wont hurt us. We just changed the time instead of creating a new one.

    }
    public void displayDentalAppt()
    {
        patientOne.display();
        System.out.println();
        dateOfAppt.display();
        System.out.println();
        timeOfAppt.display();
        timeOfAppt.addMinutes(durationMin);
        System.out.println();
        System.out.print("Final ");
        timeOfAppt.display();
        System.out.println();

    }
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        DentalAppointment[] appointment = new DentalAppointment[3];
        for(int i = 0; i < appointment.length; i++){
            System.out.print("So what is your first name: ");
            String firstName = scnr.nextLine();
            System.out.print("What is your last name: ");
            String lastName = scnr.nextLine();
            System.out.print("What is your zip code: ");
            String zipCode = scnr.nextLine();
            System.out.print("Enter month: ");
            int month = scnr.nextInt();
            scnr.nextLine();
            System.out.print("Enter day: ");
            int day = scnr.nextInt();
            scnr.nextLine();
            System.out.print("Enter year: ");
            int year = scnr.nextInt();
            scnr.nextLine();
            System.out.print("Enter the current hour: ");
            int hour = scnr.nextInt();
            scnr.nextLine();
            System.out.print("Enter minute: ");
            int minute = scnr.nextInt();
            scnr.nextLine();
            System.out.print("How long is the appointment: ");
            int durationtime = scnr.nextInt();
            scnr.nextLine();
            appointment[i] = new DentalAppointment(firstName, lastName, zipCode, month, day, year, hour, minute, durationtime);
            appointment[i].displayDentalAppt();
        }



    }

}
