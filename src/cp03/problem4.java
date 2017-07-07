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

	LinkedList<Integer>[] pole;
	
	
	static final int MAXDISKS = 6;
	static final int NUMPOLES = 3;
	
	int numMoves;
	
	public problem4()
	{
		numMoves = 0;
		pole = new LinkedList[NUMPOLES];
		for (int i = 0; i<NUMPOLES;i++)
		{
			pole[i] = new LinkedList<Integer>();
		}
		
		//Initialize first pole with n entries
		for (int i = MAXDISKS; i > 0; i--)
		{
			pole[0].push(i);			
		}
		
	}
	
	
		
	public void printPoles()
	{

		Integer[][] tempPoles = new Integer[NUMPOLES][];

		if (numMoves > 0 )
			System.out.println("Move #" + numMoves);
		numMoves++;
	
		//Convert to array for each pole
		for (int j = 0; j < NUMPOLES; j++)
		{
			if (!pole[j].isEmpty())
			{
				tempPoles[j] = new Integer [pole[j].size()];
			    pole[j].toArray(tempPoles[j]);
			}
			else
				tempPoles[j] = null;
		}
		
		//Loop through the maximum height of a pole
		for (int i = MAXDISKS - 1; i >= 0; i--)
		{
			//Loop through the poles at this height
			for (int j = 0; j < NUMPOLES; j++)
			{
				if (tempPoles[j] != null && tempPoles[j].length >= (i + 1))
					System.out.print("  " + tempPoles[j][tempPoles[j].length-1-i]);
				else
					System.out.print("  |");
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		
		System.out.println("Pole 1\tPole 2\tPole 3\n");
	}
	
	public void moveIt()
	{
		try
		{
			moveDisk();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void freelarge(LinkedList<Integer> start, LinkedList<Integer> aux,  LinkedList<Integer> dest) throws Exception
	{
		if (!dest.isEmpty() && dest.peek() < start.peek())
			throw new Exception ("Error freelarge 1");
		dest.push(start.pop());
		printPoles();		

		if (!aux.isEmpty() && aux.peek() < start.peek())
			throw new Exception ("Error freelarge 2");

		aux.push(start.pop());
		printPoles();
		
		if (!aux.isEmpty() && aux.peek() < dest.peek())
			throw new Exception ("Error freelarge 3");
		aux.push(dest.pop());
		printPoles();	

	}
	public void moveDisk() throws Exception
	{		
		LinkedList<Integer> start, aux, dest;
					
		int startNdx = 0;
		
		//Loop until all disks transferred to last pole from first pole
		while(pole[2].size() != MAXDISKS)
		{
			start = pole[startNdx % 3];
			aux = pole[(startNdx + 1) % 3];
			dest = pole[(startNdx + 2) % 3];		
			freelarge(start,aux,dest);
			
			//Need to swap differently periodically
			if (start.isEmpty() || (!dest.isEmpty() && dest.peek() < start.peek()))
			{
				//This handles the end case when all members are moved and nothing to do
				if (!dest.isEmpty())
				{
					start.push(dest.pop());
					printPoles();
				}
			}
			else 
			{
				dest.push(start.pop());
				printPoles();
			}
			startNdx++;
		}
	}
	
	public static void main(String[] args) {
		
		problem4 myProblem = new problem4();
				
		myProblem.printPoles();
		myProblem.moveIt();
		

	}

}
