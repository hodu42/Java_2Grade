package P_6_8;

import java.util.*;

public class Number_of_Decimal_Sum {
	
	public static void number_of_decimal(int number)
	{
		int num_of_decimal=0;
		int sum=0;
		boolean status; // 소수 판별용 변수
		for (int i=number;i>=2;i--) 
		{
			status =true;
			for (int j=2;j<i;j++) 
			{
				if(i%j==0) 
				{
					status = false;
					break;
				}
			}
			if(status ==true) {
				num_of_decimal++;
				sum =sum+i;
			}
		}
		System.out.print("정수 "+number+"까지 소수는 "+num_of_decimal+"개, 합은 "+sum+"입니다.");
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num =sc.nextInt();
		number_of_decimal(num);
	}

}
