package lab1;

public class Problem2 {

	public static void main(String[] args) {
		double fourthpi = 0.0;
		double firstone = 0.0;
		fourthpi = (1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/9.0 - 1.0/11.0 + 1.0/13.0);
		firstone = (1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/9.0 - 1.0/11.0);
		System.out.println(fourthpi);
		System.out.println("pi = " + 4 * fourthpi);
		System.out.println(firstone);
		System.out.println("pi = " + 4 * firstone);
	}

}
