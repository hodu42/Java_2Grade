package InputOutput;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class P_3_1 {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(new File("C:\\Users\\hodu42\\eclipse-workspace\\Programming_Application\\src\\InputOutput\\p3_1_input.txt"));
		
		double sum = 0;
		
		while (sc.hasNext()) {
			if (sc.hasNextDouble()) {
				sum += sc.nextDouble();
			}
			else sc.next();
		}
		
		System.out.println(sum);

	}

}
