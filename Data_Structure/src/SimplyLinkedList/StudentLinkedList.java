package SimplyLinkedList;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class StudentLinkedList {

	public static void main(String[] args) throws IOException {
		SimplyLinkedList sll = new SimplyLinkedList();

		File doc = new File(args[0]);
		Scanner sc = new Scanner(doc);
		Student std = new Student();

		while (sc.hasNextLine()) {
			
			int number = sc.nextInt();
			String name = sc.next();
			String club = sc.nextLine();
			String[] clubArray = null;

			if (club != null) {
				clubArray = club.split("/");
			}

			std.setStudent(number, name);

			for (int i = 0; i < clubArray.length; i++) {
				std.setClub(clubArray[i]);
			}
			
			//sll.add(std);¤±
			
			System.out.println("º¯°æÁ¡");
			

		}

	}

}
