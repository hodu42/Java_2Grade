package P_6_4;
import java.util.*;

public class CalculatingDistanceBetweenTwoCoordinate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 좌표(X, Y) 입력: ");
		int x1 = sc.nextInt();		int y1 = sc.nextInt();
		System.out.print("두 번째 좌표(X, Y) 입력: ");
		int x2 = sc.nextInt();		int y2 = sc.nextInt();
		
		double distance = Math.sqrt((Math.pow(x1-x2, 2))+Math.pow(y1-y2, 2));
		System.out.print("두 좌표 거리: "+distance);
	}

}
