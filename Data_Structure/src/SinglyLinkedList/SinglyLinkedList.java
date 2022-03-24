package SinglyLinkedList;


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
	private int size=0;

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

	Node <E> getNode(int index) {
		Node<E> x = head;
		for (int i = 0; i < index; i++) {
			x = x.getNext();
		}
		return x;
	}
	
	Node<E> getCurNode() {
		Node<E> curNode = head;
		Node<E> prevNode = null;
		prevNode = curNode;
		curNode = prevNode.getNext();
		
		return curNode;
		
	}

	public void addAfter(E e, Node<E> prevNode) {
		Node<E> newNode = new Node<E>(e);
		newNode.setNext(prevNode.getNext());
		prevNode.setNext(newNode);

	}

	public String toString(SinglyLinkedList <E> studentList) {
		if (head == null) {
			return "";
		}
		Node<E> tmp = head;
		String str = "";

		while (tmp.next != null) {
			str += tmp.getData() + " ";
			tmp = tmp.getNext();
		}
		str += tmp.getData();
		return str;
	}

	public void deleteAfter(Node<E> prevNode) {
		if (prevNode == null)
			return;
		Node<E> tmp = prevNode.getNext();
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
}
