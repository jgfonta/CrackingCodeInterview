package cp04_solutions;

//4.8 You are given a binary tree in which each node contains a value. 
//Design an algorithm to print all paths which sum up to that value. 
//Note that it can be any path in the tree - it does not have to start at the root.
//_
//________________________________________________________________pg 131

//Let’s approach this problem by simplifying it. What if the path had to start at the root? 
//In that case, we would have a much easier problem:
//Start from the root and branch left and right, computing the sum thus far on each path. 
//When we find the sum, we print the current path. Note that we don’t stop just because we 
//found the sum. Why? Because we could have the following path 
//(assume we are looking for the sum 5): 2 + 3 + –4 + 3 + 1 + 2. If we stopped once we hit 2 + 3, 
//we’d miss several paths (2 + 3 + -4 + 3 + 1 and 3 + -4 + 3 + 1 + 2). So, we keep going along 
//every possible path.
//Now, what if the path can start anywhere? In that case, we make a small modification. 
//On every node, we look “up” to see if we’ve found the sum. That is—rather than 
//asking “does this node start a path with the sum?,” we ask “does this node complete a path 
//with the sum?”

//1 void findSum(TreeNode head, int sum, ArrayList<Integer> buffer,
//2 int level) {
//3 if (head == null) return;
//4 int tmp = sum;
//5 buffer.add(head.data);
//6 for (int i = level;i >- 1; i--){
//7 tmp -= buffer.get(i);
//8 if (tmp == 0) print(buffer, i, level);
//9 }
//10 ArrayList<Integer> c1 = (ArrayList<Integer>) buffer.clone();
//11 ArrayList<Integer> c2 = (ArrayList<Integer>) buffer.clone();
//12 findSum(head.left, sum, c1, level + 1);
//13 findSum(head.right, sum, c2, level + 1);
//14 }
//15
//16 void print(ArrayList<Integer> buffer, int level, int i2) {
//17 for (int i = level; i <= i2; i++) {
//18 System.out.print(buffer.get(i) + “ ”);
//19 }
//20 System.out.println();
//21 }
//
//
//What is the time complexity of this algorithm? Well, if a node is at level r, we do r amount 
//of work (that’s in the looking “up” step). We can take a guess at O(n lg n) (n nodes, doing an
//average of lg n amount of work on each step), or we can be super mathematical:
//There are 2^r nodes at level r.
//	1*2^1 + 2*2^2 + 3*2^3 + 4*2^4 + ... d * 2^d
//	= sum(r * 2^r, r from 0 to depth)
//	= 2 (d-1) * 2^d + 2
//	n = 2^d ==> d = lg n
//	NOTE: 2^lg(x) = x
//	O(2 (lg n - 1) * 2^(lg n) + 2) = O(2 (lg n - 1) * n ) = O(n lg n)
//Following similar logic, our space complexity is O(n lg n)

public class pb08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
