package P_6_7;
import java.util.*;

public class DecimalDistinction {

	public static boolean isdecimal(int num)
	{
		boolean check = true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				check = false;
			}
		}
		return check;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("정수 입력: ");	int input = sc.nextInt();
			if(input == -1)
			{
				break;
			}
			if(isdecimal(input) == true)
			{
				System.out.printf("정수 %d은 소수입니다.", input);
			}
			else
			{
				System.out.printf("정수 %d은 소수가 아닙니다.", input);
			}
			System.out.println();
		}

	}

}
