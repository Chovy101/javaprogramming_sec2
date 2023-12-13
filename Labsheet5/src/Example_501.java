import java.util.*;
public class Example_501 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullname = scan.nextLine();
		String firstName;
		
		String lastName;
		int space;
		space = fullname.indexOf(' ');
		
		if (space == -1)
		{
			System.out.print("Incorrect Name");
		}
		else 
		{
		firstName = fullname.substring(0, space);
		lastName = fullname.substring(space+1);
		System.out.println("First Name: "+firstName.toUpperCase());
		System.out.println("Last Name: "+lastName.toLowerCase());
		}
		
	}

}

