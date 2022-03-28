package P_7_13;

import java.util.Scanner;

public class PrintMiddleCharacter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a string: ");
		String str = in.nextLine();
		System.out.print("The middle character in the string: " + middle(str) + "\n");
	}

	private static String middle(String str) {
		int count = str.length();
		String middleStr = "";	char ch1;
		
		if(count%2==0)
		{
			middleStr = str.substring(count/2-1, count/2+1);
			return middleStr;
		}
		
		else
		{
			ch1 = str.charAt(count/2);	
		}
		
		return middleStr = Character.toString(ch1);
	}
}
