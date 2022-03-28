package P_4_6;
import java.util.*;

public class UpperLowerCaseDistinghuishChanger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input character? ");
		char input = sc.next().charAt(0);
		
		if ((64 < input && input < 91)||(96 < input && input < 123)) 
		{
			if(64<input&&input<91) 
			{
				System.out.printf("%c는 대문자\n",input);
				System.out.printf("%c의 소문자는 %c",input,(char)(input+32));
			}
			else
			{
				System.out.printf("%c는 소문자\n",input);
				System.out.printf("%c의 대문자는 %c",input,(char)(input-32));
			}
		}
		else 
		{
			System.out.printf("%c는 문자가 아님",input);
		}

	}

}
