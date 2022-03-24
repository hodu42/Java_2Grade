package SinglyLinkedList;

public class Student {
		private int classNumber;
		private String name;
		private SinglyLinkedList <String> club;
		
		
		Student()
		{
			classNumber = 0;
			name = null;
			club = null;
		}
		
		
		
		void setStudent(int number, String name)
		{
			classNumber = number;
			this.name = name;
		}
		
		public void setClub(String club)
		{
			this.club.addLast(club);
		}
		
		public int getNumber()		{return classNumber;}
		
		public String getName()		{return name;}
		
		public SinglyLinkedList <String> getClub()	{return club;}
		
		public String getClubName(int index) {
			return club.getNode(index).getData();
		}
		
}

