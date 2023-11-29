import java.util.*;
public class Example1 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int current , prenumber;
		
		System.out.print("Input number : ");
		current = scan.nextInt();
		System.out.print("Input number : ");
		prenumber = scan.nextInt();
		
		while(true) 
		{
			System.out.print("Input Number : ");
			current = scan.nextInt();
			if(current<prenumber) 
			{
				break;
			}
			prenumber = current;
		}
		System.out.print("\nBye Bye");
	}
}
