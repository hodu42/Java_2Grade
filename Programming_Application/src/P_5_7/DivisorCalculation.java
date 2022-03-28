package P_5_7;

import java.util.*;

public class DivisorCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number? ");
		int input = sc.nextInt();
		if (input >0) {
			System.out.print("Divisor : ");
			for(int i =1;i <= input;i++) {
				if(input%i==0) {
					System.out.print(i+" ");
				}
			}
		}

	}

}
