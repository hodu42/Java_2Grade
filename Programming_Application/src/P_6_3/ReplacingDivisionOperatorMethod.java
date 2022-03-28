package P_6_3;
import java.util.Scanner;

public class ReplacingDivisionOperatorMethod 
{
	public static int division(int num1,int num2)
	{
		int count=0;
		while(num1-num2 >=0)
		{
			num1 -=num2;
			count++;
		}
		return count;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수 입력: ");		int num1 = sc.nextInt(); int num2 = sc.nextInt();
		System.out.printf("나눗셈 결과 값: %d", division(num1,num2));
	}
	
	

}
