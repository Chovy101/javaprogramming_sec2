
public class Ex2 {

	public static void main(String[] args) {
		
		final int BUFFET = 299;
		int customer = 5;
		
		float total = BUFFET * customer;
		float servicecharge = (total*3/100)+total;
		
		System.out.println("Buffet of "+ customer+" is "+ total);
		System.out.println("Add Service Charge 3% is "+servicecharge);
	}

}
