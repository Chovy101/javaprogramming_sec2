
public class example1 {

	public static void main(String[] args) {
		int[] num = {12,50,93,45,75,52,80};
		for(int i=0;i<num.length;i++) {
			System.out.println("num["+i+"]="+num[i]);
		}
		System.out.println("using foreach to display value from array nums ");
		int x = 0;
		for(int _number:num) {
			System.out.println("num["+x+"]="+_number);
			x=x+1;
		}
		printArray(num);

	}
	public static void printArray(int[] _num) {
		System.out.println("using foreach to display value from array nums ");
		for(int i=0; i< _num.length;i++) {
			System.out.println("num["+i+"]="+_num[i]);
		}
	}

}
