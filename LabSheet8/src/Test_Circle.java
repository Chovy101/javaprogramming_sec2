
public class Test_Circle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		c1.radius = 12.5;
		c2.radius = 5.5;
		System.out.println("Radius of object c1 = "+c1.getRadius());
		System.out.println("Area of object c1 = "+c1.getArea());
		System.out.println();
		System.out.println("Radius of object c2 = "+c2.getRadius());
		System.out.println("Area of object c2 = "+c2.getArea());
	}
	public static String ShowColor(String color) {
		return "The Color is " + color ;
	}

}
