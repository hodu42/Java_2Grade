package CircularDoublyLinkedList;

public class CircularDoublyLinkedList<E extends Comparable <E>> {
	
	public class Node<E> {
		private E data;
		private Node<E> prev;
		private Node<E> next;
		
		Node(E e) {
			data = e;
			prev = null;
			next = null;
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
	private int size;
	
	public CircularDoublyLinkedList() {
		head = new Node (null);
		head.next = head;
		head.prev = head;
		size = 0;
	}

	public int getSize() {
		return size;
	}
	
	public void add(E e) {
		Node newNode = new Node(e);
		Node <E> curNode = head.next;
		
		if(size == 0) {
			newNode.prev = head;
			newNode.next = head;
			head.next = newNode;
			head.prev = newNode;
		}
		else {
			while(curNode.getData() != null && curNode.getData().compareTo(e) == 1) {
				curNode = curNode.next; 
			}
			newNode.prev = curNode.prev;
			newNode.next = curNode;
			curNode.prev.next = newNode;
			curNode.prev = newNode;
		}
		size++;
	}
	
	public void delete(E e) {
		Node <E> curNode = head.next;
		for(; curNode.getData() != null; curNode = curNode.next) {
			if(curNode.getData().compareTo(e) == 0) {
				curNode.prev.next = curNode.next;
				curNode.next.prev = curNode.prev;
				size--;
				break;
			}
		}
		
	}

	Node<E> getNode(int index) {
		Node<E> x = head.next;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}

}
