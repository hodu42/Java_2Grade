package P_5_12;
import java.util.*;

public class PrintBorderOfRectangle 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size=0;
		while(true)
		{
			System.out.print("Input Shape Size : ");
			size = sc.nextInt();
			if(size==-1)
			{
				break;
			}
			for (int i=1;i<=size;i++)
			{
				if(i==1||i==size) 
				{
					for(int j=0;j<size;j++)
					{
						System.out.print("*");
					}
				}
				else
				{
					System.out.print("*");
					for(int k=0;k<size-2;k++)
					{
						System.out.print(" ");
					}
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
