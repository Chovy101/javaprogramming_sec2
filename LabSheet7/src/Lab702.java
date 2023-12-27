import java.text.DecimalFormat;
import java.util.*;
public class Lab702 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat from = new DecimalFormat("##.00");
		double[] score = new double[5];
		double sum = 0,avg = 0;
		for(int i=0;i<score.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			score[i] = scan.nextDouble();
			sum += score[i];
		}
		avg= sum/score.length;
		System.out.print("\nAverage of "+score.length+" student is "+from.format(avg));
		int j = 0;
		for(double _score:score) {
			if(_score>avg) {
				System.out.print("\n> Student "+(j+1)+" ("+from.format(_score)+")");
				j++;
			}
			
			
		}
	}

}