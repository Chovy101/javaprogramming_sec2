
public class Circle {
	public static final double def_radius = 1.0;
	public static final String def_color = "red";
	
	private double radius;
	private String color;
	
	Circle(){
		this.radius = def_radius;
		this.color = def_color;
	}
	Circle(double radius){
		this.radius = radius;
		this.color = color;
	}
	Circle(double radius,String color){
		this.radius = radius;
		this.color = color;
	}
	public double getRadius(){
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return "Circle[radius ="+this.radius+", color= "+color+"]";
	}
	public double getArea() {
		return Math.PI * radius *radius;
	}
	public double getCircumference() {
		return 2.0*Math.PI*radius;
	}
}
