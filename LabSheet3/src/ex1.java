import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ex1 
{

	public static void main(String[] args) 
	{
		final int BUFFET = 299;
		DecimalFormat text = new DecimalFormat("#,###.00");
		
		int bill = Integer.parseInt(
				JOptionPane.showInputDialog("How many customer per bill?"));
		double discount = 0 ;
		double totalprice = 0;
		
		totalprice = BUFFET * bill;
		
		int membercard;
		membercard = JOptionPane.showConfirmDialog(null, "Total Price is " +text.format(totalprice)+" baht."
				+"\nDo you have a member card?");
		if(membercard == JOptionPane.YES_OPTION)
		{
			discount = totalprice-(totalprice*10/100);
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + text.format(discount)+" baht.");
		}
		
		if(membercard == JOptionPane.NO_OPTION) 
		{
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + text.format(discount)+" baht.");
		}
		else 
		{
			
		}
	}

}
