package P_6_2;

import java.util.*;

public class FactorialCalculation {
	
	public static int Factorial(int number) 
	{
		int sum=1;
		for (int i =number;i>1;i--) 
		{
			sum = sum*i;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		System.out.print("Factorial 결과 값: "+Factorial(num));
	}

}
