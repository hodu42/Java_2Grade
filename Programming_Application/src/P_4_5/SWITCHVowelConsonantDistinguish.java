package P_4_5;
import java.util.*;

public class SWITCHVowelConsonantDistinguish 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input character? ");
		char input = sc.next().charAt(0);
		char inputlowercase = Character.toLowerCase(input);
		
		switch(inputlowercase) 
		{		
			case 'a','e','i','o','u': 
				System.out.printf("%s is Vowel", input);
				break;
		
			default :
				System.out.printf("%s is Consonant", input);
				break;
		}

	}
}