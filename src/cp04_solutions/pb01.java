package cp04_solutions;

import java.io.FileReader;
import java.util.Comparator;
import java.util.Scanner;
import cp04.*;


//4.1 Implement a function to check if a tree is balanced. For the purposes of this question, 
//a balanced tree is defined to be a tree such that no two leaf nodes differ in distance from 
//the root by more than one.
//_
//________________________________________________________________pg 123

//The idea is very simple: the difference of min depth and max depth should not exceed 1, 
//since the difference of the min and the max depth is the maximum distance difference 
//possible in the tree.
//1 public static int maxDepth(TreeNode root) {
//2 if (root == null) {
//3 return 0;
//4 }
//5 return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
//6 }
//7
//8 public static int minDepth(TreeNode root) {
//9 if (root == null) {
//10 return 0;
//11 }
//12 return 1 + Math.min(minDepth(root.left), minDepth(root.right));
//13 }
//14
//15 public static boolean isBalanced(TreeNode root){
//16 return (maxDepth(root) - minDepth(root) <= 1);
//17 }

public class pb01 {

	 public static int maxDepth(myNode root) 
	 {
		 if (root == null) 
		 {
			 return 0;
		 }
		 return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	 }
	
	 public static int minDepth(myNode root) 
	 {
		 if (root == null) 
		 {
			 return 0;
		 }
		 return (1 + Math.min(minDepth(root.left), minDepth(root.right)));
	 }
	
	 public static boolean isBalanced(myNode root)
	 {
		 int max,min;
		 max = maxDepth(root);
		 min = minDepth(root);
		 return ((maxDepth(root) - minDepth(root)) <= 1);
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
