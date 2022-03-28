package P_4_5;
import java.util.*;

public class IFVowelConsonantDistinguish 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input character? ");
		char input = sc.next().charAt(0);
		char inputlowercase = Character.toLowerCase(input);
		if (inputlowercase == 'a'||inputlowercase=='e'
				||inputlowercase=='i'||inputlowercase=='o'||inputlowercase=='u') 
		{
			System.out.printf("%s is Vowel", input);
		}
		else {
			System.out.printf("%s is Consonant", input);
		}
	}

}
