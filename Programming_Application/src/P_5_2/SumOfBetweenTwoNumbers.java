package P_5_2;
import java.util.*;

public class SumOfBetweenTwoNumbers {

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
			for (int i =num2;i <=num1;i++) 
			{
				sum = sum+i;
			}
		}
		else {
			for (int i =num1;i <=num2;i++) 
			{
				sum = sum+i;
			}
		}
		System.out.printf("작은 수부터 큰 수까지의 합 : %d", sum);

	}

}
