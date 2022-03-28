package P_5_15;

public class PrintMultiplicaitonTable 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
			{
				System.out.format("%d * %d = %2d ", j, i, j*i);
			}
			System.out.println();
		}

	}

}
