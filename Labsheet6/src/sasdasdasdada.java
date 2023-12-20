import java.util.*;
public class sasdasdasdada {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your name, seperate by space.\n:");
		String fullName = input.nextLine();
		System.out.println(abbreviatName(fullName));
	}//end of main()
	public static String abbreviatName(String fullname) {
		String firstName = fullname.substring(0, fullname.indexOf(' '));
		String middleName = fullname.substring(0);
		String lastName = fullname.substring(0);
		return abbreviatName(fullname);
	}

}
