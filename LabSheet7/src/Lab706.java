import javax.swing.*;
public class Lab706 {

	public static void main(String[] args) {
		int [] num = {25, 78, 41, 22, 36, 85, 37};
		int indexnum = Integer.parseInt(JOptionPane.showInputDialog("Input index of array: "));
		while(checkIndex(num,indexnum)) {
			indexnum = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again "));
		}
		int currentValue = currentData(num,indexnum);
			JOptionPane.showMessageDialog(null, "Current data, num["+indexnum+"] is "+currentValue
					+((indexnum-1<0)?"\nNo previous data":"\nPrevious data, nums["+(indexnum-1)+"] is "+prevData(num,indexnum))
					+((indexnum+1>num.length)?"\nNo next data":"\nNext data, nums["+(indexnum+1)+"] is "+nextData(num,indexnum)));
		}
			
	public static boolean checkIndex(int[] num,int index) {
		if(index>=num.length||index<0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static int currentData(int[] num,int index) {
		return num[index];
	}
	public static int prevData(int[] num,int index) {
		return num[index-1];

	}
	public static int nextData(int[]num, int index) {
		return num[index+1];

	}

}

