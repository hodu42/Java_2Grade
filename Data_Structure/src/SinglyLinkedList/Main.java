package SinglyLinkedList;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		File file = new File(args[0]);
		Scanner scFile = new Scanner(file);
		Scanner scKeyboard = new Scanner(System.in);
		
		SinglyLinkedList<Student> studentList = new SinglyLinkedList<Student>();

		StudentListController.readFile(studentList, scFile);

		StudentListController.printManual("std.txt");
		
		StudentListController.runProgram(studentList, file, scKeyboard);
		
	}
}
