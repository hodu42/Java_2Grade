package CircularDoublyLinkedList;

public class Student {
		private int classNumber;
		private String name;
		
		Student()
		{
			classNumber = 0;
			name = null;
		}
		
		void setStudent(int number, String name)
		{
			classNumber = number;
			this.name = name;
		}
		
		public int getNumber()		{return classNumber;}
		
		public String getName()		{return name;}
		
		public String toString(){
			String str = "";
			str = classNumber + " " + name;
			
			return str;
		}
		
}

