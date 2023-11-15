import java.util.Scanner;
import java.text.*;
public class Ex3 {

	public static void main(String[] args) {
		DecimalFormat text = new DecimalFormat("#,###.00");
		final int vat = 7;
		Scanner name = new Scanner(System.in);
		
		System.out.print("Input product name   : ");
		String product = name.nextLine();
		System.out.print("Input product unit   : ");
		int unit = name.nextInt();
		System.out.print("Input price per unit : ");
		float ppu = name.nextFloat();
		float total = ppu*unit;
		float totalvat = total*7/100+total;
		
		System.out.println();
		
		System.out.println("Total Price is "+(ppu*unit)+" bath.");
		System.out.println("Add vat 7%  is "+text.format(totalvat)+" bath.");
	}

}
