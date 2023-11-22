import javax.swing.*;
public class Ex2 
{
	public static void main(String[] args) 
	{
		double Weight = Double.parseDouble(
				JOptionPane.showInputDialog("Input Weight: "));
		double Hight = Double.parseDouble(
				JOptionPane.showInputDialog("Input Hight: "));
		
		double convert = Hight/100;
		double bmi = Weight/(convert*convert);
		
		
		String bmiCategory  ;
		if(bmi<18.5) bmiCategory = "UnderWeight" ;
		else if (bmi>18.5 && bmi<25) bmiCategory = "Normal-weight";
		else if (bmi>25 && bmi<30) bmiCategory = "OverWeight";
		else bmiCategory = "Obesity";
		

				
	}
}
