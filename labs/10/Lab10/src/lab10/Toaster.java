package lab10;

public class Toaster extends Appliance {
	private int modelnumber;
	private String brand;
	private boolean issmart;
	
	public Toaster(int modelnum, String brand, boolean issmart, double voltage, String color, String madein, double price ) {
		super(voltage, color, madein, price);
		this.brand = brand;
		this.issmart = issmart;
		this.modelnumber = modelnum;
	}
	
	public Toaster() {
		super(0, "none", "none", 0);
	}

	public int getModelnumber() {
		return modelnumber;
	}

	public void setModelnumber(int modelnumber) {
		this.modelnumber = modelnumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isIssmart() {
		return issmart;
	}

	public void setIssmart(boolean issmart) {
		this.issmart = issmart;
	}

	@Override
	public String toString() {
		return "Toaster [modelnumber: " + modelnumber + ", brand: " + brand + ", is smart:" + issmart + "]";
	}
	
	

}
