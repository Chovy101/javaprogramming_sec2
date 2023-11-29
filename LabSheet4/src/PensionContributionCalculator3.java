import java.util.*;
import java.text.*;
public class PensionContributionCalculator3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final double COMMITSION = 0.15;
		final int SENTINEL = -1;
		final int common_salary = 1000;
		int sales  ;
		double salary;
		while(true) {
			System.out.print("Enter sales in dollars (or -1 to end):");
			sales = scan.nextInt();
			if(sales == SENTINEL) {
				break;
				}
			salary = sales*COMMITSION+common_salary;
			System.out.println("Salary is :"+salary);
			}
		System.out.println("bye");
		}
	}

