package cp03;
import java.util.*;
//3.6 Write a program to sort a stack in ascending order. You should not make any 
//assumptions about how the stack is implemented. The following are the only functions 
//that should be used to write this program: push | pop | peek | isEmpty.



public class problem6 {

	Stack<Integer> myStack;
	
	public problem6()
	{
		myStack = new Stack<Integer>();
	}
	
	public static void main(String[] args) {

		problem6 myProblem = new problem6();
		

		System.out.println("Hi & Welcome to another exciting programming problem!");
		myProblem.createStacks();
		myProblem.printStacks();

	}

	public void createStacks()
	{
		Random myRando = new Random();
		for (int i = 0; i < 100; i++)
		{
			//Make it a positive value
			myStack.add(myRando.nextInt(10000));
		}
		myStack = sort(myStack);
	}
	
	public void printStacks()
	{
		int lines = 0;
		System.out.println("Queue has the following:");
		while (!myStack.isEmpty())
		{
			System.out.print("Entry(" + lines + ")=" + myStack.pop() + "\t");
			lines++;
			if (lines % 5 == 0)
				System.out.print("\n");
		}
	}


	public static Stack<Integer> sort(Stack<Integer> startingStack)
	{
		Stack<Integer> returnedStack = new Stack<Integer>();
		
		//If stack was empty at start then return back empty stack
		// otherwise loop until stack has been transferred from 
		// 
		while(!startingStack.isEmpty()) 
		{
			//Get the top entry from stack
			int currentEntry = startingStack.pop();
			
			//If returned stack is not empty then 
			//  If the top of the sorted stack is greater than this entry then
			while(!returnedStack.isEmpty() && returnedStack.peek() > currentEntry) 
			{
				//Empty the sorted stack onto the starting stack as a temporary work area
				//so that after stack is empty we can push the current entry on the (empty) sorted stack
				startingStack.push(returnedStack.pop());
			}
			
			//Add entry to sorted stack 
			returnedStack.push(currentEntry);
		}

		return returnedStack;
	}
	
	
	
}
