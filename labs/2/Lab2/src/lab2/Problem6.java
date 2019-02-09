package lab2;
import java.util.concurrent.ThreadLocalRandom;
public class Problem6 {

	public static void main(String[] args) {
		System.out.println("This program prints out a random phone number");
		int randint = ThreadLocalRandom.current().nextInt(200, 999 );
		int randint2 = ThreadLocalRandom.current().nextInt(1000 , 9999 );
		int randint3 = ThreadLocalRandom.current().nextInt(100 , 999);
		System.out.println("(" + randint + ") " + randint2 + " - " + randint3  );
		

	}

}
