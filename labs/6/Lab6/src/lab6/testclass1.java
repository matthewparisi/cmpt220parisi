package lab6;

public class testclass1 {

	public static void main(String[] args) {
		Square sq1 = new Square(40.0);
		Square sq2 = new Square(35.9);
		
		System.out.println("Square 1 width, area, perimiter: " + sq1.width + ", " + sq1.getArea() + ", " + sq1.getPerimiter());
		
		System.out.println("Square 2 width, area, perimiter: " + sq2.width + ", " + sq2.getArea() + ", " + sq2.getPerimiter());

	} 

}
