package MergeArray;

import java.util.Scanner;

class MyArrayList 
{	
	private int [] array;
	private int pointer =0;			// �迭���� ���� ��ġ�� �� �� �ִ� ������ ����
	private static int number=1;
	private int Mynum;
	
	MyArrayList()
	{
		array = new int [10];		//ó�� �迭�� ũ��� 10
		Mynum = number++;
	}
	
	MyArrayList(int[] array)
	{
		int[] newArray = new int [array.length];
		
		for(int i=0;i<array.length;i++)		{newArray[i] = array[i];}
		this.array = newArray;
	}

	
	private void add (int num)			//�迭�� ���� �־��ִ� �޼ҵ�
	{
		array[pointer] = num;
		pointer++;
		
		if(pointer>=array.length)		// �޴°����� �迭�� ũ�⺸�� ũ�� �迭�� �÷��ش�
		{
			extendArr();
		}
	}
	
	private int [] getArray()	{ return array;}
	
	private int getPointer()	{return pointer;}
	
	private void extendArr()			// �迭ũ�⸦ ó�� �迭ũ���� 2��� �ø���.
	{
		int [] newArray = new int [2* array.length];
		for (int i=0;i<array.length;i++)
		{
			newArray [i] = array[i];
		}
		array = newArray;
	}

	
	public void read(Scanner sc)		
	{
		System.out.printf("%d��° �迭�� ���� ������������ �Է��ϼ��� : ", Mynum);
		
		String str = sc.nextLine();
		
		sc = new Scanner(str).useDelimiter(" ");
		
		while(sc.hasNextInt())	add(sc.nextInt());
		
		
		if(!isAscending())
		{
			System.out.print("������������ �Էµ����ʾ� �����մϴ�"); 
			System.exit(0);
		}
	}
	
	private boolean isAscending()
	{
		for(int i=0;i<pointer-1;i++)
		{
			if(array[i] > array[i+1])  return false;
		}
		return true;
	}


		
	MyArrayList merge(MyArrayList arraylist)
	{		
			int[] array2 = arraylist.getArray(); //1
			
			int arr1Pointer = pointer-1;		// 1
			int arr2Pointer = arraylist.getPointer()-1; // 1
			
			int[] mergedArray = new int [pointer+arraylist.getPointer()]; // 1
			int mergePointer = mergedArray.length;			// 1
			
			while(mergePointer>0) // n
			{
				mergedArray[--mergePointer] =  (arr2Pointer < 0 || (arr1Pointer >=0 && array[arr1Pointer] >= array2[arr2Pointer])) ? array[arr1Pointer--] : array2[arr2Pointer--];
			} // ��, ���� �ܰ�� ���ϱ�
			
			MyArrayList mergedArrayList = new MyArrayList(mergedArray); // 1
			return mergedArrayList; // 1
	}		
	
	 void print()
	{
		System.out.print("���յ� �迭�� ");
		for(int i=0; i<array.length;i++) System.out.printf("%d ", array[i]);
	}	
}

