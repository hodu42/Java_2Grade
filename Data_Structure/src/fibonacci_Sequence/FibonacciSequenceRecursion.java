package fibonacci_Sequence;
import java.util.Scanner;

public class FibonacciSequenceRecursion 
{
	 static int recursive(int N)
	 {
		 if(N==1) return 0;
		 if(N==2) return 1;
		 else return recursive(N-1) + recursive(N-2);
	 }

	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.print(recursive(input));

	}

}
