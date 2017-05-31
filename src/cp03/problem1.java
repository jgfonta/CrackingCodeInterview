package cp03;

import java.util.*;
//3.1 Describe how you could use a single array to implement three stacks.
//_
//________________________________________________________________pg 111

//Stack will operate as LIFO
//Array elements must be a class with an index slot to next and the data
//Could have a pointer to the first element in the array or use the first
// 3 entries as the starting point, if null then no data, else valid stack
// Alternative is a smaller array to point to each first element...



public class problem1 {

	ArrayNode[] myArray;   //Array of entries
	int[] topArray;
	static final int STACKS = 3;
	static final int MAXELEMENTS = 100;
	int currElement;
	
	public problem1()
	{
		currElement = 0;
		myArray = new ArrayNode[MAXELEMENTS];  //Creates array of references to ArrayNodes
		topArray = new int[STACKS];
		Arrays.fill(topArray, -1);
	}
	
	public boolean stackEntry(int stack)
	{
		Random myRando = new Random();

		if (currElement == (MAXELEMENTS -1))
			return false;
	
		currElement++;
		myArray[currElement] = new ArrayNode();
		
		if (stack == 0)
			myArray[currElement].setData(myRando.nextInt(100) * 100);
		else if (stack == 1)
			myArray[currElement].setData(myRando.nextInt(100) * -1);				
		else
			myArray[currElement].setData(myRando.nextInt(100));	
		
		
		if (topArray[stack] != -1)
		{
			myArray[currElement].setNext(topArray[stack]);
			topArray[stack] = currElement;
		}
		else
		{
			topArray[stack] = currElement;
		}
		return true;
	}
	
	public void createStacks()
	{
		int i = 1;
		Random myRando = new Random();
		while(stackEntry(myRando.nextInt(3))  )
		{
			i++;
		}
		System.out.println("Stacked " + i + " entries.");
	}
	
	public void printStacks()
	{
		int currEntry, lines;

		for (int i = 0; i < STACKS; i++)
		{
			System.out.println("\nStack #" + i + " has the following:");
			currEntry = topArray[i];
			lines = 0;
			while (currEntry != -1)
			{
				System.out.print("Entry(" + currEntry + ")=" + myArray[currEntry].getData() + " ");
				currEntry = myArray[currEntry].getNext();
				lines++;
				if (lines % 8 == 0)
					System.out.print("\n");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("Hi & Welcome to another exciting programming problem!");
		problem1 myProblem = new problem1();
		myProblem.createStacks();
		myProblem.printStacks();

	}
	
	

}
