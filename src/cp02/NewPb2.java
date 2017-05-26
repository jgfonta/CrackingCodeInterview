package cp02;

import java.util.*;

//Question goes here
//2.2 Implement an algorithm to find the nth to 
//    last element of a singly linked list.
public class NewPb2 extends NewPb1 {
	
	static final int nth = 5;

	//Routine to test the code
	public static void main(String[] args) 
	{
		//Some logic goes here
		NewPb2 myProblem = new NewPb2();

		System.out.println("Here is my linked list");
		System.out.println(myProblem);

		System.out.println("Found " + nth +"th to last element in singly linked list" + myProblem.findNthLast(nth) );
		
	}
	
	//Jeff thought about using a stack and loop through entries and pop off until reaching Nth to last
	//Book has a more elegant solution, go forward n entries and then 
	// start advancing the returned pointer at what would be the nth until the 
	// end is reached. Reduces the storage from N to 2 for the pointers
	public Node findNthLast(int n)
	{
		Node loopingNode = head, foundNode = head;
		
		if (head == null)
			return null;

		//Loop through n entries
		for (int i = 0; i < (n); i++)
		{
			if (loopingNode == null)
				return null;
			loopingNode = loopingNode.next;
		}
		
		while (loopingNode != null)
		{
			foundNode = foundNode.next;      //Makes it Nth to last node while there are more nodes
			loopingNode = loopingNode.next;
		}
		
		return foundNode;
	}

	
}
