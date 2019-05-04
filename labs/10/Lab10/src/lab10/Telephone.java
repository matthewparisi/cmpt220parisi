package lab10;

public class Telephone extends Appliance {
	private int screensize;
	private String brand;
	private boolean fivegcapible;
	
	public Telephone(int screensize, String brand, boolean fivegcapible, double voltage, String color, String madein, double price ) {
		super(voltage, color, madein, price);
		this.brand = brand;
		this.fivegcapible = fivegcapible;
		this.screensize = screensize;
	}
	
	public Telephone() {
		super(0, "none", "none", 0);
	}

	public int getscreensize() {
		return screensize;
	}

	public void setscreensize(int screensize) {
		this.screensize = screensize;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean fivegcapible() {
		return fivegcapible;
	}

	public void setfivegcapible(boolean fivegcapible) {
		this.fivegcapible = fivegcapible;
	}

	@Override
	public String toString() {
		return "Telephone [screensize: " + screensize + ", brand: " + brand + ", is smart:" + fivegcapible + "]";
	}
	
}


