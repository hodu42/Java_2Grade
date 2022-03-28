package P_5_6;

import java.util.*;

public class MinMaxAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int Min = Integer.MIN_VALUE;
		int Max = Integer.MAX_VALUE;
		int i=0;
		int sum=0;
		double Avg = 0;
		
		while(num>=0) 
		{
			System.out.print("Input Number? ");
			num = sc.nextInt();
			if (num == -1) 		// -1을 입력받으면 입력작업종료 후 결과출력
			{
				break;
			}
			if(i==0) 			//  처음 입력숫자를 최솟값, 최댓값으로 둔다
			{
				Min = num;
				Max = num;
			}
			if (Min > num) 		// 입력받은 숫자가 최솟값보다 작을경우 최솟값을 현재숫자로 변경
			{
				Min = num;
			}
			if (Max < num) 		// 입력받은 숫자가 최댓값보다 클경우 최댓값을 현재숫자로 변경
			{
				Max = num;
			}
			sum = sum + num;
			i++;
		}
		
		Avg = sum / (double)i;
		
		System.out.println("최솟값 : "+Min);
		System.out.println("최댓값 : "+Max);
		System.out.print("평균값 : "+Avg);

	}

}
