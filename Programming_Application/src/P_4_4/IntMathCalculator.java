package P_4_4;
import java.util.*;

public class IntMathCalculator {

	public static void main(String[] args) {
		int num1,num2;
		char operator;
		int result1;
		double result2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input equation? ");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		num1 = Integer.parseInt(st.nextToken());
		operator = st.nextToken().charAt(0);
		num2 = Integer.parseInt(st.nextToken());
		
		if (operator == '+') 
		{
			result1 = num1+num2;
			System.out.print(num1+"+"+num2+"="+result1);
		}
		else if (operator == '-') 
		{
			result1 = num1-num2;
			System.out.print(num1+"-"+num2+"="+result1);
		}
		else if (operator == '*') 
		{
			result1 = num1*num2;
			System.out.print(num1+"*"+num2+"="+result1);
		}
		else 
		{
			result2 = (double)num1/num2;
			System.out.print(num1+"/"+num2+"="+result2);
		}

	}

}
