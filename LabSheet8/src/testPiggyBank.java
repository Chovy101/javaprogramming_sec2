import java.util.*;
public class testPiggyBank {
	static PiggyBank pb = new PiggyBank();
	static Scanner scan = new Scanner(System.in);
	static String red = "\u001b[31m";
	public static void main(String[] args) {
		/*pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal()); 
		pb.addFive(100);*/
		inputCoin();
	}
	public static void inputCoin() {
		System.out.println("Money total : "+pb.getTotal());
		System.out.print("Please difine size of PiggyBank: ");
		int size = scan.nextInt();
		pb.setPiggyBank(size);;
		System.out.println("size of Your PiggyBank: "+pb.getPiggyBank());
		System.out.println();
		MenuPiggyBank();
		
	}
	public static void Line() {
		System.out.println("============================");
	}
	public static void MenuPiggyBank() {
		while(true) {
			Line();
			System.out.println("Menu of PiggyBank");
			Line();
			System.out.println("[1] one baht."
					+ "\n[2] two baht."
					+ "\n[3] five baht."
					+ "\n[4] ten baht."
					+ "\n[5] Exit");
			Line();
			System.out.print("Plese select Menu[1-5] : ");
			int menu = scan.nextInt();
			int idk=0;
			if (menu == 1) idk=1;
			if (menu == 2) idk=2;
			if (menu == 3) idk=5;
			if (menu == 4) idk=10;
			if (menu == 5) {
				System.out.println("Bye Bye");
				break;
			}
			System.out.print("Insert "+idk+" Baht Money: ");
			int money = scan.nextInt();
			if (money>pb.getPiggyBank()) System.out.println(red+"Piggy Bank Full");
			else if (menu == 1) {
				pb.addOne(money);
			}
			else if (menu == 2) {
				pb.addTwo(money);
			}
			else if (menu == 3) {
				pb.addFive(money);
			}
			else if (menu == 4) {
				pb.addTen(money);
			}			
			System.out.println("Money Total : "+money);
			
		}
	}
	

}
