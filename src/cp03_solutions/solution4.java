package cp03_solutions;

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
//1 public static void main(String[] args)
//2 int n = 5;
//3 Tower[] towers = new Tower[n];
//4 for (int i = 0; i < 3; i++) towers[i] = new Tower(i);
//5 for (int i = n - 1; i >= 0; i--) towers[0].add(i);
//6 towers[0].moveDisks(n, towers[2], towers[1]);
//7 }
//8
//9 public class Tower {
//10 private Stack<Integer> disks;
//11 private int index;
//12 public Tower(int i) {
//13 disks = new Stack<Integer>();
//14 index = i;
//15 }
//16
//17 public int index() {
//18 return index;
//19 }
//20
//21 public void add(int d) {
//22 if (!disks.isEmpty() && disks.peek() <= d) {
//23 System.out.println(“Error placing disk ” + d);
//24 } else {
//25 disks.push(d);
//26 }
//27 }
//28
//29 public void moveTopTo(Tower t) {
//30 int top = disks.pop();
//31 t.add(top);
//32 System.out.println(“Move disk ” + top + “ from ” + index() +
//33 “ to ” + t.index());
//34 }
//35
//36 public void print() {
//37 System.out.println(“Contents of Tower “ + index());
//38 for (int i = disks.size() - 1; i >= 0; i--) {
//39 System.out.println(“ “ + disks.get(i));
//40 }
//41 }
//42
//43 public void moveDisks(int n, Tower destination, Tower buffer) {
//44 if (n > 0) {
//45 moveDisks(n - 1, buffer, destination);
//46 moveTopTo(destination);
//47 buffer.moveDisks(n - 1, destination, this);
//48 }
//49 }
//50 }

	

public class solution4 {

}
