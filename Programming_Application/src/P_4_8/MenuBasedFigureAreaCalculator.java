package P_4_8;
import java.util.*;

public class MenuBasedFigureAreaCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("도형 선택 (R: 사각형, T:삼각형, C: 원)? ");
		char figure = sc.next().charAt(0);
		int width,height;
		double area;
		int radius;
		
		switch(figure) {
			
			case 'R':
				System.out.print("너비 및 높이 입력? ");
				width = sc.nextInt(); height = sc.nextInt();
				area = width*height;
				System.out.printf("사각형 크기 = %f", area);
				break;
			case 'T':
				System.out.print("너비 및 높이 입력? ");
				width = sc.nextInt(); height = sc.nextInt();
				area = (double)width*height/2;
				System.out.printf("삼각형 크기 = %f", area);
				break;
			case 'C':
				System.out.print("반지름 입력? ");
				radius = sc.nextInt();
				area = (double)radius*radius*Math.PI;
				System.out.printf("원 크기 = %f", area);
				break;
			default : 
				System.out.println("유효하지 않은 문자입니다.");
		}

	}

}
