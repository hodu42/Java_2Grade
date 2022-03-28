package P_6_5;

import java.util.*;

public class Guess_Number {
	
	public static void Guess_number(int GuessNum, int CorrectNum) 
	{
		if (GuessNum > CorrectNum) 
		{
			System.out.println("내가 선택한 숫자보다 높습니다.");
		}
		else if (GuessNum < CorrectNum) 
		{
			System.out.println("내가 선택한 숫자보다 낮습니다.");
		}
		else 
		{
			System.out.println("내가 선택한 숫자를 정확하게 맞췄습니다.");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("내가 선택한 숫자를 맞추어 보세요 (0-99)");
		int ComNum = (int)(Math.random()*99);
		int GuessNum=0;
		
		while(GuessNum != ComNum) 
		{
			System.out.print("숫자 입력: ");
			GuessNum = sc.nextInt();
			Guess_number(GuessNum, ComNum);
		}

	}

}
