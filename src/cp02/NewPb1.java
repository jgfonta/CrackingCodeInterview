package cp02;

import java.util.*;

//Question goes here
//2.1 Write code to remove duplicates from an unsorted linked list.
//FOLLOW UP
//How would you solve this problem if a temporary buffer is not allowed?
public class NewPb1{
	
	Node head;
	static final int RANDOLIMIT = 50;
	public NewPb1() 
	{
		head = null;
		Random myRando = new Random();
		for (int i = 0; i< 100;i++)
		{
			if (head == null)
				head = new Node(myRando.nextInt(RANDOLIMIT));
			else
				head.appendToTail(myRando.nextInt(RANDOLIMIT));
		}
	}

	@Override
	public String toString() 
	{
		String output = "";
		int nodeNum = 1;
		Node currNode = head;
		while (currNode != null)
		{
			output += "Node  #" + nodeNum + "\t=" + currNode.data + "\t ";
			if ((nodeNum % 5) == 0)
				output += "\n";
			currNode = currNode.next;
			nodeNum++;
		}
		return output;
	}
	
	//Random routine goes here
	public void removeDupNodes()
	{
		Node outerNode = head;
		Node innerNode, prev;
		
		//Loop through all nodes on linked list
		while (outerNode != null)
		{
			innerNode = head;
			prev = null;
			//Check current node against remaining nodes on the list
			//Remove any duplicates that are found
			while (innerNode != null)
			{
				//If not the current node
				if (innerNode != outerNode)
				{
					//Check if data is the same
					if (innerNode.data == outerNode.data)
					{
						//Remove pointer from chain
						prev.next = innerNode.next;
					}
				}
				prev = innerNode;
				innerNode = innerNode.next;
			}
			outerNode = outerNode.next;
		}

	}

	//Routine to test the code
	public static void main(String[] args) 
	{
		//Some logic goes here
		NewPb1 myProblem = new NewPb1();

		System.out.println("Here is my linked list");
		System.out.println(myProblem);

		System.out.println("Here is the list without duplicates");
		myProblem.removeDupNodes();
		System.out.println(myProblem);
		
	}


	
}
