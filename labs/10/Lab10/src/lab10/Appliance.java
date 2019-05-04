package lab10;

public abstract class Appliance implements Comparable<Appliance>  {
	private double voltage;
	private String Color;
	private String madein;
	private double price;
	
	Appliance(){}
	Appliance(double voltage, String color, String madein, double price){
		this.Color = color;
		this.voltage = voltage;
		this.madein = madein;
		this.price = price;
	}
	
	public double getVoltage() {
		return voltage;
	}
	
	public String getColor() {
		return Color;
	}
	
	public String getMadein() {
		return madein;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double newprice) {
		price = newprice;
	}
	@Override
	public int compareTo(Appliance arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
