import java.util.*;
import java.text.*;
public class PensionContributionCalculator2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int SALARY = 6000;
		final double rate_above_55_and_below = 0.2;
		final double rate_above_55 = 0.17;
		final double rate_above_55_to_60 = 0.13;
		final double rate_above_55_to_60_tobton = 0.13;
		final double rate_above_60_to_65 = 0.075;		
		final double rate_above_60_to_65_tobton = 0.09;
		final double rate_above_65 = 0.05;
		final double rate_above_65_tobton = 0.075;
		DecimalFormat text = new DecimalFormat("#,###.00");
		int salary , age;
		System.out.print("Enter the monthly salary : ");
		salary = scan.nextInt();
		System.out.print("Enter the age : ");
		age = scan.nextInt();

		int contributableSalary;
		double empContri ,emprContri,totalcontri;
		contributableSalary = 6000;


		if(age <=55) {
			empContri = salary*rate_above_55_and_below;
			emprContri= salary*rate_above_55;
			totalcontri = empContri+emprContri;
			System.out.println("The employee contribution is : "+"$"+text.format(empContri));
			System.out.println("The employee contribution is : "+"$"+text.format(emprContri));
			System.out.println("The total contribution    is : "+"$"+text.format(totalcontri));
		}
		else if (age <=60) {
			empContri = salary*rate_above_55_to_60;
			emprContri= salary*rate_above_55_to_60_tobton;
			totalcontri = empContri+emprContri;
			System.out.println("The employee contribution is : "+"$"+text.format(empContri));
			System.out.println("The employee contribution is : "+"$"+text.format(emprContri));
			System.out.println("The total contribution    is : "+"$"+text.format(totalcontri));
		}
		else if (age <=65) {
			empContri = salary*rate_above_60_to_65;
			emprContri= salary*rate_above_60_to_65_tobton;
			totalcontri = empContri+emprContri;
			System.out.println("The employee contribution is : "+"$"+text.format(empContri));
			System.out.println("The employee contribution is : "+"$"+text.format(emprContri));
			System.out.println("The total contribution    is : "+"$"+text.format(totalcontri));
		}
		else {
			empContri = salary*rate_above_65;
			emprContri= salary*rate_above_65_tobton;
			totalcontri = empContri+emprContri;
			System.out.println("The employee contribution is : "+"$"+text.format(empContri));
			System.out.println("The employee contribution is : "+"$"+text.format(emprContri));
			System.out.println("The total contribution    is : "+"$"+text.format(totalcontri));
		} 
			






	}

}
