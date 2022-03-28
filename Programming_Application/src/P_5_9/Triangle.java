package P_5_9;

import java.util.*;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number? ");
		int num = sc.nextInt();
		
		for (int i=num;i>=0;i--) {
			for (int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
