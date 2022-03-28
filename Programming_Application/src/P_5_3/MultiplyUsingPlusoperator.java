package P_5_3;

import java.util.*;

public class MultiplyUsingPlusoperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number 1 ? ");
		int num1 = sc.nextInt();
		System.out.print("Input number 2 ? ");
		int num2 = sc.nextInt();
		int sum=0;
		
		for (int i=0;i <num2;i++) 
		{
			sum = sum + num1;
		}
		System.out.print(num1+" * "+num2+" = "+sum);
	}

}
