package PolynomialMultiply;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Polynomial pn1 = new Polynomial();
		Polynomial pn2 = new Polynomial();
		
		double coef;	int exp;
		
		
		
		System.out.println("첫번째 다항식을 계수-지수 쌍으로 입력하세요.(지수가 0으로 입력되면 종료)");
		while(true)
		{
			pn1.setPolynomial(coef = sc.nextDouble(), exp = sc.nextInt());
			if(exp ==0)	break;
		}
		

		
		System.out.println("두번째 다항식을 계수-지수 쌍으로 입력하세요.(지수가 0으로 입력되면 종료)");
		while(true)
		{
			pn2.setPolynomial(coef = sc.nextDouble(), exp = sc.nextInt());
			if(exp ==0)	break;
		}
	
		Polynomial multiPoly = pn1.multiplyPoly(pn2);
		
		
	
		multiPoly.printPn();
		
	
		
		
		
		
		//System.out.printf("두 다항식의 곱은 :");
		
		
	}
	
	
	

}
