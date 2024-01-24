public class test2 {

	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		 Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		 System.out.println(c1);
		 c1.setDiscount(5);
		 System.out.println(c1);
		 System.out.println("**************************************************");
		 System.out.println("ID is:"+c1.getID()+"\nname is: "+c1.getName()+"\ndiscount is: "+c1.getDiscount());
		 System.out.println("**************************************************");
		 System.out.println("###Test Invoice class###");
		 Invoice c2 = new Invoice(101, c1, 12000.00);
		 System.out.println(c2);
		 c2.setAmount(10000.00);
		 System.out.println(c2);
		 System.out.println("**************************************************");
		 System.out.println("ID is:"+c2.getID()+"\nname is: "+c2.getCustomerName()+"\ndiscount is: "+c2.getAmount());
		 System.out.println("**************************************************");
		 System.out.print("Customer id is : "+c1.getID()+"\ncustomer name is: "+c1.getName()+"\ncustomer discount is: "+c1.getDiscount()
		 +"\namount after discount is: "+c2.getAmountAfterDiscount());
		 
		 
		 
		 
		 
		 
		 }

	}

