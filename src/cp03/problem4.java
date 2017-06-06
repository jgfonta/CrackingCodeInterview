package cp03;
import java.util.*;
//3.4 In the classic problem of the Towers of Hanoi, you have 3 rods and N disks of 
//different sizes which can slide onto any tower. The puzzle starts with disks sorted 
//in ascending order of size from top to bottom (e.g., each disk sits on top of an even 
//larger one). You have the following constraints:
//(A) Only one disk can be moved at a time.
//(B) A disk is slid off the top of one rod onto the next rod.
//(C) A disk can only be placed on top of a larger disk.
//Write a program to move the disks from the first rod to the last using Stacks.

public class problem4 {

	LinkedList<Integer> poleOne;
	LinkedList<Integer> poleTwo;
	LinkedList<Integer> poleThree;
	
	
	static final int MAXDISKS = 5;
	
	public problem4()
	{
		poleOne = new LinkedList<Integer>();
		poleTwo = new LinkedList<Integer>();
		poleThree = new LinkedList<Integer>();
		
		//Initialize first pole with n entries
		for (int i = MAXDISKS; i > 0; i--)
		{
			poleOne.add(i);			
		}
		
	}
	
	
	public void moveDisk(LinkedList<Integer> start, LinkedList<Integer> aux, LinkedList<Integer> dest)
	{
		Integer temp = start.pop();
		// Base case - Move one ring
		if (start.size() == 0)
		{
			dest.push(temp);
		}
		else
		{
	      // Move n - 1 rings from starting peg to auxiliary peg
		  moveDisk(start,dest,aux);
	      // Move nth ring from starting peg to ending peg
		  dest.push(aux.pop());
	      // Move n - 1 rings from auxiliary peg to ending peg
		  moveDisk(aux,start,dest);
		}
	}
	
	  public static void doTowers(
		         int n,              // Number of rings to move
		         int startPeg,       // Peg containing rings to move
		         int auxPeg,         // Peg holding rings temporarily
		         int endPeg      )   // Peg receiving rings being moved
		  {
		    if (n == 1) // Base case - Move one ring
		      System.out.println("Move ring " + n + " from peg " + startPeg
		                          + " to peg " + endPeg);
		    else
		    {
		      // Move n - 1 rings from starting peg to auxiliary peg
		      doTowers(n - 1, startPeg, endPeg, auxPeg);

		      // Move nth ring from starting peg to ending peg
		      System.out.println("Move ring " + n + " from peg " + startPeg
		                          + " to peg " + endPeg);
		 
		      // Move n - 1 rings from auxiliary peg to ending peg
		      doTowers(n - 1, auxPeg, startPeg, endPeg);
		    }
		  }
	
	
	public void printPoles()
	{
		int height = 0;
		Integer[]pole1, pole2, pole3;
		
		pole1 = null;
		pole2 = null;
		pole3 = null;
		
		if (poleOne != null)
			pole1 = poleOne.toArray(new Integer[0]);
		if (poleTwo != null)
			pole2 = poleTwo.toArray(new Integer[0]);
		if (poleThree != null)
			pole3 = poleThree.toArray(new Integer[0]);
		
		if (pole1 != null && height < pole1.length)
			height = pole1.length;
		if (pole2 != null && height < pole2.length)
			height = pole2.length;
		if (pole3 != null && height < pole3.length)
			height = pole3.length;

		
		for (int i = height; i > 0; i--)
		{
			if (pole1 != null && i <= pole1.length)
				System.out.print("  " + pole1[i-1]);
			else 
				System.out.print("  |");
			System.out.print("\t");
			if (pole2 != null && i <= pole2.length)
				System.out.print("  " + pole2[i-1]);
			else 
				System.out.print("  |");
			System.out.print("\t");
			if (pole3 != null && i <= pole3.length)
				System.out.print("  " + pole3[i-1]);
			else 
				System.out.print("  |");
			System.out.print("\n");
		}
		
		System.out.println("Pole 1\tPole 2\tPole 3");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		problem4 myProblem = new problem4();
				
		myProblem.printPoles();
		

	}

}
