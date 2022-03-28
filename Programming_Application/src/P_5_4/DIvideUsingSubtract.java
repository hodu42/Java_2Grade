package P_5_4;
import java.util.*;

public class DIvideUsingSubtract {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number 1 ? ");
		int num1 = sc.nextInt();
		System.out.print("Input number 2 ? ");
		int num2 = sc.nextInt();
		int result = num1;
		
		while (true) 
		{
				result = result-num2;
				if(result<0) {
					result = result+num2;
					break;
				}
		}
		
		System.out.printf("%d %% %d = %d",num1,num2,result);


	}

}
