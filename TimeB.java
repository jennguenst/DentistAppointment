
import java.util.Scanner;
public class TimeB{
	private int hours;
	private int minutes;
	//public Time(){
//
	//}

	public TimeB(int hour){
		if ((hour < 0) || (hour > 23)){
			this.hours = 23;
		}
		else{
			this.hours = hour;
		}
		this.minutes = 0;
	}
	public TimeB(int hour2, int minute){
		if ((hour2 < 0) || (hour2 > 23)){
			this.hours = 23;
		}
		else{
			this.hours = hour2;
		}
		if ((minute < 0) || (minute > 59)){
			this.minutes = 59;
		}
		else {
			this.minutes = minute;
		}
	}
/*
	private void getHours(int h){

		System.out.println("Enter number of hours less than 24: ");
		h = scnr.nextInt();
		this.hours = h;
	}
*/
	public void addMinutes(int m){
		//System.out.println("Enter number of minutes less than 59: ");
		if((m + minutes) > 59){
			if (((hours) + (m + minutes)/60) >= 24){
				this.hours = ((hours) + (m + minutes)/60) - 24;
				this.minutes = (m + minutes) % 60;
			}
			else{
				this.hours = ((hours) + (m + minutes)/60);
				this.minutes = (m + minutes) % 60;
			}
		}
		else {
			this.minutes = (m + minutes);
		}
	}
	public void displayTime(){
		if((minutes < 10) && (hours < 10)){
			System.out.printf("Time = 0%d:0%d", hours, minutes);
		}
		else if((minutes < 10) && (hours >= 10)){
			System.out.printf("Time = %d:0%d", hours, minutes);
		}
		else if((minutes >= 10) && (hours < 10)){
			System.out.printf("Time = 0%d:%d", hours, minutes);
		}
		else{
			System.out.printf("Time = %d:%d", hours, minutes);
		}
	}
	public static void main(String [] args){
		Scanner scnr = new Scanner(System.in);

		TimeB [] times = new TimeB[5];

		for(int i = 0; i < times.length; i++){

			System.out.print("Enter number of hours in military time: ");
			int newHour = scnr.nextInt();
			scnr.nextLine(); // helps with organization

			System.out.print("Enter number of minutes (0-59): ");
			int newMin = scnr.nextInt();
			scnr.nextLine();

			times[i] = new TimeB(newHour, newMin);
			scnr.nextLine();
		}
		for(int b = 0; b < times.length; b++){

			times[b].displayTime();
			System.out.print("\n\nEnter some more minutes: ");
			int extMin = scnr.nextInt();
			scnr.nextLine();

			times[b].addMinutes(extMin);
			times[b].displayTime();
			scnr.nextLine();
		}

	}
}