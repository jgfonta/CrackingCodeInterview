package cp03;
import java.util.*;
//3.3 Imagine a (literal) stack of plates. If the stack gets too high, it might 
//topple. Therefore, in real life, we would likely start a new stack when the 
//previous stack exceeds some threshold. Implement a data structure SetOfStacks 
//that mimics this. SetOfStacks should be composed of several stacks, and should 
//create a new stack once the previous one exceeds capacity. SetOfStacks.push() 
//and SetOfStacks.pop() should behave identically to a single stack (that is, pop()
//should return the same values as it would if there were just a single stack).
//FOLLOW UP
//Implement a function popAt(int index) which performs a pop operation on a specific
//sub-stack.
//_
//________________________________________________________________pg 115


public class problem3 {

	SetOfStacks waiterArm;

	
	public problem3()
	{
		waiterArm = new SetOfStacks(10);
	}
	

	public void createStacks()
	{
		Random myRando = new Random();
		for (int i = 0; i < 100; i++)
		{
			waiterArm.push(myRando.nextInt(1000));
		}
	}
	
	public void printStacks()
	{
		int lines = 0;
		int currMin;
		System.out.println("Stack has the following:");
		while (waiterArm.hasNext())
		{
			System.out.print("Entry(" + lines + ")=" + waiterArm.pop() + "\t");
			lines++;
			if (lines % 5 == 0)
				System.out.print("\n");
		}
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("Hi & Welcome to another exciting programming problem!");
		problem3 myProblem = new problem3();
		myProblem.createStacks();
		myProblem.printStacks();

	}
}
