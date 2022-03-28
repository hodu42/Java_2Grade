package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Pr_fileCopy {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try (FileInputStream in = new FileInputStream(new File(args[0]));
				FileOutputStream out = new FileOutputStream(new File(args[1]))) {
			int c;
			while ((c = in.read()) != -1)
				out.write(c);
		}

	}
}
