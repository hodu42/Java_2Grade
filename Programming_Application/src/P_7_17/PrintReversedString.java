package P_7_17;

public class PrintReversedString {
	public static void main(String[] args) {
		String str = "Hello Java World!";
		System.out.println("String          = " + str);
		System.out.println("Reversed String = " + reverse(str));
	}

	private static String reverse(String str) {
		
		String [] array = str.split(" ");
		String newstr ="";
		
		for(int i=0; i<array.length;i++)
		{
			for(int j=array[i].length()-1; j>=0; j--)
			{
				newstr += array[i].charAt(j);
			}
			array[i] = newstr;
			newstr = "";
		}
		
		String reversed = "";
		for(int i=0; i < array.length;i++)
		{
			 reversed += array[i] + " ";
			 
		}
		return reversed;
	}
}
