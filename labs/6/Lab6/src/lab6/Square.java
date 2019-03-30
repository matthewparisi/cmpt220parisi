package lab6;
public class Square {
		double width = 1;
		
		Square(){}
		Square(double width){
			this.width = width;
		}
		
		double getArea() {
			return width * width ;
		}
		
		double getPerimiter() {
			return 4 * width;
		}
				
	}


