package P_7_21;

import java.util.Scanner;

public class PrintBarcode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input 5 digits number > ");
		String num = sc.nextLine();
		barcodeGen(num);
		sc.close();
	}

	private static void barcodeGen(String num) {
		
		int [] numbers = getNumbers(num);
		
		boolean rules[][] = {	{false, false, false, true, true},
								{false, false, true, false, true},
								{false, false, true, true, false},
								{false, true, false, false, true},
								{false, true, false, true, false},
								{false, true, true, false, false},
								{true, false, false, false, true},
								{true, false, false, true, false},
								{true, false, true, false, false},
								{true, true, false, false, false}	};
		
		for(int k =0; k<2; k++)
		{
			for(int i=0; i<numbers.length; i++)
			{
				for(int j=0; j <rules[i].length;j++)
				{
					if(rules[numbers[i]-1][j]== true) System.out.print("|");
					else System.out.print(" ");
				}
			}
			System.out.println();
			
			
		}
		
		for(int i=0; i<2;i++)
		{
			for(int j = 0; j<30; j++)
			{
				System.out.print("|");
			}
			System.out.println();
		}	
	}
	
	
	
	private static int getCheckDigit(String num)		//6번째 바코드 숫자
	{
		int checkDigit=0;
		
		for(int i=0;i<num.length();i++)
		{
			checkDigit += num.charAt(i);
		}
		
		checkDigit = checkDigit % 10;
		return checkDigit;
	}
	
	private static int [] getNumbers(String num)		//6개 숫자 배열
	{
		int [] numbers = new int [6];
		
		for(int i =0; i<num.length();i++)
		{
			numbers[i] = num.charAt(i) - '0';
		}
		numbers[5] = getCheckDigit(num);
		
		return numbers;
	}
	
	
	
}
