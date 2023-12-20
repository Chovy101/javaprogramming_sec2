import javax.swing.*;
public class lab601 {

	public static void main(String[] args) {

		String Email = JOptionPane.showInputDialog("Input your e-mail:");

		while(Email.startsWith("@")||Email.startsWith(" ")) {
			Email = JOptionPane.showInputDialog("Input your e-mail again:");
			
		}
		boolean ckEmail = checkEmail(Email);
		if (ckEmail==true) {
			JOptionPane.showMessageDialog(null, 
					"Your e-mail is " + Email.toLowerCase());
				}
		else {
			JOptionPane.showMessageDialog(null, 
					"Your e-mail id not hotmail or gmail dot com");	
		}
		
	}
	public static boolean checkEmail(String Email) {
		if (Email.endsWith("hotmail.com")||Email.endsWith("gmail.com")) {
			return true;
		}
		else return false;
	}
}



 
