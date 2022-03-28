package P_7_2;

public class SumOfArrayElements 
{

	public static void main(String[] args) 
	{
		int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		
		int sum = 0;
		
		for(int i=0;i<my_array.length;i++)				// for문 사용
		{
			sum += my_array[i];
		}
		
		System.out.printf("The sum is %d\n", sum);
				
		
		
		sum = 0;
		for(int element : my_array)						// for each 사용
		{
			sum += element;
		}
		System.out.printf("The sum is %d", sum);

	}

}
