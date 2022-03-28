package Practice;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class Practice1_3and4 {

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(new File("C:\\Users\\hodu42\\eclipse-workspace\\Programming_Application\\src\\Practice\\information.txt"));

		String name = s.next();
		int age = s.nextInt();
		char gender = s.next().charAt(0);
		boolean isReal = s.nextBoolean();

		PrintStream outputFile = new PrintStream("C:\\Users\\hodu42\\eclipse-workspace\\Programming_Application\\src\\Practice\\output.txt");
		System.out.println("3. file input, file output");
		outputFile.printf("My name is %s(%c), age is %d\n", name, gender, age);
		outputFile.printf("This statement is %b", isReal);

	}

}
