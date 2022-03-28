package P_7_16;

public class StringCountWords {
	public static void main(String[] args) {
		String str = "Hello this is Java World";
		System.out.println("String is : " + str);
		count(str);
	}

	private static void count(String str) {
		String [] words = str.split(" ");
		for(int i=0; i< words.length; i++)
		{
			System.out.printf("%d : %s : %d\n", i+1, words[i], words[i].length());
		}
		
	}
}
