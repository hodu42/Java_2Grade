package SimplyLinkedList;
import java.util.Scanner;

	public class SimplyLinkedList <E> {
		
		private Node head;
		private int size;
		
		
		private static class Node <E>{
			private E data;
			private Node <E> next;
			
			
			
			Node(E e)
			{
				data = e;
				next = null;
			}
			
			Node(E e, Node <E> next)
			{
				data = e;
				this.next = next;
			}
			
			public E getData() {return data;} 
			
			public Node <E> getNext()		{return next;}
			
			public void setNext(Node <E> n) {next = n;}
			
			
		}
		
		public void addFirst(E e)
		{
			Node newNode = new Node(e);
			newNode.next = head;
			head = newNode;
			size++;
		}
		
		public void addLast(E e)
		{
			Node newNode = new Node(e);
			
			getNode(size).setNext(newNode);
			size++;
		}
		
		Node getNode(int index)
		{
			Node x = head;
			for(int i=0; i < index; i++)
			{
				x = x.getNext();
			}
			return x;
		}
		
		public void addAfter(E e, Node <E> prevNode) {
			Node newNode = new Node(e);
			newNode.setNext(prevNode.getNext());
			prevNode.setNext(newNode);
			
		}
		
		public String toString()
		{
			if(head == null)
			{
				return "[]";
			}
			Node temp = head;
			String str = "[";
			
			while(temp.next != null)
			{
				str += temp.getData() + ", ";
				temp = temp.getNext();
			}
			str += temp.getData();
			return str+"]";
		}
		
		public void deleteAfter(Node <E> prevNode)
		{
			if(prevNode == null) return;
			Node tmp = prevNode.getNext();
			prevNode.setNext(tmp.getNext());
			tmp.setNext(null);
		}
		
		public void choose(int menu)
		{
			if(menu == 1)
			{
				System.out.print("�й��� �̸�, ���Ƹ����� �Է��ϼ��� : ");
			}
			else if(menu == 2)
			{
				System.out.print("�й��� �Է��ϼ��� : ");
			}
			else if(menu == 3)
			{
				//�й������� ��ü ���
			}
			else if(menu == 4)
			{
				//������
				System.out.print("�����մϴ�.");
			}
		}
		
		void addBetween(E e)
		{
			if(size == 0) {addLast(e);}
			else
			{
				
			}
		}
		
		
		
	}


