
public class Ex1 {

	public static void main(String[] args) {
		
		String BookISBM = "IB2-6325-85-4-1";
		String BookTitle = "Basic Java Programming ";
		int BookUnit = 5;
		double BookPrice = 225.75;
		
		System.out.println("Book ISBM  : "+BookISBM);
		System.out.println("Book Title : " +BookTitle);
		System.out.println("BookUnit   : " + BookUnit + " Books.");
		System.out.println("BookPrice  : " +BookPrice+ " Bath.");
		System.out.println("---------------------------------------");
		
		double totalprice = BookUnit*BookPrice;
		double vatprice = (totalprice*7/100)+totalprice;
		
		System.out.println("Total Price is "+totalprice);
		System.out.print("ADD VAT 7% is "+vatprice);
		

	}

}
