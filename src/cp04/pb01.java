package cp04;

import java.io.FileReader;
import java.util.*;
import javax.swing.tree.*;

//4.1 Implement a function to check if a tree is balanced. For the purposes of this question, 
//a balanced tree is defined to be a tree such that no two leaf nodes differ in distance from 
//the root by more than one.
//_
//________________________________________________________________pg 123

//Fix the maximum level and the minimum level by traversing the tree

public class pb01 {

	 public static int maxDepth(myNode root) 
	 {
		 int max, current;
		 myNode currNode;
		 LinkedList<myNode> nodeStack = new LinkedList<myNode>();
		 LinkedList<Integer> levStack = new LinkedList<Integer>();

		 if (root.left == null && root.right == null)
		 {
			 max = 0;
			 return max;
		 }

		 
		 max = 0;
		 levStack.push(0);
		 nodeStack.push(root);
		 while (!nodeStack.isEmpty())
		 {
			 currNode = nodeStack.pop();
			 current = levStack.pop();
			 if (max < current)
				max = current;
			//System.out.println(currNode.info + " and at level " + current);
			if (currNode.left != null)
			{
				current++;
				if (currNode.right != null)
				{
					nodeStack.push(currNode.right);
					levStack.push(current);
				}
				nodeStack.push(currNode.left);					 
				levStack.push(current);
			}
			else if (currNode.right != null)
			{
				current++;
				if (currNode.left != null)
				{
					nodeStack.push(currNode.left);
					levStack.push(current);
				}
				nodeStack.push(currNode.right);					 
				levStack.push(current);
			}
		 }
		 //System.out.println("Maximum depth was " + max);
		 return max;
	 }
	
	 public static int minDepth(myNode root) 
	 {
		 int min, current;
		 myNode currNode;
		 LinkedList<myNode> nodeStack = new LinkedList<myNode>();
		 LinkedList<Integer> levStack = new LinkedList<Integer>();

		 min = Integer.MAX_VALUE;
		 
		 if (root.left == null || root.right == null)
		 {
			 min = 0;
			 //System.out.println("Minimum depth was " + min);
			 return min;
		 }

		 current = 0;
		 nodeStack.push(root);
		 levStack.push(current);
		 
		 while (!nodeStack.isEmpty())
		 {
			currNode = nodeStack.pop();
			current = levStack.pop();
			//System.out.println(currNode.info + " and at level " + current);
			if (currNode.left != null)
			{
				current++;
				if (currNode.right != null)
				{
					nodeStack.push(currNode.right);
					levStack.push(current);
				}
				nodeStack.push(currNode.left);					 
				levStack.push(current);
			}
			else if (currNode.right != null)
			{
				current++;
				if (currNode.left != null)
				{
					nodeStack.push(currNode.left);
					levStack.push(current);
				}
				nodeStack.push(currNode.right);					 
				levStack.push(current);
			}
			else
			{
				if (min > current)
					min = current;
			}
		 }
		 //System.out.println("Minimum depth was " + min);
		 return min;
	 }
	
	 public static boolean isBalanced(myNode root)
	 {
		 boolean results = true;    //Assume innocent until proven guilty
		 int max, min;
		 
		 max = maxDepth(root);
		 min = minDepth(root);

		 if ((max - min) > 1 )
			 results = false;     //Guilty
		 return (results);
	 }

	
	
	public static void main(String[] args) 
	{
		String fname, tempWord; 
		FileReader fin;
		
		myTree<String> anotherTree;

		anotherTree = new myTree<String>();
	    	    
	    anotherTree.add("e");
	    anotherTree.add("b");
	    
	    System.out.println("Check #1 balanced (true): " + isBalanced(anotherTree.root) );	
	    
	    anotherTree.add("a");
	    anotherTree.add("c");
	    
	    System.out.println("Check #2 balanced (false): " + isBalanced(anotherTree.root) );	
	    
	    anotherTree.add("h");

	    System.out.println("Check #3 balanced (true): " + isBalanced(anotherTree.root) );	

	    anotherTree.add("d");

	    System.out.println("Check #4 balanced (false): " + isBalanced(anotherTree.root) );	

	    anotherTree.add("g");
	    anotherTree.add("i");
	    anotherTree.add("f");

	    System.out.println("Check #5 balanced (true): " + isBalanced(anotherTree.root) );	
	    
	    anotherTree.add("j");
	    anotherTree.add("k");
	    anotherTree.add("l");
	    
	    System.out.println("Check #6 balanced (false): " + isBalanced(anotherTree.root) );	



	}		    
		

}
