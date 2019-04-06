package lab7;

public class Circle {
	    
	    private double x,y,radius;
	    
	    //constructor
	    Circle(){
	        x = 0;
	        y = 0;
	        radius = 1;
	    }
	    
	    //constructor 
	    Circle(double x, double y, double radius){
	        this.x = x;
	        this.y = y;
	        this.radius = radius;
	    }
	    
	    double getArea(){
	        return Math.PI*radius*radius;
	    }

	    double getPerimeter(){
	        return 2*Math.PI*radius;
	    }
	    
	    boolean contains(double x, double y){
	        return ((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y)<=radius*radius);
	    }
	    
	    boolean contains(Circle circle){
	        return this.contains(circle.x,circle.y);
	    }
	    
	    boolean overlaps(Circle circle){
	        return ((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y)<=(circle.radius+radius)*(circle.radius+radius));
	    }
	    
	    
	    public String toString(){
	        return "("+x+","+y+") : "+radius;
	    }
	}


