package CircularDoublyLinkedList;

public class CircularDoublyLinkedList<E> {
	public class Node<E> {
		private E data;
		private Node<E> prev;
		private Node<E> next;
		
		Node(E e) {
			data = e;
			prev = null;
			next = null;
		}

		Node(E e, Node<E> next) {
			data = e;
			this.next = next;
		}

		public E getData() {
			return data;
		}

		public Node<E> getPrev(){
			return prev;
		}
		
		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> n) {
			next = n;
		}
		
		public void setPrev(Node<E> n) {
			prev = n;
		}

	}

	private Node<E> head;
	private int size = 0;
	
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
