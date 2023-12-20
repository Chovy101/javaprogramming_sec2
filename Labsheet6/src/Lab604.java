import java.util.*;
public class Lab604 {
	static Scanner scan = new Scanner(System.in);
	static String studenid,strsubjectid;
	static int subject;
	public static void main(String[] args) {
		inputStudent();
		
	}
	public static void 	inputStudent() {
		do {
		System.out.print("Enter studen Id: ");
		studenid = scan.next();
		System.out.print("Enter subject Id: ");
		subject = scan.nextInt();
		
		strsubjectid = subject+"";
		}while(!(isLength(studenid,strsubjectid)));
		System.out.println();
		displayData(isITsubject(studenid),isITsubject(strsubjectid));
	}
	public static boolean isLength(String id,String sub_id) {
		if(id.length()==10 && sub_id.length()==7) {
			return true;
		}
		return false;
	}
	public static boolean isITsubject(String sub_id) {
		if(sub_id.substring(0,2).equals("21")&&sub_id.substring(4,5).equals("1")) {
			return true;
		}
			else {
		return false;
			}
	}
	
	public static void displayData(boolean sid,boolean subid) {
		if(sid) {
			System.out.println("Student id: "+ studenid +" 1st year student in IT");
		}
		else {
			System.out.println("Student id: "+ studenid +" is not 1st year student in IT");
		}
		if(sid==true) {
			System.out.println("Enroll in course for Year 1");
		}
		else {
			System.out.println("not enroll in course for Year 1");
			
		}
	}
}
