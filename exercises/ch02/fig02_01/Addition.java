import java.util.Scanner;

public class Addition{
	
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("First number: ");
		int n1 = input.nextInt();
		System.out.println("Second number: ");
		int n2 = input.nextInt();

		System.out.println("The sum is: " + (n1+n2));
	}
}