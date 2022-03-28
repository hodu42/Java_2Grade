package Practice;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Pr_fileInputStandardoutput2 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(new File("C:\\Users\\hodu42\\eclipse-workspace\\Programming_Application\\src\\Practice\\p4.txt"));
		
		String name;	int age;	double height;		int count = 0;
		
		double avgAge = 0;	double avgHeight = 0;
		int sumAge = 0;		double sumHeight = 0;
		
		while(sc.hasNext()) {
			
			if(!sc.nextBoolean()) {
				sc.nextLine();
				continue;
			}
			name = sc.next();		age = sc.nextInt();			height = sc.nextDouble();
			System.out.printf("%s %4d %4.1f\n", name, age, height);
			count++;
			sumAge += age;
			sumHeight += height;
		}
		
		avgAge = (double) sumAge / (double) count;
		avgHeight = sumHeight / (double) count;
		
		System.out.printf("total number: %d\n", count);
		System.out.printf("average age: %.1f\n", avgAge);
		System.out.printf("average height: %.1f", avgHeight);
	}

}