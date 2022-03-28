package P_4_7;
import java.util.*;

public class IFGradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input score? ");
		int score = sc.nextInt();
		int grade = score / 10;
		
		if (0<=score&&score<=100) {		
			if (grade == 9) 
			{
				System.out.print("Grade = A");
			}
			else if (grade == 8) 
			{
				System.out.print("Grade = B");
			}
			else if (grade == 7) 
			{
				System.out.print("Grade = C");
			}
			else if (grade == 6) 
			{
				System.out.print("Grade = D");
			}
			else 
			{
				System.out.print("Grade = F");
			}
		}
		else {
			System.out.println("점수 범위가 올바르지 않습니다.");
		}
	}

}
