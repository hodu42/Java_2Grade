package P_4_1;

import java.util.*;

public class Int2NumbersCompare {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number 1 ? ");
		num1 = sc.nextInt();
		System.out.print("Input number 2 ? ");
		num2 = sc.nextInt();
		
		if (num1 > num2) 
		{
			System.out.print(num1+" is bigger than "+num2);
		}
		else if (num1 == num2) 
		{
			System.out.print(num1+" is equal to "+num2);
		}
		else 
		{
			System.out.print(num1+" is less than "+num2);
		}
		

	}

}
