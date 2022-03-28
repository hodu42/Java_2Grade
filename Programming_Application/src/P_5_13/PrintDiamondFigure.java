package P_5_13;
import java.util.*;

public class PrintDiamondFigure 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int input;
		
		do
		{
		System.out.print("Input number ? ");
		input = sc.nextInt();
		}
		while(input<0||input%2==0);
		
		
		
		for (int i=0;i<input/2;i++)
		{
			printDiamondFigure(input, i);
		}
		
		for (int i=input/2;i>=0;i--)
		{
			printDiamondFigure(input, i);
		}
		
		
		
		
	}
	
	private static void printDiamondFigure(int input, int i)
	{
		for (int j=0;j<input/2-i;j++) System.out.print(" ");
		for (int j=0;j<2*i+1;j++)System.out.print("*");
		System.out.println();
	}
}
