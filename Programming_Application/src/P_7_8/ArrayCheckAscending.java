package P_7_8;

public class ArrayCheckAscending {
	public static void main(String[] args) {
		int[] a1 = { 1, 1, 2, 3, 1 };
		int[] a2 = { 1, 1, 2, 4, 1 };
		int[] a3 = { 1, 1, 2, 1, 2, 3 };
		System.out.println(array123(a1));
		System.out.println(array123(a2));
		System.out.println(array123(a3));
	}

	private static boolean array123(int[] a1) {
		boolean check = true;
		
		for(int i=0; i<a1.length-1;i++)
		{
			if(a1[i] > a1[i+1])		return false;
		}
		return check;
	}
}
