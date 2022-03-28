package P_3_6;
import java.util.*;

public class CircleAreaRound 
{

	public static void main(String[] args) 
	{
		System.out.print("원의 반지름 입력 : ");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		double area = Math.pow(radius, 2) * 3.14;
		double round = 2*radius * 3.14;
		
		System.out.printf("면적: %f 둘레: %f\n", area, round);
	}

}
