package InputOutput;

import java.util.Scanner;

public class P_3_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("인원수를 입력하세요 : ");
		int number = sc.nextInt();

		int[] scores = new int[number];

		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d 번째 학생의 국어 성적을 입력하세요 : ", i + 1);
			scores[i] = sc.nextInt();
		}
		
		System.out.printf("최고점은 %d점 입니다\n", getMax(scores));
		System.out.printf("최하점은 %d점 입니다\n", getMin(scores));
		System.out.printf("평균점수는 %.1f점 입니다\n", getAvg(scores));
		System.out.printf("평균보다 높은 인원수는 %d명입니다\n", getAvgHigh(scores));
		System.out.printf("평균보다 낮은 인원수는 %d명입니다\n", getAvgLow(scores));
		printGradeNumber(scores);
		
	}

	public static int getMax(int[] scores) {

		int max = scores[0];

		for (int i = 1; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
			}
		}

		return max;
	}

	public static int getMin(int[] scores) {
		int min = scores[0];

		for (int i = 1; i < scores.length; i++) {
			if (min > scores[i]) {
				min = scores[i];
			}
		}

		return min;
	}

	public static int getSum(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}

	public static double getAvg(int[] scores) {
		return (double) getSum(scores) / (double) scores.length;
	}

	public static int getAvgHigh(int[] scores) {
		double avg = getAvg(scores);
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (avg < scores[i]) {
				count++;
			}
		}
		return count;
	}

	public static int getAvgLow(int[] scores) {
		double avg = getAvg(scores);
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (avg > scores[i]) {
				count++;
			}
		}
		return count;
	}

	public static void printGradeNumber(int[] scores) {

		int[] gradeNumber = new int[10];

		for (int i = 0; i < scores.length; i++) {
			int number = scores[i] / 10;
			switch (scores[i] / 10) {
			case 0:
				gradeNumber[0]++;
				break;
			case 1:
				gradeNumber[1]++;
				break;
			case 2:
				gradeNumber[2]++;
				break;
			case 3:
				gradeNumber[3]++;
				break;
			case 4:
				gradeNumber[4]++;
				break;
			case 5:
				gradeNumber[5]++;
				break;
			case 6:
				gradeNumber[6]++;
				break;
			case 7:
				gradeNumber[7]++;
				break;
			case 8:
				gradeNumber[8]++;
				break;
			case 9, 10:
				gradeNumber[9]++;
				break;
				default: System.out.println("잘못된 성적입력입니다.");
					break;

			}

		}
		
		System.out.println("등급별 인원수는");
		for(int i = 0; i < gradeNumber.length; i++) {
			if(i == 9)  System.out.printf("(%d - %d) : %d명\n", i*10, i*10+10, gradeNumber[i]);
			else System.out.printf("(%d - %d) : %d명\n", i*10, i*10+9, gradeNumber[i]);
		}
	}

}
