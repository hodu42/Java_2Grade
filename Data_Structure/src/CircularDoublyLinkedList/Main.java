package CircularDoublyLinkedList;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		File file = new File(args[0]);
		Scanner scFile = new Scanner(file);
		Scanner scKeyboard = new Scanner(System.in);

		CircularDoublyLinkedList<Student> studentList = new CircularDoublyLinkedList<Student>();

		readFile(studentList, scFile);

		printManual("std.txt");
		
		runProgram(studentList, file, scKeyboard);
		
	}

	
	
	public static void runProgram(CircularDoublyLinkedList<Student> sll, File file, Scanner kbd) throws IOException {
		int menu = 0;
		
		while (menu != 4) {
			System.out.print("원하는 기능을 선택하세요 : ");

			menu = kbd.nextInt();

			if (menu == 1) {
				System.out.print("학번과 이름, 동아리들을 입력하세요 : ");
				addStudent(sll, kbd);
			} else if (menu == 2) {
				System.out.print("학번을 입력하세요 : ");
				int classNumber = kbd.nextInt();
				delete(sll, classNumber);
			} else if (menu == 3) {
				print(sll);
			} else if (menu == 4) {
				save(sll, file);
				System.out.print("종료합니다.");
			} else
				System.out.println("정확하게 입력해 주세요");
		}
	}
	
	public static void printManual(String fileName) {
		System.out.printf("$ java singlyLinkedListApp %s\n", fileName);
		System.out.println("========================================");
		System.out.println("(1) 새 학생 입력");
		System.out.println("(2) 학생 삭제");
		System.out.println("(3) 학번 순으로 전체 출력");
		System.out.println("(4) 파일에 저장하고 종료");
		System.out.println("========================================");
	}
	
	public static void print(CircularDoublyLinkedList<Student> sll) {
		for (int i = 0; i < sll.getSize(); i++) {
			System.out.println(sll.getNode(i).getData().toString());
		}

	}

	public static void save(CircularDoublyLinkedList<Student> sll, File file) throws IOException {

		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);

		for (int i = 0; i < sll.getSize(); i++) {
			bw.write(sll.getNode(i).getData().toString());
			bw.write("\n");
		}
		bw.close();

	}

	public static void addStudent(CircularDoublyLinkedList<Student> sll, Scanner sc) {
		Student std = getStudent(sll, sc);
		addStudentByNumber(sll, std);
	}
	
	public static Student getStudent(CircularDoublyLinkedList<Student> sll, Scanner sc) {
		Student std = new Student();

		int number = sc.nextInt();
		String name = sc.next();

		std.setStudent(number, name);
		
		return std;
	}
	
	public static void readFile(CircularDoublyLinkedList<Student> sll, Scanner sc) {
		while(sc.hasNextLine()) {
			addStudent(sll, sc);
		}
	}
	
	public static void addStudentByNumber(CircularDoublyLinkedList<Student> sll, Student std) {
		if (sll.getSize() == 0) {
			sll.addFirst(std);
		} else if (sll.getSize() == 1) {
			if (std.getNumber() < sll.getNode(0).getData().getNumber()) {
				sll.addFirst(std);
			} else
				sll.addLast(std);
		} else {
			for (int i = 0; i < sll.getSize() - 1; i++) {

				if (sll.getNode(0).getData().getNumber() > std.getNumber()) {
					sll.addFirst(std);

				}

				else if (sll.getNode(i).getData().getNumber() < std.getNumber()
						&& std.getNumber() < sll.getNode(i + 1).getData().getNumber()) {
					sll.addAfter(std, sll.getNode(i));
				}

				else if (sll.getNode(sll.getSize() - 1).getData().getNumber() < std.getNumber()) {
					sll.addLast(std);
				}
			}
		}
	}

	public static void delete(CircularDoublyLinkedList<Student> sll, int number) {
		if (sll.getSize() == 0) {
			System.out.print("지울 내용이 존재하지 않습니다.");
		}
		for (int i = 0; i < sll.getSize(); i++) {
			 if (sll.getNode(0).getData().getNumber() == number) {
				sll.deleteFirst();
			 }
			 else if (sll.getNode(i).getData().getNumber() == number) {
				 sll.deleteAfter(sll.getNode(i-1));
			 }
			 else if(sll.getNode(sll.getSize()-1).getData().getNumber() == number) {
				 sll.deleteLast();
			 }
		}
	}
}
