package P_7_20;

public class Stud {
	private String name;
	private double kor;
	private double math;
	private double eng;
	
	
	public Stud(String name, double kor, double math, double eng)
	{
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getAverage()
	{
		return (this.kor + this.math + this.eng) /3;
	}
}
