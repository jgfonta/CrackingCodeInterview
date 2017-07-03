package cp03;
import java.util.*;
//3.5 Implement a MyQueue class which implements a queue using two stacks.


public class problem5 {

	MyQueue<Integer> probQ;
	
	public problem5()
	{
		probQ = new MyQueue<Integer>();
	}
	
	public static void main(String[] args) 
	{
		problem5 myProblem = new problem5();		
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
			probQ.add(myRando.nextInt(10000));
		}
	}
	
	public void printStacks()
	{
		int lines = 0;
		System.out.println("Queue has the following:");
		while (!probQ.isEmpty())
		{
			System.out.print("Entry(" + lines + ")=" + probQ.remove() + "\t");
			lines++;
			if (lines % 5 == 0)
				System.out.print("\n");
		}
	}
	

}
