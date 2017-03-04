import java.util.Scanner;
public class Time
{
    private int hours;
    private int minutes;
    public Time()
    {

    }
    public Time(int hourValue){
        if(hourValue > 23 || hourValue < 0)
        {
            this.hours = 23;
        }
        else{
            this.hours = hourValue;
        }

        this.minutes = 0;
    }
    public Time(int hourValue, int minuteValue){
        if(hourValue > 23 || hourValue < 0)
        {
            this.hours = 23;
        }
        else{
            this.hours = hourValue;
        }

        if(minuteValue > 59 || minuteValue < 0)
        {
            this.minutes = 59;
        }
        else{
            this.minutes = minuteValue;
        }
    }
    public void display(){
        if(minutes < 10 && hours < 10){
            System.out.printf("Time: 0%d:0%d" , hours, minutes);
        }
        else if(minutes < 10 && hours > 9){
            System.out.printf("Time: %d:0%d" , hours, minutes);
        }
        else if(hours < 10 && minutes > 9){
            System.out.printf("Time: 0%d:%d" , hours, minutes);
        }
        else{
            System.out.printf("Time: %d:%d" , hours, minutes);
        }
    }
    public void addMinutes(int minuteAdd){
        if((minuteAdd + minutes) > 59){
            if(((hours) + (minuteAdd + minutes) / 60) >= 24)
            {
                this.hours = ((hours) + (minuteAdd + minutes) / 60) - 24;
                this.minutes = (minuteAdd + minutes) % 60;
            }
            else
            {
                this.hours = ((hours) + (minuteAdd + minutes) / 60);
                this.minutes = (minuteAdd + minutes) % 60;
            }
        }
        else
        {
            this.minutes = minuteAdd + minutes;
        }
    }
    public static void main(String[] args){
        Time[] apptTime = new Time[5];
        Scanner sc = new Scanner(System.in);
        for(int h = 0; h < apptTime.length; h++)
        {
            System.out.print("Enter the hour in military time (0 - 23): ");
            int hourTime = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the minute(0 - 59): ");
            int minuteTime = sc.nextInt();
            sc.nextLine();
            apptTime[h] = new Time(hourTime, minuteTime);
            sc.nextLine();
        }
        for(int i = 0; i < apptTime.length; i++)
        {
            apptTime[i].display();
            sc.nextLine();
            System.out.print("Enter minutes you would like to add to the appointment time: ");
            int min = sc.nextInt();
            sc.nextLine();
            apptTime[i].addMinutes(min);
            apptTime[i].display();
            sc.nextLine();
        }
    }
}
