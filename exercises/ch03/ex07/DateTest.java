import java.util.Scanner;

public class DateTest {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Please, set the day: %n");
		int day = input.nextInt();
		System.out.printf("Please, set the month: %n");
		int month = input.nextInt();
		System.out.printf("Please, set the year: %n");
		int year = input.nextInt();
		
		Date currentDate = new Date(day,month,year);
		
		currentDate.displayDate();
	}
}
