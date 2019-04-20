package lab8;

public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getArea() {
		double area;
		area = (side1 + side2 + side3) / 2 ;
		return area;
		
	}
	
	public double getPerimeter() {
		double perimeter;
		perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	public String tostring() {
		return "Side 1: " + side1 + " Side 2: " + side2 + " Side : " + side3;
	}
	
	

}
