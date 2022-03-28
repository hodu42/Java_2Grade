package MyWonder;

public class AboutDeleteCharAt {

	public static void main(String[] args) {
		String str = "00111122233344";
		StringBuffer sb = new StringBuffer(str);
		
		for(int i=0; i<2;i++) {sb.deleteCharAt(i);}
		System.out.println(sb);

	}

}
