package P_7_11;

import java.util.Scanner;

public class NumberOfWords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the string: ");
		String str = in.nextLine();
		System.out.print("Number of words: " + count_Words(str) + "\n");
	}

	private static int count_Words(String str) {
		String[] sentence = str.split(" ");
		return sentence.length;
	}
}
