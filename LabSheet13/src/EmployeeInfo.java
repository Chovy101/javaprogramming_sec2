import java.util.*;
import java.io.*;
public class EmployeeInfo {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String choice, department;
		System.out.print("Insert or Read data? : ");
		choice = input.next().toLowerCase();
		while(!(choice.equals("insert")) && !(choice.equals("read"))) {
		System.out.print("Please txt insert or read data? : ");
		choice = input.next().toLowerCase();
		}
		
		SavenedOpen obj = new SavenedOpen();
		if(choice.equals("insert")) {
			obj.insert();
		}
		else if(choice.equals("read")) {
			System.out.print("\nEnter dept: ");
			department = input.next();
			obj.setdept(department); 
			obj.read();
		}
		
	}

}
