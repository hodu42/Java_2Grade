package MergeArray;

import java.util.Scanner;

public class MergeArray 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		MyArrayList arr1 = new MyArrayList();
		MyArrayList arr2 = new MyArrayList();
		MyArrayList result = new MyArrayList();
		
		arr1.read(sc);
		arr2.read(sc);
		
		result = arr1.merge(arr2);
		
		result.print();
	}

}

