package P_4_3;

import java.util.*;

public class OddEvenPositiveNegativeLogicalOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number? ");
		int num = sc.nextInt();
		int Odd_Even = num %2;
		
		if (Odd_Even==0 && num>=0) 
		{
			System.out.print(num+" is Even and Positive number");
		}
		else if (Odd_Even!=0 && num>=0) 
		{
			System.out.print(num+" is Odd and Positive number");
		}
		else if (Odd_Even==0 && num<0) 
		{
			System.out.print(num+" is Even and Negaitive number");
		}
		else 
		{
			System.out.print(num+" is Odd and Negaitive number");
		}
		

	}

}
