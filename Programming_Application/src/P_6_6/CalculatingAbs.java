package P_6_6;
import java.util.*;

public class CalculatingAbs 
{

	public static int abs(int num)
	{
		if(num < 0)
		{
			num = num*-1;
		}
		return num;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");		int input = sc.nextInt();
		System.out.printf("숫자 %d의 절대값은 %d입니다.",input,abs(input));
		

	}

}
