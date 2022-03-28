package P_6_9;
import java.util.*;

public class FibonacciSequence {

	public static void fibonacci(int num)
	{
		int pprev = 0;	int prev = 1;	int cur;
		System.out.printf("%d %d ", pprev, prev);
		for(int i=2;i<num;i++)
		{
			cur = pprev + prev;
			pprev = prev;
			prev = cur;
			System.out.printf("%d ", cur);			
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");	int input = sc.nextInt();
		fibonacci(input);
	}

}
