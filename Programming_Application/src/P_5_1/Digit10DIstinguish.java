package P_5_1;
import java.util.*;

public class Digit10DIstinguish {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number? ");
		int input = sc.nextInt();
		int nextnum = input; 
				
		while(nextnum!=0) 
		{
			System.out.print(nextnum%10+" ");
			nextnum = nextnum/10;			
		}
	}

}
