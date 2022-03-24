package fourByFourMatrix;

class Matrix
{
	 private int [][] mat; //2차원 배열 선언
	
	 Matrix(int r, int c)		// (생성자) r행 c열의 행렬을 만든다.
	 {
		 mat = new int[r][c];
	 }
	 
	 Matrix(int [][]mat)
	 {
		 this.mat = new int [mat.length][mat.length];
		 for(int i=0;i<mat.length;i++)
		 {
			 for(int j=0;j<mat.length;j++)
			 {
				 this.mat[i][j] = mat[i][j];
			 }
		 }
	 }
	 
	 void inputValue(int r, int c, int num)	// r행 c열에 num값을 집어넣는다.
	 {
		 mat[r][c] = num;
	 }
	 
	 public Matrix clone()
	 {
		 Matrix cloneMatrix = new Matrix(mat);
		 
		 return cloneMatrix;
	 }
	 

	 
	 void printRow(int line)					
	 {
		 
			 System.out.printf("|");
			 
			 for(int i=0;i<mat.length;i++)
			 {
				 System.out.printf("%4d",mat[line][i]);
			 }
			 
			 System.out.printf(" | ");
	 }
	 
	 
	 void selfTranspose(int num) 	// 행렬 바꾸기
	 {	 
		 if(num==0) // right 돌렸을때 행렬
		 {
			 to90degreeRight();
		 }
		 
		 if (num==1) // left 돌렸을때 행렬
		 {
			 to90degreeLeft();
		 }
		 
		 if (num==2) // 전치행렬
		 {
			 transposition();
		 }
	 }
	 
	 void to90degreeLeft()
	 {
		 int [][] swapMatrix = new int [mat.length][mat.length];
		 for (int i=0;i<mat.length;i++)		
			{
				for(int j=0;j<mat.length;j++)
				{
					swapMatrix[mat.length-1-i][j] = mat[j][i];
				}
			}
		 mat = swapMatrix;
	 }
	 
	 void to90degreeRight()
	 {
		 int [][] swapMatrix = new int [mat.length][mat.length];
		 for (int i=0;i<mat.length;i++)		
			{
				for(int j=0;j<mat.length;j++)
				{
					swapMatrix[j][mat.length-1-i] = mat[i][j];
				}
			}
		 mat = swapMatrix;
	 }
	 
	 void transposition()
	 {
		 int [][] swapMatrix = new int [mat.length][mat.length];
		 for (int i=0;i<mat.length;i++)		
			{
				for(int j=0;j<mat.length;j++)
				{
					swapMatrix[j][i] = mat[i][j];
				}
			}
		 mat = swapMatrix;
	 }
	 
	 

	 int getLength() {return mat.length;}
	 
	 
	 
}

