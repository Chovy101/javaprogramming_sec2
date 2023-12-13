import javax.swing.*;
import java.util.*;
public class ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a Sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("Input a Sentence, again : ");
			sentence = scan.nextLine();
		}
		int countspace = 0;
		for(int i =0;i<sentence.length() - 1 ;i++) {
			if(sentence.charAt(i)==' ') {
				countspace+=1;
			}
		}
		System.out.println("This sentence has "+countspace+"spacebar." );
		System.out.println("This sentence has "+(countspace+1)+"word." );

	}

}
