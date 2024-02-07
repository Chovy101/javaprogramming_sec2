import java.util.*;
import java.io.*;
public class Lab1202 {

	public static void main(String[] args)throws IOException{
		Scanner read = new Scanner(new File("D://txtfile//MemberLogin.txt"));
		Scanner input = new Scanner(System.in);
		System.out.print("Input email : ");
		String email = input.nextLine();
		Boolean x = false;
		while(read.hasNext()) {
			read.next();
			read.next();
			String pass = read.next();
			String mail = read.next();
			if(mail.equals(email)) {
				System.out.println("Your password is "+pass);
				x = true;
			}
		}
		read.close();
		if(x==false) {
			System.out.println("The data not found......");
		}

	}
}

