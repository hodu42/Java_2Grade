package P_4_7;
import java.util.*;

public class SWITCHGradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input score? ");
		int score = sc.nextInt();
		int grade = score / 10;
		
		switch(grade) {
		
			case 9:
				System.out.print("Grade = A");
				break;
			case 8:
				System.out.print("Grade = B");
				break;
			case 7:
				System.out.print("Grade = C");
				break;
			case 6:
				System.out.print("Grade = D");
				break;
			default:
				System.out.print("Grade = F");
		}
	}

}
