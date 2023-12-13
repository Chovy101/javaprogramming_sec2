import java.util.*;
public class Example_503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scan.nextLine();
		String message2 = message;
		String message3 = message.toLowerCase();
		if (message3.indexOf("nichi")>=0) {
			System.out.print("Nichi is a sentence");	
		}
		else {
			System.out.print(message2);
			
		}
	}

}

