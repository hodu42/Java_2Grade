package P_7_5;

import java.util.Arrays;

public class RemoveArrayElement 
{

	public static void main(String[] args) 
	{
		int[] my_array = { 25, 14, 56, 15, 36, 56 };
		System.out.println("                  Original Array : " + Arrays.toString(my_array));
		removeArr(my_array, 1);
		System.out.println("After removing the second element: " 
									+ Arrays.toString(my_array));

		int[] new_array = new int[my_array.length - 1];
		for (int i = 0; i < new_array.length; i++) {
			new_array[i] = my_array[i];
		}
		System.out.println("After removing the second element: " 
								+ Arrays.toString(new_array));
	}
	
	
	static void removeArr(int[] array, int index)
	{
		for(int i=index; i<array.length-1;i++)	{array[i] = array[i+1];}
	}

}
