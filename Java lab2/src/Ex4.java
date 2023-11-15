import javax.swing.JOptionPane;
import java.text.*;
public class Ex4 {

	public static void main(String[] args) {
		DecimalFormat text = new DecimalFormat("#,###.00");
		String unit;
		String ppu;
		String product = JOptionPane.showInputDialog("Input Product Name");
		unit = JOptionPane.showInputDialog("Input Product Unit");
		int units = Integer.parseInt(unit);
		ppu = JOptionPane.showInputDialog("Input Price per unit");
		float ppus = Float.parseFloat(ppu);
		float vatprice = (units*ppus)*7/100+(units*ppus);
		JOptionPane.showMessageDialog(null, "Total Price is"
				+(units*ppus)+" baht."
				+"\nAdd vat 7% is "+text.format(vatprice)+" bath.");
	}

}
