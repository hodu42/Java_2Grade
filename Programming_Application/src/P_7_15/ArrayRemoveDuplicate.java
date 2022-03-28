package P_7_15;

import java.util.Arrays;

public class ArrayRemoveDuplicate {
	public static void main(String[] args) {
		String[] sa = new String[] { "is", "S8", "S8", "Oreo", "update", "Oreo", "is", "S8" };
		System.out.println("Original = " + Arrays.toString(sa));
		removeDuplicate(sa);
	}

	private static void removeDuplicate(String[] sa) {
		
		boolean [] flag = new boolean [sa.length];
		
		for(boolean element : flag)		{element = false;}
		
		for(int i=0; i< flag.length-1;i++)
		{
			for(int j=i+1; j< flag.length;j++)
			{
				if(sa[i] == sa[j])		flag[j] = true;
			}
		}
		
		int count=0;
		
		for(int i=0; i<flag.length;i++)
		{
			if(flag[i] == false) count++;
		}
		
		String[] newStr = new String [count];
		
		int j=0; int k= 0;
		
		while(j<newStr.length)
		{
			
			if(flag[k] == false)	{newStr[j] = sa[k];	j++; k++;}
			else k++;
		}
		
		System.out.println("Result = "+Arrays.toString(newStr));
	}
}
