

public class TestAccount02{
	public static void main(String[] args){


		Account02 myAccount03 = new Account02("Max Steel", 40.03);
		Account02 myAccount02 = new Account02("ELiza Swan", 89.48);
		System.out.printf("Account informations: %s has $%.2f %n%n", myAccount02.getName(), myAccount02.getBalance());
		System.out.println("----------------------");
		myAccount02.deposit(50.0);
		System.out.printf("New balance: %.2f%n", myAccount02.getBalance());
		
		myAccount02.withdraw(26);
		System.out.printf("New balance: $%.2f", myAccount02.getBalance());


	}
}