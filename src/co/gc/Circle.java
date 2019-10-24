package co.gc;

public class Circle {
	
	private double radius;
	private double circumference;
	private double area;
	
	public Circle(){
		radius = 0.0;
		circumference = 0.0;
		area = 0.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getCircumference() {
		circumference = Math.PI * (2 * radius);
		return circumference;
	}
	
	public double getArea() {
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	private static String formatNumber(double x) {
		return String.format("%.2f", x);
	}
	
	public String getFormattedCircumference() {
		return formatNumber(getCircumference());
	}
	
	public String getFormattedArea() {
		return formatNumber(getArea());
	}
	
	@Override 
	public String toString() {
		return String.format("\nRadius: " + formatNumber(radius) + "\nCircumference: " + getFormattedCircumference() + "\nArea: " +getFormattedArea());
		 
	}

}
