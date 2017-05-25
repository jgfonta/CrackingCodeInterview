package cp01;

import java.util.*;

//1.7 Write an algorithm such that if an element in an MxN matrix 
//is 0, its entire row and column is set to 0.

public class NewPb7 {

	static final int ARRAYVERT = 30;
	static final int ARRAYHORZ = 20;

	public static void main(String[] args) {

		int[][] fakeImage = new int[ARRAYVERT][ARRAYHORZ];
				
		fillArray(fakeImage, ARRAYVERT, ARRAYHORZ);

		System.out.println("Here is my array");
		printArray(fakeImage);

		checkZeros(fakeImage, ARRAYVERT, ARRAYHORZ);
		//rotate(fakeImage, ARRAYSIZE);

		System.out.println("Here is updated array with zeros spilled where neccessary");
		printArray(fakeImage);
		


				
	}
	
	static public void fillArray(int [][] myArray, int maxCol, int maxRow)
	{
		Random myRando = new Random();
		for (int i = 0; i<maxCol;i++)
		{
			for (int j = 0; j <maxRow;j++)
			{
				myArray[i][j] = myRando.nextInt(100) % 100;
			}
		}
	}
	
	//1.7 Write an algorithm such that if an element in an MxN matrix 
	//is 0, its entire row and column is set to 0.
	
	static public void checkZeros(int [][] myArray, int maxCol, int maxRow)
	{
		int[] zeroRows = new int[maxRow];
		
		Arrays.fill(zeroRows, 0);
		for (int row = 0; row < maxRow; row++)
		{		
			for (int col = 0; col < maxCol; col++)
			{		
				if (myArray[col][row] == 0)
				{
					zeroRows[row]++;
				}
			}
		}
		
		//Check for Rows to clear
		for (int row = 0; row < maxRow; row++)
		{
			if (zeroRows[row] != 0)
			{
				//Clear row across to zero
				for (int col = 0; col < maxCol; col++)
				{	
					//Find the entry with zero to clear that column too
					if (myArray[col][row] == 0)
					{
						for (int vertRow = 0; vertRow < maxRow; vertRow++)
						{		
							myArray[col][vertRow] = 0;
						}
					}
					myArray[col][row] = 0;
				}
			}
		}
		
	}
	
	
	
	static public void printArray(int [][] myArray)
	{
		int Y, X;    //Y will be the typical Y axis
					 //X will be the typical X axis

		Y = myArray.length;
		X = myArray[0].length;
		
		for (int i = 0; i < Y; i++)
		{		
			for (int j = 0; j < X; j++)
			{
				System.out.print(myArray[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

	
	
}
