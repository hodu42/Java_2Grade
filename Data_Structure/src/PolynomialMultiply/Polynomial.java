package PolynomialMultiply;

public class Polynomial {
	private int termCnt;
	private ArrList <Term> polynomial = new ArrList <Term>();
	
	Polynomial()
	{
		termCnt = 0;
	}
	
	Polynomial(ArrList <Term> polynomial)
	{
		this.polynomial = polynomial;
	}
	
	
	void setPolynomial(double coef, int exp) 		// 다항식 만들기 (계수, 지수) 입력
	{
		if(coef !=0)
		{
			Term tr = new Term();
			tr.setTerm(coef, exp);
			polynomial.addLast(tr);
			termCnt++;
		}
	}

	
	
	Polynomial add(Polynomial pn)
	{
		Polynomial newPoly = new Polynomial();
		
		int i; 	int j;
		
		for(i = 0, j = 0; i < this.termCnt && j < pn.termCnt; )
		{
			Term thisTerm = getTerm(i);
			Term pnTerm = pn.getTerm(j);
			
			int compare = thisTerm.compareExp(pnTerm);
			
			if (compare > 0)
			{
				newPoly.setPolynomial( thisTerm.getCoef(), thisTerm.getExp() ); 	i++;
			}
			else if (compare < 0)
			{
				newPoly.setPolynomial( pnTerm.getCoef(), pnTerm.getExp() );			j++;
			}
			else
			{
				if ( thisTerm.getCoef() + pnTerm.getCoef() != 0 ) 
				{
					newPoly.setPolynomial( thisTerm.getCoef() + pnTerm.getCoef(), thisTerm.getExp() );	
				}
				i++;	j++;
			}	
		}

		for ( ; i < this.termCnt; i++ )
		{
			Term thisTerm = getTerm(i);
			newPoly.setPolynomial(thisTerm.getCoef(), thisTerm.getExp());
		}
		
		for ( ; j < pn.termCnt; j++ )
		{
			Term pnTerm = pn.getTerm(j);
			newPoly.setPolynomial(pnTerm.getCoef(), pnTerm.getExp());
		}
		
		return newPoly;
				 
	}

	
	
	
	Polynomial multiplyPoly(Polynomial pn)
	{
		Polynomial multiplyPoly = new Polynomial();
		
		for(int i = 0; i < termCnt; i++ )
		{
			multiplyPoly.setPolynomial(multiplyTerm(pn, i, 0).getCoef(), multiplyTerm(pn, i, 0).getExp());
		}
		
		for (int i = 0; i < termCnt; i++)
		{
			for(int j = 1; j < pn.termCnt; j++)
			{
				Polynomial changingPoly = new Polynomial();
				changingPoly.setPolynomial(multiplyTerm(pn, i, j).getCoef(), multiplyTerm(pn, i, j).getExp());
				multiplyPoly = multiplyPoly.add(changingPoly);
			}	
		}
		
		return multiplyPoly;
		
	}
	
	Term multiplyTerm(Polynomial pn2, int i, int j)
	{
		Term newTerm = new Term();
		double multiplyCoef;	int multiplyExp;
		multiplyCoef = this.getCoef(i) * pn2.getCoef(j);
		multiplyExp = this.getExp(i) + pn2.getExp(j);
		newTerm.setTerm(multiplyCoef, multiplyExp);
		
		return newTerm;
	}
	

	double getCoef(int i)	{return polynomial.peek(i).getCoef();}
	
	int getExp(int i)	{return polynomial.peek(i).getExp();}
	
	Term getTerm(int i)				{return this.polynomial.peek(i);}
	
	
	void printPn()
	{
		System.out.print("두 다항식의 곱은 :");
		for(int i=0; i< this.termCnt; i++)
		{
			if (getExp(i) ==0)  System.out.printf(" %d ",(int)getCoef(i));		//지수가 0일때(상수)
			
			
			else if (getExp(i) == 1)		//지수가 1일때
			{
				if (getCoef(i) == 1)		System.out.printf(" x ");
				else if (getCoef(i) == -1)	System.out.printf(" -x ");
				else System.out.printf(" %dx ",(int)getCoef(i));
			}
			
			
			
			else {
				if(getCoef(i) == 1)			System.out.printf(" x^%d ", getExp(i));
				else if(getCoef(i) == -1)	System.out.printf(" -x^%d ", getExp(i));
				else System.out.printf(" %dx^%d ", (int)getCoef(i), getExp(i));
			}
		
		if(i < this.termCnt-1) 				System.out.print("+");
				
			
		}	
	}
}
