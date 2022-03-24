package fibonacci_Sequence;
import java.util.Scanner;

public class FibonacciSequenceFor 
{

	static int getFibonacci(int N)
	{	
		int pprev = 0;	int prev = 1;	int cur = 0;
		if(N==1) cur = 0;	
		if(N==2) cur = 1;
		if (N>2)
		{
			for (int i=2;i<N;i++)
			{
				cur = pprev + prev;
				pprev = prev;
				prev = cur;
			}
		}
		return cur;
		
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.print(getFibonacci(input));
	}

}
