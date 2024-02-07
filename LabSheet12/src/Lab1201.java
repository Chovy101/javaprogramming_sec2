import java.util.*;
import java.io.*;
public class Lab1201 {

	public static void main(String[] args)throws IOException{
		Scanner read = new Scanner(new File("D:\\txtfile\\MemberLogin.txt"));
		while(read.hasNext()) {
			String firstname = read.next();
			String lastname = read.next();
			read.next();
			String email = read.next().toUpperCase();
			String mname = lastname.substring(0,1).toUpperCase()+"."+firstname;
			System.out.println(mname+" ("+email+")");
		}
		read.close();
	}

}
