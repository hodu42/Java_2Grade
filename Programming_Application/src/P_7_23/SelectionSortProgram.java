package P_7_23;

import java.util.Arrays;

public class SelectionSortProgram {

	public static void main(String[] args) {
		int [] numbers = {9, 4, 7, 2, 5};
		
		selectionSort(numbers);
	}
	
	
	
	
	public static void selectionSort(int[] a)
	{
		int [] sorted = new int [a.length];
		
		int chg;
		
		for(int i=0; i<sorted.length; i++)
		{	
			int minIndex = getMinIndex(a);
				
			sorted[i] = a[minIndex];
			chg = a[minIndex];
			a[minIndex] = a[0];
			a[0] = chg;
			
			a = deepDuplicate(a);		
		}	
		
		System.out.print(Arrays.toString(sorted));
		
	}
	
	
	private static int getMinIndex(int[] a)
	{
		int min=a[0];	int minIndex =0;
		
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i] < a[i+1] && min >= a[i])			{min = a[i]; minIndex = i;}
			else if(a[i] > a[i+1] && min >= a[i+1]) 	{min = a[i+1]; minIndex = i+1;}
		}
		
		return minIndex;
	}
	
	
	private static int[] deepDuplicate(int[] a)
	{
		int[] duplicate = new int [a.length-1];
		
		for(int i=0; i< a.length-1;i++)
		{
			duplicate[i] = a[i+1];
		}
		
		return duplicate;
		
	}

}
