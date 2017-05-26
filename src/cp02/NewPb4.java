package cp02;

import java.util.*;

//Question goes here
//2.4 You have two numbers represented by a linked list, where each node contains a single digit. 
//The digits are stored in reverse order, such that the 1’s digit is at the head of the list. 
//Write a function that adds the two numbers and returns the sum as a linked list.
//EXAMPLE
//Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
//Output: 8 -> 0 -> 8
public class NewPb4 {

	Node num1, num2;

	public NewPb4() 
	{
		int looper;
		num1 = null;
		num2 = null;
		Random myRando = new Random();
		num1 = new Node(myRando.nextInt(10) % 10);
		num2 = new Node(myRando.nextInt(10) % 10);
		looper = myRando.nextInt(10) % 5;
		for (int i = 0; i< looper;i++)
		{
			num1.appendToTail((myRando.nextInt(10) % 9) + 1);
		}
		looper = myRando.nextInt(10) % 5;
		for (int i = 0; i< looper;i++)
		{
			num2.appendToTail((myRando.nextInt(10) % 9) + 1);
		}
	}
	
	public String expressionString() 
	{
		String output = ""; 
		Node currNode = num1;
		
		output += "(";
		while (currNode != null)
		{
			output += currNode.data;
			if (currNode.next != null)
				output += "->";
			currNode = currNode.next;
		}
		output += ") + (";
		currNode = num2;
		while (currNode != null)
		{
			output += currNode.data;
			if (currNode.next != null)
				output += "->";
			currNode = currNode.next;
		}
		output += ")";

		return output;
	}
	
	public String solutionString() 
	{
		String output = "(";
		Node currNode = num1;
		while (currNode != null)
		{
			output += currNode.data;
			if (currNode.next != null)
				output += "->";
			currNode = currNode.next;
		}
		output += ")";
		return output;
	}
	
	public static void main(String[] args) 
	{
		//Some logic goes here
		NewPb4 myProblem = new NewPb4();

		System.out.println("Here is my linked list");
		System.out.println(myProblem.expressionString());
		myProblem.addListData();
		System.out.println(myProblem.solutionString());

		
	}

	//2.4 You have two numbers represented by a linked list, where each node contains a single digit. 
	//The digits are stored in reverse order, such that the 1’s digit is at the head of the list. 
	//Write a function that adds the two numbers and returns the sum as a linked list.
	//EXAMPLE
	//Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
	//Output: 8 -> 0 -> 8	
	public void addListData()
	{
		int sum = 0;
		Node exp1 = num1, exp2 = num2;
		while (exp1 != null || exp2 != null)
		{
			if (exp1 != null && exp2 != null)
			{
				sum += exp1.data + exp2.data;
				exp1.data = sum % 10;
				exp1 = exp1.next;
				exp2 = exp2.next;
			}
			//expression 1 is null
			else if (exp1 == null)
			{
				//need to add a node
				num1.appendToTail(exp2.data + sum);
				exp2 = exp2.next;
			}
			//expression 2 is null
			else
			{
				exp1.data = exp1.data + sum;
				exp1 = null;
			}				
			sum = sum / 10;
		}
	}

	
}
