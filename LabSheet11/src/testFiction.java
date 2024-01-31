import java.util.Scanner;
public class testFiction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("");
		String title = scan.nextLine();

		System.out.print("");
		int year = scan.nextInt();
		scan.nextLine();
		FictionBook book = new FictionBook(title,year);
		do
		{
		System.out.print("");
		book.setAuthorName(scan.nextLine());

		System.out.print("");
		book.setEmail(scan.nextLine());
		}
		while(!(book.checkFormatName()||book.checkEmail()));
		System.out.println();
		System.out.print(book);


	}

}