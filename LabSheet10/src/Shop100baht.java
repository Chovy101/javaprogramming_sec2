import javax.swing.*;
public class Shop100baht {

	public static void main(String[] args) {
		product sold = new product();
		int confirm = JOptionPane.showConfirmDialog(null, "Pattanankarn?");
		if(confirm ==0) {
			sold = new extend();
		}
		int numofProduct = Integer.parseInt(JOptionPane.showInputDialog("Input the numbr of product: "));
		
		sold.setUnit(numofProduct);
		JOptionPane.showMessageDialog(null, sold.toString());
		}

}
