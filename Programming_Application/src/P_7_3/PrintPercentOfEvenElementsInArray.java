package P_7_3;

public class PrintPercentOfEvenElementsInArray {

	public static void main(String[] args) {
		int[] a1 = {2, 15, 150, 11, 27};
		int[] a2 = {8, 11, 34, 20};
		System.out.println(percent(a1) + "%");
		System.out.println(percent(a2) + "%");

	}
	
	
	static float percent(int [] array)
	{
		int Even = 0;
		for(int number : array)
		{
			if(number%2==0)	Even++;	
		}
		
		return (float)Even / (float)array.length * 100;
	}

}
