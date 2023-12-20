import javax.swing.*;
public class lab602 {

	public static void main(String[] args) {
		int year = Integer.parseInt(JOptionPane.showInputDialog("Input year: "));
        while(!(ckYear(year))){
        	year = Integer.parseInt(JOptionPane.showInputDialog("Please input year between 1000-3000"
        			+ "\nInput year again "));
        }
        if(isLeapYear(year)==true) {
        	JOptionPane.showMessageDialog(null, year+"Leap year");
        }
        else {
        	JOptionPane.showMessageDialog(null, year+"is not Leap year");

        }
        }
	public static boolean isLeapYear(int year) {
		if(year%4==0||year%400==0) {
			return true;
		
		}else {
		return false;
		}
	}
	public static boolean ckYear(int year) {
		if(year >=1000 & year <=3000) {
			return true;
		}else {
		    return false;
		}
	}
}