package P_3_4;

import java.util.*;

public class BMICalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게 입력(Kg) : ");
		double Weight = sc.nextDouble();
		System.out.print("키 입력(cm) : ");
		double Height = sc.nextDouble();
		double BMI = (Height - 110) / Weight;
		
		System.out.printf("몸무게: %.1f, 키: %.1f --> 비만도: %.3f", Weight, Height, BMI);
		// 소수점 세번쨰 자리까지 출력이니 Math.round사용
		
	}
}
