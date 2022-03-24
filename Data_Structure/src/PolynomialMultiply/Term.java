package PolynomialMultiply;

public class Term {
	private double coef;		//계수
	private int exp;			//지수
	
	
	
	public void setTerm(double coef, int exp)
	{
		this.coef = coef;
		this.exp = exp;
	}
	
	public double getCoef() 	{return coef;}
	
	public int getExp()			{return exp;}
	
	int compareExp(Term tr)
	{
		if ( this.getExp() > tr.getExp() )		return 1;
		else if ( this.getExp() < tr.getExp() )  return -1;
		else	return 0;
	}
	
	
}
