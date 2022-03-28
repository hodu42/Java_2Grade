package P_3_7;
import java.util.*;
import java.io.*;

public class StringOutput {
	public static void main(String[] args) {
		String str1=null, str2=null;
		
		try {
		File file = new File("C:\\Users\\김민준\\eclipse-workspace"
				 +"\\Programming_Application\\src\\P_3_7\\data.txt");
		Scanner sc = new Scanner(file);
		str1 = sc.nextLine(); 		// 파일에서 한줄 읽음
		System.out.print("문자열 입력: ");
		sc = new Scanner(System.in); 		// 키보드로 입력 받음
		str2 = sc.nextLine();
		}
		catch (FileNotFoundException e){
			
		}
		String result = str2+str1;
		System.out.printf("%s", result);
	}
}
