import javax.swing.*;
import java.text.DecimalFormat;
import java.util.*;
public class Practic1part2 {

	public static void main(String[] args) {
		DecimalFormat text = new DecimalFormat("###,###");

		Random Rmoney = new Random();
		int balance = Rmoney.nextInt(9)*100000;
		
		int withdraw = Integer.parseInt(
				JOptionPane.showInputDialog("Your balance: " +text.format(balance)
						+"\nInput money to withdraw:"));
		int tonpan = withdraw/1000;
		int tonharoy = (withdraw-(tonpan*1000))/500;
		int tonroy = (withdraw-((tonpan*1000)+(tonharoy*500)))/100;
		int tonsib = ((withdraw-((tonpan*1000)+(tonharoy*500)+(tonroy*100))));
		if(withdraw > balance) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than balance","Error",JOptionPane.ERROR_MESSAGE);
		}
		else if(withdraw >=20000) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than 20,000","Error",JOptionPane.ERROR_MESSAGE);
		}
		else if  ((withdraw%100) !=0 ) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw "+tonsib +" baht.","Error",JOptionPane.ERROR_MESSAGE);
		}

		else {
		JOptionPane.showMessageDialog(null, "Your withdraw " +text.format(withdraw)+" baht."
				+"\n1000 = "+tonpan+"\n500 = "+tonharoy+"\n100 = "+tonsib);
		}
		
	}

}