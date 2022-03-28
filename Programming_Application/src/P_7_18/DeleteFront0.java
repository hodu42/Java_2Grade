package P_7_18;

public class DeleteFront0 {
	public static void main(String[] args) {
		String str = "00100234000";
		System.out.println("String    = " + str);
		str = removeFrontZ(str);
		System.out.println("Converted = " + str);
	}

	private static String removeFrontZ(String str) {
		StringBuffer sb = new StringBuffer(str);
		
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i) == '0')	sb.deleteCharAt(0);
			else	break;
		}
		return sb.toString();
	}
}
