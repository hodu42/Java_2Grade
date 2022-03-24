package SinglyLinkedList;

import java.util.Scanner;

public class SinglyLinkedList<E> {

	private Node head;
	private int size;

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
	public int getSize() {return size;}

	public void addFirst(E e) {
		Node newNode = new Node(e);
		newNode.next = head;
		head = newNode;
		size++;
	}

	public void addLast(E e) {
		Node newNode = new Node(e);

		getNode(size).setNext(newNode);
		size++;
	}

	Node getNode(int index) {
		Node x = head;
		for (int i = 0; i < index; i++) {
			x = x.getNext();
		}
		return x;
	}
	
	Node getCurNode() {
		Node curNode = head;
		Node prevNode = null;
		prevNode = curNode;
		curNode = prevNode.getNext();
		
		return curNode;
		
	}

	public void addAfter(E e, Node<E> prevNode) {
		Node newNode = new Node(e);
		newNode.setNext(prevNode.getNext());
		prevNode.setNext(newNode);

	}

	public String toString() {
		if (head == null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";

		while (temp.next != null) {
			str += temp.getData() + ", ";
			temp = temp.getNext();
		}
		str += temp.getData();
		return str + "]";
	}

	public void deleteAfter(Node<E> prevNode) {
		if (prevNode == null)
			return;
		Node tmp = prevNode.getNext();
		prevNode.setNext(tmp.getNext());
		tmp.setNext(null);
	}

	public void choose(int menu) {
		if (menu == 1) {
			System.out.print("학번과 이름, 동아리들을 입력하세요 : ");
		} else if (menu == 2) {
			System.out.print("학번을 입력하세요 : ");
		} else if (menu == 3) {
			// 학번순으로 전체 출력
		} else if (menu == 4) {
			// 저장후
			System.out.print("종료합니다.");
		}
	}

	void add(E e) {
		Node newNode = new Node(e);
		Node curNode = head;
		Node prevNode = null;

		if (size == 0) {

			addLast(e);

		} else if (prevNode == null) {

			if (curNode.getData().getNumber() > newNode.getData().getNumber()) {
				addFirst(e);
			} else if (curNode.getData().getNumber() < newNode.getData().getNumber()) {
				prevNode = curNode;
				curNode = curNode.getNext();
			}
		}

		while (curNode != null) {

			if (prevNode.getData().getNumber() < newNode.getData().getNumber() < curNode.getData().getNumber()) {
				newNode.setNext(curNode);
				prevNode.setNext(newNode);
				prevNode = prevNode.getNext();
				curNode = prevNode.getNext();
			}

		}

	}
}
