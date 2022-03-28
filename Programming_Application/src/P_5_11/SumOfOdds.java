package P_5_11;
import java.util.*;

public class SumOfOdds
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number 1 ? ");
		int num1 = sc.nextInt();
		System.out.print("Input number 2 ? ");
		int num2 = sc.nextInt();
		int sum=0;
		
		if (num1 > num2) 
		{
			System.out.print("Odd Number : ");
			for (int i=num2;i<=num1;i++) {
				if(i%2==1) {
					sum = sum + i;
					System.out.print(i+" ");
					
				}
			}
			System.out.println();
		}
		else if (num1 < num2) 
		{
			System.out.print("Odd Number : ");
			for (int i=num1;i<=num2;i++) {
				if(i%2==1) {
					sum = sum + i;
					System.out.print(i+" ");
				}		
			}
			System.out.println();

		}
		System.out.print("Odd Sum from min odd to max odd : "+sum);

	}
}
		
