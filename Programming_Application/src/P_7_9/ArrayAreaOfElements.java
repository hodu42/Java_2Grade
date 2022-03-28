package P_7_9;

public class ArrayAreaOfElements {
	public static void main(String args[]) {
		int[] a1 = { 8, 3, 5, 7, 2, 4 };
		int[] a2 = { 14, 1, 22, 17, 36, 7, -43, 5 };
		System.out.println(countIn(a1, 9, 1));
		System.out.println(countIn(a2, 4, 17));
	}

	private static int countIn(int[] a1, int i, int j) {
		int count=0;
		if(i > j)  return -1;
		for(int k=0; k<a1.length; k++)
		{
			if(a1[k] >= i && a1[k] <= j)	count++;
		}
		
		return count;
	}
}
