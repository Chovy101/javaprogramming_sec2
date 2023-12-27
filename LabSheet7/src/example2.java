import javax.swing.*;
public class example2 {

	public static void main(String[] args) {
		int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
		double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
		int order = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to order"));
		double itemprice = 0.0;
		boolean Validitem = false;
		for(int i = 0 ; i < validValues.length ; i++ ) {
			if(order==validValues[i]) {
				itemprice = price[i];
				Validitem = true;
			}			
		}
		if(Validitem==true) {
			System.out.println("Item "+order+" is "+itemprice);
		}
		else {
			System.out.println("Invalid Item");

		}
	}
}
