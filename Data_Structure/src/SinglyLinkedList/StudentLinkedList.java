package SinglyLinkedList;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StudentLinkedList {

	public static void main(String[] args) throws IOException {

		SinglyLinkedList<Student> sll = new SinglyLinkedList<Student>();
		
		//Scanner sc = new Scanner(new File(args[0]));
		Scanner sc = new Scanner(System.in);
		System.out.print("학번과 이름, 동아리들을 입력하세요 : ");

		for(int k=0; k< 3; k++) {

			Student std = new Student();
			int number = sc.nextInt();
			String name = sc.next();
			String club = sc.nextLine();
			String[] clubArray = null;

			if (club != null) {
				clubArray = club.split("/");
				for (int i = 0; i < clubArray.length; i++) {
					try {
						std.setClub(clubArray[i]);
					}
					catch (Exception e){}
					
				}
			}
			
			std.setStudent(number, name);

			

			if (sll.getSize() == 0) {

				sll.addFirst(std);

			} else if (sll.getSize() == 1) {

				if (sll.getNode(0).getData().getNumber() > std.getNumber()) {
					sll.addFirst(std);
				} else
					sll.addLast(std);

			}

			else {
				for (int i = 0; i < sll.getSize() - 1; i++) {
					if (sll.getNode(i).getData().getNumber() > std.getNumber()) {
						sll.addFirst(std);
						break;
					} else if (sll.getNode(i).getData().getNumber() < std.getNumber()
							&& std.getNumber() < sll.getNode(i + 1).getData().getNumber()) {
						sll.addAfter(std, sll.getNode(i));
						break;
					}
				}
			}

		}
		
		
		FileWriter fw = new FileWriter(args[0]);
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		for (int i = 0; i < sll.getSize(); i++) {
			
			bw.write(sll.getNode(i).getData().getNumber()+ " ");
			bw.write(sll.getNode(i).getData().getName()+ " ");
			
			if(sll.getNode(i).getData().getClub().getSize() != 0)
			{
				for(int j = 0; j < sll.getNode(i).getData().getClub().getSize(); j++) {
					bw.write(sll.getNode(i).getData().getClubName(j) + "/");
				}
			}
			bw.write("\n");
		}
		bw.close();
		
		
		
		
		

	}

}
