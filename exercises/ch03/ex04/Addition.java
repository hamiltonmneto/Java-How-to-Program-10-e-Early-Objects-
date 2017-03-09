import javax.swing.JOptionPane;

public class Addition{
	public static void main(String[] args){

		String n1 = JOptionPane.showInputDialog("Put the first number");
		String n2 = JOptionPane.showInputDialog("Put the second number");

		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		int result = num1 + num2;
		String num = Integer.toString(result);

		String message = String.format("The sum of the numbers is: %s", num);


		JOptionPane.showMessageDialog(null, message);
	}
}