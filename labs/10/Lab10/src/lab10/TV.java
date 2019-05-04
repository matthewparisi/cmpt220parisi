package lab10;

public class TV  extends Appliance {
	private int size;
	private String brand;
	private boolean hasinternet;
	
	public TV(int size, String brand, boolean hasinternet, double voltage, String color, String madein, double price ) {
		super(voltage, color, madein, price);
		this.brand = brand;
		this.hasinternet = hasinternet;
		this.size = size;
	}
	
	public TV() {
		super(0, "none", "none", 0);
	}

	public int getsize() {
		return size;
	}

	public void setsize(int size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean hasinternet() {
		return hasinternet;
	}

	public void sethasinternet(boolean hasinternet) {
		this.hasinternet = hasinternet;
	}

	@Override
	public String toString() {
		return "TV [size: " + size + ", brand: " + brand + ", is smart:" + hasinternet + "]";
	}
	
}

