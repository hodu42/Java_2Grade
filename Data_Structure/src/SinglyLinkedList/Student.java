package SinglyLinkedList;

public class Student {
		private int classNumber;
		private String name;
		private SinglyLinkedList <String> club;
		
		
		Student()
		{
			classNumber = 0;
			name = null;
			club = new SinglyLinkedList<String>();
		}
		
		
		
		void setStudent(int number, String name)
		{
			classNumber = number;
			this.name = name;
		}
		
		public void setClub(String club)
		{
			this.club.add(club);
		}
		
		public int getNumber()		{return classNumber;}
		
		public String getName()		{return name;}
		
		public SinglyLinkedList <String> getClub()	{return club;}
		
		public String getClubName(int index) {
			return club.getNode(index).getData();
		}
		
		public String toString(){
			String str = "";
			str = classNumber + " " + name;
			if(club.getSize() != 0) {
				str += getClubName(0);
				for(int i = 1; i < club.getSize(); i++) {
					str += "/" + getClubName(i);
				}
			}
			return str;
		}
		
}

