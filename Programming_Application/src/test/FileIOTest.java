package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;

public class FileIOTest {

	public static void main(String[] args) throws IOException {
		File file = new File("std.txt");
		
		FileWriter fw = new FileWriter("std.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			bw.write(sc.next());
		}
		

	}

}
