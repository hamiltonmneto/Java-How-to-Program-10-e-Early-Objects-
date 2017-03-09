import javax.swing.JOptionPane;

public class Dialog1{
	public static void main(String[] args){

		String name = JOptionPane.showInputDialog("What is youe name?");

		String message = String.format("Welcome %s, to java programming", name);

		JOptionPane.showMessageDialog(null, message);
	}
}