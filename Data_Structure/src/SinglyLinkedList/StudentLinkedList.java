package SinglyLinkedList;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class StudentLinkedList {

	public static void main(String[] args) throws IOException {

		SimplyLinkedList sll = new SimplyLinkedList();

		File doc = new File(args[0]);
		Scanner sc = new Scanner(doc);
		

		while (sc.hasNextLine()) {
			Student std = new Student();
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

			if (sll.getSize() == 0) {

				sll.addFirst(std);

			} else if (sll.getSize() == 1) {

				if (sll. > std.getNumber()) {
					
				}

			}

		}

	}

}
