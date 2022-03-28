package P_3_5;

import java.util.*;

public class HMinSecChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시간 입력(초) : ");
		int Input_Sec = sc.nextInt();
		int H = Input_Sec/3600;			//시간은 초를 60으로 나누고 또 60으로 나눔
		int M = Input_Sec%3600/60;		//분은 시간을 구하고 나머지를 60으로 나눔
		int S = Input_Sec%60;			//초는 60으로 나눈 나머지
		
		System.out.print("입력된 시간: "+H+"시 "+M+"분 "+S+"초");

	}

}
