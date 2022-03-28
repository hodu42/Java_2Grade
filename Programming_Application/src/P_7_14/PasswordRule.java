package P_7_14;

import java.util.Scanner;

public class PasswordRule {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("1. 8글자 이상입니다.\n" 
				+ "2. 영문자와 숫자만 사용 가능합니다. \n" 
				+ "3. 숫자는 2개 이상이어야 합니다.\n"
				+ "위의 패스워드 규칙에 따라 원하는 패스워드를 입력하시오: ");
		String s = input.nextLine();
		if (is_Valid_Password(s)) {
			System.out.println("적절한 패스워드입니다: " + s);
		} else {
			System.out.println("패스워드 규칙에 어긋납니다: " + s);
		}
	}

	private static boolean is_Valid_Password(String s) {
		
		int count=0;			boolean check = false;
		
		if(s.length()>=8)
		{
			for(int i=0; i<s.length(); i++)
			{
				if(s.charAt(i) >= '0' && s.charAt(i) <= '9') 	{count++;}
				
				else if(Character.toUpperCase(s.charAt(i)) >= 'A' && Character.toUpperCase(s.charAt(i)) <= 'Z') {check = true;}
				
				else check = false;
			}
			
			if(check ==true && count >= 2)		{return true;}
			
			else return false;
		}
		
		return false;
	}
}
