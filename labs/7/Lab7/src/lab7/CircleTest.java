package lab7;
public class CircleTest {

	public static void main(String[] args) {
		double area, perimeter;
		Circle c1 = new Circle(2, 2, 5.5);
		area = c1.getArea();
		perimeter = c1.getPerimeter();
		System.out.println("Area: " + area + "  Perimeter: " + perimeter);
		
		boolean containone, containtwo, overlapone;
		
		containone = c1.contains(3, 3);
		containtwo = c1.contains(new Circle(4, 5, 10.5));
		overlapone = c1.overlaps(new Circle(3, 5, 2.3));
		
		System.out.println("circle c1 contains circle (3,3) " + containone);
		System.out.println("circle c1 contains circle (4, 5, 10.5) " + containtwo);
		System.out.println("circle c1 overlaps circle (3, 5, 2.3) " +  overlapone);

	}

}
