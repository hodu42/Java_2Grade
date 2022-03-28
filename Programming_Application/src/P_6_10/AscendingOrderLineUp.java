package P_6_10;
import java.util.*;

public class AscendingOrderLineUp {

	public static void ascend(int[] array)
	{
		int chg=0;
		for(int j=0;j<array.length;j++)
		{
			for(int i =0; i< array.length-1;i++)
			{
				if(array[i]>array[i+1])
				{
					chg = array[i];
					array[i] = array[i+1];
					array[i+1] = chg;
				}
			}
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
		
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("정렬할 데이터 개수(최대 10개): ");		int input = sc.nextInt();
		if(input <=10)
		{
			int[] arr = new int [input];
			for(int i=0;i<input;i++)
			{
				arr[i] = sc.nextInt();
			}
			System.out.println("오름차순 정렬 결과");
			ascend(arr);
		}
		
	}

}
