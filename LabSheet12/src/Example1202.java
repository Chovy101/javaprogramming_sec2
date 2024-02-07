import java.util.*;
import java.io.*;
public class Example1202 {

	public static void main(String[] args)throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.print("Input Section: ");
		int sectionInput = input.nextInt();
		Header();
		showListStudent(sectionInput);
	}
	public static void showListStudent(int section)throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader("D:\\txtFile\\List107.txt"));
		String tmp = "";
		while((tmp = readFile.readLine())!=null) {
			String [] data = tmp.split("\t");	
			int sectionData = Integer.parseInt(data[3]);
			double midscore = Double.parseDouble(data[4]);
			double finalscore = Double.parseDouble(data[5]);
			if(sectionData == section) {
				System.out.println(data[0]+"\t"+data[2]+"\t"+midscore+"\t"+finalscore +" "+ findResult(midscore,finalscore));
			}
		}
		readFile.close();
	}
	public static String findResult(double midscore,double finalscores) {
		double totalScore = midscore+finalscores;
		if(totalScore<=40) {
			return "fail";
		}
		else {
			return "pass";
		}
	}
	public static void Header() {
		System.out.println("***********************************************");
		System.out.println("\t\tList of Data for Section");
		System.out.println("***********************************************");
	}

}
