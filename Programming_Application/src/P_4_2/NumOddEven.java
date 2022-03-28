package P_4_2;

import java.util.*;

public class NumOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number? ");
		int num = sc.nextInt();
		int Odd_Even = num%2;
		
		if (Odd_Even == 1) {
			System.out.print(num+" is Odd number");
		}
		else {
			System.out.print(num+" is Even number");
		}

	}

}
