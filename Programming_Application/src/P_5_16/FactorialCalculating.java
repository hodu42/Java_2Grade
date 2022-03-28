package P_5_16;
import java.util.*;

public class FactorialCalculating {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number? ");
		int input = sc.nextInt();
		int sum =1;
		
		for(int i=input;i>1;i--)
		{
			sum = sum*i;
		}
		
		System.out.printf("%d! = ", input);
		for (int i=input;i>1;i--)
		{
			System.out.printf("%d * ", i);
		}
		System.out.printf("1 = %d", sum);
	}

}
