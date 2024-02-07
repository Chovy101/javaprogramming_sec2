import java.util.*;
import java.io.*;
public class Lab1204 {

	public static void main(String[] args)throws IOException {
		Scanner input = new Scanner(System.in);
		BufferedReader book = new BufferedReader(new FileReader("D:\\txtfile\\BookData.txt"));
		System.out.print("Enter rating of books : ");
		float inputRate = input.nextFloat();
		System.out.println("---------------------------------------------------------");
		String tmp = "";
		int booknumber = 1;
		int bookcount = 0;
		while((tmp = book.readLine()) != null) {
			String[] data  = tmp.split("\t");
			String title = data[0];
			String author = data[1];
			float rating = Float.parseFloat(data[2]);
			int review = Integer.parseInt(data[3]);
			if(rating >= inputRate) {
				System.out.println("Book "+i+":"+title+" write by "+author+" ("+review+") reviews");
				bookcount++;
			}
			booknumber++;
		}
		book.close();
		System.out.println("---------------------------------------------------------");
		System.out.println("There are "+bookcount+" book get rating more than "+inputRate);
	}

	}

