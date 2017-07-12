package cp04;

import java.util.*;

//4.3 Given a sorted (increasing order) array, write an algorithm to create a binary tree with minimal height.
//_
//________________________________________________________________pg 125


public class pb03 {

	Integer[] sortedArray;
	static final int ARRAYSIZE = 10;
	
	public pb03()
	{
		sortedArray = new Integer[ARRAYSIZE];
	}
	
	public void createArray()
	{
		
		Random myRando = new Random();
		for (int i = 0; i < ARRAYSIZE; i++)
		{
			sortedArray[i] = i * 10 + i + 1;
		}
	}
	
	public void printArray()
	{
		System.out.println("Array has the following:");
		for (int i = 0; i < ARRAYSIZE; i++)
		{
			System.out.print("Entry(" + i + ")=" + sortedArray[i] + "\t");
			if ((i+1) % 5 == 0)
				System.out.print("\n");
		}
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("Hi & Welcome to another exciting programming problem!");
		pb03 myProblem = new pb03();
		myProblem.createArray();
		myProblem.printArray();

	}


}
