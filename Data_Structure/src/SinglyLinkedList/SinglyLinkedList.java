package SinglyLinkedList;

import java.util.Scanner;

public class SinglyLinkedList<E> {
	public class Node<E> {
		private E data;
		private Node<E> next;

		Node(E e) {
			data = e;
			next = null;
		}

		Node(E e, Node<E> next) {
			data = e;
			this.next = next;
		}

		public E getData() {
			return data;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> n) {
			next = n;
		}

	}

	private Node<E> head;
	private int size = 0;

	public void read(Scanner sc) {
		Student std = new Student();
		int number;
		String name;
		String club;

		number = sc.nextInt();
		name = sc.next();
		club = sc.nextLine();
		String[] clubArr = null;

		if (club != null) {
			clubArr = club.split("/");
			for (int i = 0; i < clubArr.length; i++) {
				std.setClub(clubArr[i]);
			}
		}

		std.setStudent(number, name);

		
	}
	
	public void fileRead(Scanner sc) {
		while(sc.hasNextLine()) {
			read(sc);
		}
	}

	public void keyboardRead(Scanner sc) {
		System.out.print("학번과 이름, 동아리들을 입력하세요 : ");
		read(sc);
	}
	
	public int getSize() {
		return size;
	}

	public void addFirst(E e) {
		Node newNode = new Node(e);
		newNode.next = head;
		head = newNode;
		size++;
	}

	public void addLast(E e) {
		Node newNode = new Node(e);

		getNode(size - 1).setNext(newNode);
		size++;
	}
	
	
	public void add(E e) {

		if (size == 0) {
			addFirst(e);
		} else
			addLast(e);

	}
	

	Node<E> getNode(int index) {
		Node<E> x = head;
		for (int i = 0; i < index; i++) {
			x = x.getNext();
		}
		return x;
	}

	public void addAfter(E e, Node<E> prevNode) {
		Node<E> newNode = new Node<E>(e);
		newNode.setNext(prevNode.getNext());
		prevNode.setNext(newNode);
		size++;
	}

	public void deleteFirst() {
		head = head.getNext();
		size--;
	}
	public void deleteAfter(Node<E> prevNode) {
		if (prevNode == null)
			return;
		Node<E> tmp = prevNode.getNext();
		prevNode.setNext(tmp.getNext());
		tmp.setNext(null);
		size--;
	}
	
	public void deleteLast() {
		getNode(size-2).setNext(null);
		size--;
	}


}
