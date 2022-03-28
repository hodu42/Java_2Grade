package P_7_22;

public class BinarySearchProgram 
{
	public static void main(String[] args)
	{
		int key = 10;
		int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		if(binarySearch(numbers, key) == -1)   System.out.println(-1);
		else System.out.printf("이 배열에서 %d의 위치(index)값은 %d입니다.", key , binarySearch(numbers, key));
	}
	
	
	
	public static int binarySearch (int[] a, int key)
	{
		int low = 0; int high = a.length-1;	int mid;
		
		while(low <= high)
		{
			mid = (low + high) /2;
			
			if(key == a[mid])	return mid;
			
			else if(key > a[mid]) low = mid+1; 
			
			else	high = mid -1;
		}
		return -1;
	}
}
