package PolynomialMultiply;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Polynomial pn1 = new Polynomial();
		Polynomial pn2 = new Polynomial();
		
		double coef;	int exp;
		
		
		
		System.out.println("ù��° ���׽��� ���-���� ������ �Է��ϼ���.(������ 0���� �ԷµǸ� ����)");
		while(true)
		{
			pn1.setPolynomial(coef = sc.nextDouble(), exp = sc.nextInt());
			if(exp ==0)	break;
		}
		

		
		System.out.println("�ι�° ���׽��� ���-���� ������ �Է��ϼ���.(������ 0���� �ԷµǸ� ����)");
		while(true)
		{
			pn2.setPolynomial(coef = sc.nextDouble(), exp = sc.nextInt());
			if(exp ==0)	break;
		}
	
		Polynomial multiPoly = pn1.multiplyPoly(pn2);
		
		
	
		multiPoly.printPn();
		
	
		
		
		
		
		//System.out.printf("�� ���׽��� ���� :");
		
		
	}
	
	
	

}
