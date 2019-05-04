package lab10;

public class SportCar implements Printable {
	private String cartype;
	private int idnumber;
	
	public SportCar(String car, int idnum) {
		this.cartype = car;
		this.idnumber = idnum;
	}
	
	@Override
	public void print() {
		System.out.println("Type of car: " + cartype + " Id number: " + idnumber);
		
	}
	
	

}
