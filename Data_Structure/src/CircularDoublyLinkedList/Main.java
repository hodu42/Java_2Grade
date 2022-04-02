package CircularDoublyLinkedList;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		File file = new File(args[0]);
		Scanner scFile = new Scanner(file);
		Scanner scKeyboard = new Scanner(System.in);

		CircularDoublyLinkedList<Student> studentList = new CircularDoublyLinkedList<Student>();
		
		StudentListController.fileRead(scFile, studentList);

		StudentListController.printManual("std.txt");

		StudentListController.runProgram(studentList, file, scKeyboard);

	}

	
}
