package P_5_14;
import java.util.*;

public class Print3_5multiply 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number 1 ? ");
		int num1 = sc.nextInt();
		System.out.print("Input number 2 ? ");
		int num2 = sc.nextInt();
		boolean multiply3_5 = false;
			
			for(int i=num1;i<=num2;i++)
			{
				if(i%3==0)
				{
					multiply3_5 = true;
				}
				if(i%5==0)
				{
					multiply3_5 = true;
				}
				if(multiply3_5==true)
				{
					System.out.println(i);
				}
				multiply3_5 = false;
			}

	}

}
