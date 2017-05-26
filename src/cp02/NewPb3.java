package cp02;

import java.util.*;

//Question goes here
//2.3 Implement an algorithm to delete a node in the middle of a single linked list, 
//given only access to that node.
//EXAMPLE
//Input: the node ‘c’ from the linked list a->b->c->d->e
//Result: nothing is returned, but the new linked list looks like a->b->d->e
public class NewPb3 extends NewPb1 {


	public static void main(String[] args) 
	{
		NewPb3 myProblem = new NewPb3();

		System.out.println("Here is my linked list");
		System.out.println(myProblem);

		Node deletedNode;
	
		deletedNode = myProblem.findNode(10);
		System.out.println("Deleting node 10 " + deletedNode);
		myProblem.removeNode(deletedNode);
		System.out.println("Here is my linked list without 10");
		System.out.println(myProblem);
		
		deletedNode = myProblem.findNode(20);
		System.out.println("Deleting node 20 " + deletedNode);
		myProblem.removeNode(deletedNode);
		System.out.println("Here is my linked list without 20");
		System.out.println(myProblem);

		deletedNode = myProblem.findNode(30);
		System.out.println("Deleting node 30 " + deletedNode);
		myProblem.removeNode(deletedNode);
		System.out.println("Here is my linked list without 30");
		System.out.println(myProblem);

		
	}

	
	public Node findNode(int n)
	{
		Node foundNode = head;
				
		if (head == null)
			return null;

		//Loop through n entries
		for (int i = 0; i < n-1; i++)
		{
			if (foundNode == null)
				return null;
			foundNode = foundNode.next;
		}
		return foundNode;

	}
	
	//2.3 Implement an algorithm to delete a node in the middle of a single linked list, 
	//given only access to that node.
	//EXAMPLE
	//Input: the node ‘c’ from the linked list a->b->c->d->e
	//Result: nothing is returned, but the new linked list looks like a->b->d->e
	
	public boolean removeNode(Node deletedNode)
	{
		//Loop through n entries
		if (deletedNode == null)
				return false;
		deletedNode.data = deletedNode.next.data;
		deletedNode.next = deletedNode.next.next; //Advance the pointer from current to next's next
		return true;
	}

	
}
