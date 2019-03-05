package lab4;

public class Problem1 {

	public static void main(String[] args) {
		System.out.println("in      cm | cm     in");
		System.out.println("----------------------");
		int inches = 1;
		int centi = 1;
		double conintocen = 2.54;
		double cocentoin = 0.39;
		
		for (int i = 1; i < 51 ; i++){
			double intocen = inches * conintocen ;
	 		double centoin = centi * cocentoin;
			System.out.printf("%2d  %6.2f | %3d  %5.2f\n" , i , intocen , centi , centoin) ;
			inches = inches + 1;
			centi = centi + 5;
			
		}
		
	}
		
}
