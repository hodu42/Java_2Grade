package fourByFourMatrix;

public class FourByFourMatrix {

	public static void main(String[] args) {
		
		Matrix srcMat = new Matrix(4,4);
		
		getRandomValue(srcMat);
		
		Matrix rightMat = srcMat.clone();	rightMat.selfTranspose(0);
		Matrix leftMat = srcMat.clone();	leftMat.selfTranspose(1);
		Matrix transMat = srcMat.clone();	transMat.selfTranspose(2);
		
		System.out.printf("%-18s%-18s%-18s%s", "최초행렬", "우측으로 90도 회전", "좌측으로 90도 회전", "전치행렬\n");
		
		for (int line=0;line<srcMat.getLength();line++)
		{
			srcMat.printRow(line);
			rightMat.printRow(line);
			leftMat.printRow(line);
			transMat.printRow(line);
			System.out.println();
		}
		
	
	}
	
	static void getRandomValue(Matrix name)
	{
		for (int i=0; i<name.getLength();i++)
		{
			for (int j=0; j<name.getLength();j++)
			{
				name.inputValue(i, j, (int)(Math.random()*999)+1);
			}
		}
	}

}
