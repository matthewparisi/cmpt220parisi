package lab9;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class Problem4_DinnerRemoval {
	
	public static void main(String[]args) throws FileNotFoundException {
		if (args.length != 2) {
			System.out.println("Usage: java - . -");
			System.exit(1);
		}
		File outfile = new File("Temp.txt");
		PrintWriter pw = new PrintWriter(outfile);
		File infile = new File(args[1]);
		Scanner input1 = new Scanner(infile);
		while (input1.hasNext()) {
			String line = input1.nextLine();
			pw.println(line.replaceAll(args[0],""));
		}
		infile.delete();
		outfile.renameTo(infile);
		
		input1.close();
		pw.close();
	}
	
	
	


}

