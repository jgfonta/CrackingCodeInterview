package cp03;
import java.util.*;
//3.2 How would you design a stack which, in addition to push and pop, also 
//has a function min which returns the minimum element? Push, pop and min 
//		should all operate in O(1) time.
//_
//________________________________________________________________pg 113
//

public class problem2 {

	StackNode header;

	
	public problem2()
	{
		header = null;
	}
	

	public boolean push(int value)
	{
		StackNode newEntry = new StackNode(value);
		
		if (header != null)
		{
			if (value < header.min)
				newEntry.min = value;
			else 
				newEntry.min = header.min;
			newEntry.next = header;
		}
		
		header = newEntry;
		
		return true;
	}
	
	public int pop()
	{
		StackNode poppedNode = header;
		header = header.next;
		if (poppedNode != null)
			return poppedNode.data;
		else
			return 0;
	}
	
	public boolean hasNext()
	{
		return (header != null);
	}
	
	public int minimum()
	{
		return header.min;
	}
	
	public void createStacks()
	{
		Random myRando = new Random();
		for (int i = 0; i < 100; i++)
		{
			//Make it a positive value
			push(myRando.nextInt(10000));
		}
	}
	
	public void printStacks()
	{
		int lines = 0;
		int currMin;
		StackNode currEntry = header;
		System.out.println("Stack has the following:");
		while (hasNext())
		{
			currMin = minimum();
			System.out.print("Entry(" + lines + ")=" + pop() + " min=" + currMin + "\t");
			lines++;
			if (lines % 5 == 0)
				System.out.print("\n");
		}
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("Hi & Welcome to another exciting programming problem!");
		problem2 myProblem = new problem2();
		myProblem.createStacks();
		myProblem.printStacks();

	}

}
