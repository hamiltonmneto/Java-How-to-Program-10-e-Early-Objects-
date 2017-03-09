import java.util.Scanner;

public class Compare{
	
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("First number: ");
		int n1 = input.nextInt();
		System.out.println("Second number: ");
		int n2 = input.nextInt();

		if (n1 == n2) {
			System.out.printf("%d == %d%n", n1, n2);
		}

		if (n1 != n2) {
			System.out.printf("%d != %d%n", n1, n2);
		}

		if (n1 > n2) {
			System.out.printf("%d > %d", n1, n2);
		}

		if (n1 < n2) {
			System.out.printf("%d < %d", n1, n2);
		}


	}
}