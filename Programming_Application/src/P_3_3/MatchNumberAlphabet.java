package P_3_3;

import java.util.*;

public class MatchNumberAlphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int Alphabet = sc.nextInt() + 97; //a가 아스키코드 97이므로 +97함
		System.out.print("알파벳 출력 = "+(char)Alphabet);
	}

}
