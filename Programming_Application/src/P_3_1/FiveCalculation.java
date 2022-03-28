package P_3_1;
import java.util.Scanner;

public class FiveCalculation {

	public static void main(String[] args) {
		int num1;							
		int num2;			
		int sum;
		int subtract;
		int multiply;
		double divide;
		int remainder;		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫 번째 숫자 입력: ");		//첫번쨰 숫자 입력
		num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력: ");		//두번째 숫자 입력
		num2 = sc.nextInt();
		
		if (num2 == 0) {
			System.out.println("나누는 수는 0을 입력할 수 없습니다."); //나누는 수 0일경우
		}
		else {
			sum = num1+num2;				//합		
			subtract = num1 - num2;			//차
			multiply = num1*num2;			//곱
			divide = (double)num1/num2;		//나누기
			remainder = num1%num2;			//나머지
			
			System.out.println(num1+"+"+num2+"="+sum);
			System.out.println(num1+"-"+num2+"="+subtract);
			System.out.println(num1+"*"+num2+"="+multiply);
			System.out.println(num1+"/"+num2+"="+divide);
			System.out.println(num1+"%"+num2+"="+remainder);	//출력
		}
		
		
		
	}

}
