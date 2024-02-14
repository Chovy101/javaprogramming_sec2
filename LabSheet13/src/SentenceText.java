import java.io.*;
import java.util.*;
public class SentenceText {

	public static void main(String[] args)throws IOException{
		PrintStream writeFile = new PrintStream(new File("D:\\txtFile\\Sentence.txt"));
		Scanner scan = new Scanner(System.in);
		int i =1;
		while(true) {
			System.out.print("Sentence: ");
			String word = scan.nextLine().toUpperCase();
			if((word.equals("Stop"))){
				break;
			}
			writeFile.println(i+":"+word);
			i++;
		}
		System.out.print("File is save!!");
		writeFile.close();
	}
}
