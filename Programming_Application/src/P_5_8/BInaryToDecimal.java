package P_5_8;
import java.util.*;

public class BInaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Binary number? ");
		int input = sc.nextInt();
		int sum=0;
		int length = (int)(Math.log10(input))+1;
		
		int nextnum = input; 
		
		for (int i=0;i < length;i++) 
		{
			sum = (int)(sum + (nextnum%10)*Math.pow(2,i));
			nextnum = nextnum/10;
		}
		System.out.printf("Decimal Number : %d", sum);
	}

}
