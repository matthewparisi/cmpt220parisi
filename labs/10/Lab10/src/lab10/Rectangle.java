package lab10;

public class Rectangle implements Printable {
	
	  private double width;
	  private double length;

	  public Rectangle(int wid,int len) {
		  this.width = wid;
		  this.length = len;
	  }
	  
	  public double area() {
	        return width * length;
	  }

	  public double premeter() {
	        return 2*width+2*length;
	  }

	@Override
	public void print() {
		System.out.println("Rectangles width: " + width + " Rectangles length: " + length + " area: " + this.area() + " peremeter: " + this.premeter() );
		
	}

}
