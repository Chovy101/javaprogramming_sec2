import javax.swing.*;
import java.util.*;
public class ex503 {

	public static void main(String[] args) {
		String sentence;
		sentence = JOptionPane.showInputDialog("Input a sentence: ");
		while(!sentence.endsWith(".")) {
			sentence = JOptionPane.showInputDialog("Input a sentence,again ");
		}
		int countspace = 0;
		for(int i =0;i<sentence.length() - 1 ;i++) {
			if(sentence.charAt(i)==' ') {
				countspace+=1;
			}
		}
		JOptionPane.showMessageDialog(null, "This sentence has "+countspace+" spacebar."
				+ "\nThis sentence has "+(countspace+1)+" word.");
	}
}