package P_7_4;
import java.util.Scanner;

public class PrintElemetViceversa 
{

	public static void main(String[] args) 
	{
		int counter, i;
		int number[] = new int[100];
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many integer elements(max 100)?");
		counter = scanner.nextInt();
		
		for(i=0; i < counter; i++)
		{
			System.out.print("Enter Array Element" + (i + 1) + ": ");
			number[i] = scanner.nextInt();
		}
		
		number=reverse(number, counter);
		
		System.out.print("Reversed array: ");
		for(i = 0; i < counter; i++)
		{
			System.out.print(number[i] + " ");
		}
		scanner.close();
	}
	
	
	
	static int[] reverse(int[] number, int counter)
	{
		int[] reversedNumber = new int[counter];
		for(int i=0; i<counter; i++)
		{
			reversedNumber[i] = number[counter-1-i];
		}
		return reversedNumber;
	}

}
