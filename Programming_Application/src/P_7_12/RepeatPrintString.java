package P_7_12;

public class RepeatPrintString {
	public static void main(String[] args) {
		System.out.println(sTimes("Hi", 3));
		System.out.println(sTimes("Hello", 2));
		System.out.println(sTimes("My Java", 2));
	}

	private static String sTimes(String string, int i) {
		String sentence="";
		for(int j=0; j<i; j++)		sentence += string;
		return sentence;
	}
}
