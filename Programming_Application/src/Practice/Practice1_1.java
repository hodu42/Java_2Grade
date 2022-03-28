package Practice;

import java.util.Scanner;

public class Practice1_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String name = s.next();
		int age = s.nextInt();
		char gender = s.next().charAt(0);
		boolean isReal = s.nextBoolean();

		System.out.println("1. print(ln) »ç¿ë");
		System.out.println("My name is " + name + "(" + gender + "), " + "age is " + age);
		System.out.println("This statement is " + isReal);
	}

}
