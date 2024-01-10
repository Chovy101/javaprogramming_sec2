
public class PiggyBank {
	public int one;
	public int two;
	public int five;
	public int ten;
	public int size;
	
	public void setPiggyBank(int s) {
		size = s;
	}
	public int getPiggyBank() {
		return size;
	}
	public void clear() {
		one = 0;
		two = 0;
		five = 0;
		ten = 0;
	}
	public int getTotal() {
		return one+(two*2)+(five*5)+(ten*10);
	}
	public void addOne(int c) {
		if (getTotal()+c<=size) {
			one = one+c;
		}
		else {
			System.out.println("Piggy Bank full");
		}
	}
	
	public void addTwo(int c) {
		if (getTotal()+c*2<=size) {
			two = two+c;
		}
		else {
			System.out.println("Piggy Bank full");
		}
	}

	public void addFive(int c) {
		if (getTotal()+c*5<=size) {
			five = five+c;
		}
		else {	
			System.out.println("Piggy Bank full");
		}
		
		}
	
	public void addTen(int c) {
		if (getTotal()+c*10<=size) {
			ten = ten+c;
		}
		else {
			System.out.println("Piggy Bank full");
	}
	

	}

	}

