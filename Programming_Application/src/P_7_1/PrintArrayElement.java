package P_7_1;

public class PrintArrayElement 
{

	public static void main(String[] args) 
	{
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		
		
		for(int i=0;i<vowels.length;i++)		// for 사용
		{
			System.out.printf("%c ", vowels[i]);
		}
		
		System.out.println();
		
		
		for(char vowel : vowels)			// for each 사용
		{
			System.out.printf("%c ", vowel);
		}		
	}

}
