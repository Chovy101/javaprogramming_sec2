import java.text.DecimalFormat;

public class TestCircle_A {

	public static void main(String[] args) {
		CIrcle_A c1 = new CIrcle_A();
		CIrcle_A c2 = new CIrcle_A();
		CIrcle_A c3 = new CIrcle_A();
		
		
		c1.setRadius(2.0);
		c1.setColor("blue");
		c2.setRadius(2.0);
		c2.setColor("red");
		c3.setRadius(1.0);
		c3.setColor("red");
		
		DecimalFormat text = new DecimalFormat("##.00");
		System.out.println("Circle of object c1 area is "+text.format(c1.getArea())+", and color is "+c1.getColor());
		System.out.println("Circle of object c2 area is "+text.format(c2.getArea())+", and color is "+c2.getColor());
		System.out.println("Circle of object c3 area is "+text.format(c3.getArea())+",  and color is "+c3.getColor());
	}
}
