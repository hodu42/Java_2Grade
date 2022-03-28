package P_7_19;

public class DeleteBack0 {
	public static void main(String[] args) {
		String str = "0012340000";
		System.out.println("String    = " + str);
		str = removeTrailZ(str);
		System.out.println("Converted = " + str);
	}

	private static String removeTrailZ(String str) {
		StringBuffer sb = new StringBuffer(str);
		
		for(int i=str.length()-1; i>0; i--)
		{
			if(str.charAt(i) == '0')	sb.deleteCharAt(sb.length()-1);
			else	break;
		}
		return sb.toString();
		
	}
}
