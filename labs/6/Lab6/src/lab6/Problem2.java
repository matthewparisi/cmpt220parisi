package lab6;

public class Problem2 {

	public static void main(String[] args) {
		Bond bond = new Bond(500, 100, 0.05, 10000);
		
		System.out.printf("the price of the bond is  $%.2f" , bond.getprice());

	}

}
