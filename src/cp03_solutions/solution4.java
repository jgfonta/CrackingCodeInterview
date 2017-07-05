package cp03_solutions;

import java.util.Stack;

//3.4 In the classic problem of the Towers of Hanoi, you have 3 rods and N disks of 
//different sizes which can slide onto any tower. The puzzle starts with disks sorted 
//in ascending order of size from top to bottom (e.g., each disk sits on top of an 
//		even larger one). You have the following constraints:
//(A) Only one disk can be moved at a time.
//(B) A disk is slid off the top of one rod onto the next rod.
//(C) A disk can only be placed on top of a larger disk.
//Write a program to move the disks from the first rod to the last using Stacks.
//pg 52
//SOLUTION
//We need to move N disks from Rod 1 to Rod 3, but let’s start from the beginning. 
//Moving the top disk is easy - we just move it to Disk 3.
//Can we move the top two disks? Yes:
//1. Move Disk 1 from Rod 1 to Rod 2
//2. Move Disk 2 from Rod 1 to Rod 3
//3. Move Disk 1 from Rod 2 to Rod 3
//Can we move the top three disks?
//1. We know we can move the top two disks around from one Rod to another 
//(as shown earlier), so let’s assume we have moved Disk 1 and 2 to Rod 2.
//2. Move Disk 3 to Rod 3
//3. Again we know we can move the top two disks around, so let’s move them from 
//Rod 2 to Rod 3.
//This approach leads to a natural recursive algorithm:


public class solution4 {
	
	//Solution is in Tower class
	
	 public static void main(String[] args)
	 {
		 int n = 5;

		 //Build 3 towers
		 Tower[] towers = new Tower[3];
		 for (int i = 0; i < 3; i++) 
			 towers[i] = new Tower(i);

		 //Fill tower 1 with data
		 for (int i = n ; i > 0; i--) 
			 towers[0].add(i);
		 
		 //Start to move the data between towers
		 towers[0].moveDisks(n, towers[2], towers[1]);
	 }


}
