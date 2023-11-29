import java.util.*;
public class PensionContributionCalculator1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,y;
		int sum = 0;
		System.out.print("Input value of X : ");
		x = scan.nextInt();
		System.out.print("Input value of Y : ");
		y = scan.nextInt();
		if(x>y) 
		{
			System.out.print("Input value of Y,again : ");
			y = scan.nextInt();

		}
		while(x<=y) {
			sum +=x;
			System.out.print(x+" + "+y+" = "+sum);
			x++;		
			}

	}
}

