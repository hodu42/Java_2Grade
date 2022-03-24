package MergeArray;

import java.util.Scanner;

class MyArrayList 
{	
	private int [] array;
	private int pointer =0;			// 배열에서 현재 위치를 알 수 있는 포인터 선언
	private static int number=1;
	private int Mynum;
	
	MyArrayList()
	{
		array = new int [10];		//처음 배열의 크기는 10
		Mynum = number++;
	}
	
	MyArrayList(int[] array)
	{
		int[] newArray = new int [array.length];
		
		for(int i=0;i<array.length;i++)		{newArray[i] = array[i];}
		this.array = newArray;
	}

	
	private void add (int num)			//배열에 값을 넣어주는 메소드
	{
		array[pointer] = num;
		pointer++;
		
		if(pointer>=array.length)		// 받는값들이 배열의 크기보다 크면 배열을 늘려준다
		{
			extendArr();
		}
	}
	
	private int [] getArray()	{ return array;}
	
	private int getPointer()	{return pointer;}
	
	private void extendArr()			// 배열크기를 처음 배열크기의 2배로 늘린다.
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
		System.out.printf("%d번째 배열을 정수 오름차순으로 입력하세요 : ", Mynum);
		
		String str = sc.nextLine();
		
		sc = new Scanner(str).useDelimiter(" ");
		
		while(sc.hasNextInt())	add(sc.nextInt());
		
		
		if(!isAscending())
		{
			System.out.print("오름차순으로 입력되지않아 종료합니다"); 
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
			} // 참, 거짓 단계수 구하기
			
			MyArrayList mergedArrayList = new MyArrayList(mergedArray); // 1
			return mergedArrayList; // 1
	}		
	
	 void print()
	{
		System.out.print("병합된 배열은 ");
		for(int i=0; i<array.length;i++) System.out.printf("%d ", array[i]);
	}	
}

