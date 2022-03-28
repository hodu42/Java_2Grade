package P_7_24;

import java.util.Arrays;

public class InsertionSortProgram 
{

	public static void main(String[] args) 
	{
		int[] numbers = {6, 5, 3, 1, 8, 7, 2, 4};
		insertionSort(numbers);

	}
	
	
	
	public static void insertionSort(int[] a)
	{
		int chg;
		
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i; j>=0;j--)
			{
				if(a[j] > a[j+1])		//바꾸는거
				{
					chg = a[j+1];
					a[j+1] = a[j];
					a[j] =chg;			
				}
			}	
		}	
		System.out.print(Arrays.toString(a));	
	}

}
