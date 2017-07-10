package cp04;

import java.io.FileReader;
import java.util.Scanner;
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
		 return 0;
	 }
	
	 public static int minDepth(myNode root) 
	 {
		 return 0;
	 }
	
	 public static boolean isBalanced(myNode root)
	 {
		 boolean results = true;    //Assume innocent until proven guilty
		 int max, current;
		 myNode currNode = root;
		 
		 max = 0;
		 current = 0;
		 
		 while (currNode != null)
		 {
			 max++;
			 if ()
			 currNode = currNode.getLeft();
			 
		 }
		 
		 return results;
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
	    
	    System.out.println("Check #2 balanced (true): " + isBalanced(anotherTree.root) );	
	    
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

}
