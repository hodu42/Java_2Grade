package P_5_5;
import java.util.*;

public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1=0;
		double num2=0;
		char operator;
		double result=0;
		String check = "Yes";
		
		while(true) {
			System.out.print("Input Equation (num1 op num2)? ");
			num1 = sc.nextInt(); operator = sc.next().charAt(0); num2 = sc.nextInt();
			
			switch(operator) {
			
				case '+': 
					result = num1+num2;
					System.out.printf("%.1f + %.1f = %.1f\n", num1, num2, result);
					break;
				case '-':
					result = num1-num2;
					System.out.printf("%.1f - %.1f = %.1f\n", num1, num2, result);
					break;
				case '*':
					result =  num1*num2;
					System.out.printf("%.1f * %.1f = %.1f\n", num1, num2, result);
					break;
				case '/':
					result = (double)num1/num2;
					System.out.printf("%.1f / %.1f = %f\n", num1, num2, result);
					break;
			}
			System.out.println("반복 수행? (Yes / No)");
			check = sc.next();
			if (check.equalsIgnoreCase("No")) {
				break;
			}
		}
			
		

	}

}
