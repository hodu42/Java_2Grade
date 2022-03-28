package Practice;

import java.util.Scanner;

public class Practice1_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String name = s.next();
		int age = s.nextInt();
		char gender = s.next().charAt(0);
		boolean isReal = s.nextBoolean();

		System.out.println("2. print f »ç¿ë");
		System.out.printf("My name is %s(%c), age is %d\n", name, gender, age);
		System.out.printf("This statement is %b\n\n", isReal);

	}

}
