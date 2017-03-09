import java.util.Scanner;

public class TestAccount{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		Account myAccount = new Account();

		System.out.println("Please enter your name: ");
		String theName = input.nextLine();
		myAccount.setName(theName);
		System.out.println("Account informations: ");
		System.out.print(myAccount.getName());
	}
}