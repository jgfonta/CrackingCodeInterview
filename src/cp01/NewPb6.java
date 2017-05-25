package cp01;

import java.util.*;

////1.6 Given an image represented by an NxN matrix, where each pixel in the 
//image is 4 bytes (32 bits), write a method to rotate the image by 90 degrees. 
//Can you do this in place?


public class NewPb6 {

	static final int ARRAYSIZE = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//4 bytes (pixel) is 32 bits
		//Need an NxN matrix of 32 bits
		int[][] fakeImage = new int[ARRAYSIZE][ARRAYSIZE];
				
		fillArray(fakeImage);

		System.out.println("Here is my array");
		printArray(fakeImage);

		rotateImage(fakeImage, ARRAYSIZE);
		//rotate(fakeImage, ARRAYSIZE);

		System.out.println("Here is rotated array");
		printArray(fakeImage);
		


				
	}
	
	static public void fillArray(int [][] myArray)
	{
		int val = 1;
		for (int i = 0; i<ARRAYSIZE;i++)
		{
			for (int j = 0; j <ARRAYSIZE;j++)
			{
				myArray[i][j] = val;
				val++;
			}
		}
	}
	static public void rotateImage(int [][] myArray, int n)
	{
		int temp;
		
		//Rotation 90 degrees
		//Since the matrix is equilateral only need to traverse half of it to complete it
		for (int i = 0; i <= (n)/2; i++)
		{		
			for (int j = i; j < (n-i-1); j++)
			{				
				temp = myArray[i][j];              		//good
				myArray[i][j] = myArray[n-1-j][i]; 		//good
				myArray[n-1-j][i] = myArray[n-1-i][n-1-j];	//
				myArray[n-1-i][n-1-j] = myArray[j][n-1-i];
				myArray[j][n-1-i] = temp;
			}
		}
	}
	
	
	public static void rotate(int[][] matrix, int n) 
	{
		for (int layer = 0; layer < n / 2; ++layer) 
		{
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; ++i) 
			{
				int offset = i - first;
				int top = matrix[first][i]; // save top
				//left -> top
				matrix[first][i] = matrix[last-offset][first];
				
				//bottom -> left
				matrix[last-offset][first] = matrix[last][last - offset];
				
				// right -> bottom
				matrix[last][last - offset] = matrix[i][last];
				
				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
	}
	
	static public void printArray(int [][] myArray)
	{
		int Y, X;    //Y will be the typical Y axis
					 //X will be the typical X axis

		//Assume no one calls with null array
		Y = myArray.length;
		X = myArray[0].length;
		
		//Rotation 90 degrees is to flip rows in reverse order
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
