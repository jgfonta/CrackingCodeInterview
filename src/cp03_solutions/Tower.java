package cp03_solutions;

import java.util.Stack;

import cp03_solutions.*;

public class Tower {
	
	
		 private Stack<Integer> disks;
		 private int index;
		 
		 public Tower(int i) 
		 {
			 disks = new Stack<Integer>();
			 index = i;
		 }
	
		 //Returns the tower number (fixed constant)
		 public int index() 
		 {
			 return index+1;
		 }
	
		 public void add(int d) 
		 {
			 if (!disks.isEmpty() && disks.peek() <= d) 
			 {
				 System.out.println("Error placing disk " + d);
			 } 
			 else 
			 {
				 disks.push(d);
			 }
		 }
		
		 public void moveTopTo(Tower t) 
		 {
			 int top = disks.pop();
			 t.add(top);
			 System.out.println("Move disk " + top + " from Tower(" + index() +
			 ") to Tower(" + t.index() + ")");
		 }
	
		 public void print() 
		 {
			 System.out.println("Contents of Tower " + index());
			 for (int i = disks.size() - 1; i >= 0; i--) 
			 {
				 System.out.println(" " + disks.get(i));
			 }
		 }
		
		 public void moveDisks(int n, Tower destination, Tower buffer) 
		 {
			 if (n > 0) 
			 {
				 moveDisks(n - 1, buffer, destination);
				 moveTopTo(destination);
				 buffer.moveDisks(n - 1, destination, this);
			 }
		 }
		 


}
