package CircularDoublyLinkedList;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentListController {
	public static void runProgram(CircularDoublyLinkedList<Student> studentList, File file, Scanner kbd) throws IOException {
		int menu = 0;

		while (menu != 6) {
			System.out.print("���ϴ� ����� �����ϼ��� : ");

			menu = kbd.nextInt();

			switch (menu) {
			case 1:
				System.out.print("�й��� �̸��� �Է��ϼ��� : ");
				addStudent(kbd, studentList);
				break;
			case 2:		
				delete(studentList, kbd);
				break;
			case 3:
				printAscending(studentList);
				break;
			case 4:
				printDescending(studentList);
				break;
			case 5:
				printFrom(studentList, kbd);
				break;
			case 6:
				save(studentList, file);
				System.out.println("�����մϴ�.");
				break;
			}
		}
	}
	
	public static void addStudent(Scanner sc, CircularDoublyLinkedList<Student> studentList) {
		int number = sc.nextInt();	String name = sc.next();
		Student newStudent = new Student();
		newStudent.setStudent(number, name);
		studentList.add(newStudent);
	}
	
	public static void fileRead(Scanner scFile, CircularDoublyLinkedList<Student> studentList) {
		while(scFile.hasNextLine()) {
			addStudent(scFile, studentList);
		}
	}

	public static void printManual(String fileName) {
		System.out.printf("$ java singlyLinkedListApp %s\n", fileName);
		System.out.println("========================================");
		System.out.println("(1) �� �л� �Է�");
		System.out.println("(2) �л� ����");
		System.out.println("(3) �й� ������ ��ü ���");
		System.out.println("(4) �й� �������� ��ü ���");
		System.out.println("(5) Ư�� �й����� ��ü ���");
		System.out.println("(6) ���Ͽ� �����ϰ� ����");
		System.out.println("========================================");
	}
	
	public static void delete(CircularDoublyLinkedList<Student> studentList, Scanner sc) {
		System.out.print("�й��� �Է��ϼ��� : ");
		int number = sc.nextInt();
		Student newStudent = new Student();
		newStudent.setStudent(number, "");
		studentList.delete(newStudent);
	}
	
	public static void printAscending(CircularDoublyLinkedList<Student> studentList) {
		for(int i = 0; i < studentList.getSize(); i++) {
			System.out.println(studentList.getNode(i).getData().toString());
		}
	}
	
	public static void printDescending(CircularDoublyLinkedList<Student> studentList) {
		for(int i = studentList.getSize()-1; i >= 0; i--) {
			System.out.println(studentList.getNode(i).getData().toString());
		}
	}
	
	public static void printFrom(CircularDoublyLinkedList<Student> studentList, Scanner sc) {
		System.out.print("�й��� �Է��ϼ��� : ");
		int number = sc.nextInt();
		Student newStudent = new Student();
		newStudent.setStudent(number, "");
		
		int j = 0;
		for(; j < studentList.getSize(); j++) {
			if(studentList.getNode(j).getData().compareTo(newStudent) == 0) {
				break;
			}
		}

		for(int i = 0; i < studentList.getSize(); i++) {
			if(studentList.getNode(j+i).getData() != null) {
				System.out.println(studentList.getNode(j+i).getData().toString());
			}
			else {
				j++;
				System.out.println(studentList.getNode(j+i).getData().toString());
			}
			
		}
	}
	
	public static void save(CircularDoublyLinkedList<Student> studentList, File file) throws IOException{
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		int i = 0;
		for (; i < studentList.getSize()-1; i++) {
			bw.write(studentList.getNode(i).getData().toString());
			bw.write("\n");
		}
		bw.write(studentList.getNode(i).getData().toString());
		bw.close();
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
}
