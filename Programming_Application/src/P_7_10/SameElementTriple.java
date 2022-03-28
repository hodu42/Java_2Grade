package P_7_10;

public class SameElementTriple {
	public static void main(String[] args) {
		int[] a1 = { 1, 1, 2, 2, 1 };
		int[] a2 = { 1, 1, 2, 2, 2, 1 };
		int[] a3 = { 1, 1, 1, 2, 2, 2, 1 };
		System.out.println(noTriples(a1));
		System.out.println(noTriples(a2));
		System.out.println(noTriples(a3));
	}

	private static boolean noTriples(int[] a1) {
		boolean check = true;
		for(int i=0; i<a1.length-2; i++)		if(a1[i] == a1[i+1] && a1[i+1] == a1[i+2])	return false;
		return check;
	}
}
