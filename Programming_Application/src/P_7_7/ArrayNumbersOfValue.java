package P_7_7;

public class ArrayNumbersOfValue 
{
	public static void main(String[] args) 
	{
		int[] a1 = { 1, 2, -9 };
		int[] a2 = { 1, 9, 9 };
		int[] a3 = { 1, 9, 9, 3, 9 };
		System.out.println(arrayCount9(a1));
		System.out.println(arrayCount9(a2));
		System.out.println(arrayCount9(a3));
	}

	private static int arrayCount9(int[] a1) 
	{
		
		int count = 0;
		for(int i=0; i<a1.length;i++)
		{
			if(a1[i]==9)	count++;
		}
		return count;
	}
}
