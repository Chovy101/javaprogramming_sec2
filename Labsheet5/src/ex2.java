import javax.swing.*;
public class ex2 {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Input your Email ");
		while(email.startsWith("@")||email.startsWith(" ")) {
			email = JOptionPane.showInputDialog("Input your Email, again ");
		}
		email = email.toLowerCase();
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			JOptionPane.showMessageDialog(null,"Your e-mail is " + email);
		}
		else {
			JOptionPane.showInputDialog("Your email is not hotmail or gmail ");

		}
	}

}
