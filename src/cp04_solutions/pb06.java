package cp04_solutions;

//4.6 Design an algorithm and write code to find the first common ancestor of two 
//nodes in a binary tree. Avoid storing additional nodes in a data structure. 
//NOTE: This is not necessarily a binary search tree.
//_
//________________________________________________________________pg 128

//If this were a binary search tree, we could do a modified find on the two nodes and see 
//where the paths diverge. Unfortunately, this is not a binary search tree, so we much try 
//other approaches.
//
//Attempt #1:
//If each node has a link to its parent, we could trace p and q’s paths up until they intersect.
//
//Attempt #2:
//Alternatively, you could follow a chain in which p and q are on the same side. That is, if p and q 
//are both on the left of the node, branch left to look for the common ancestor. When p and q are no 
//longer on the same side, you must have found the first common ancestor.
//1 public Tree commonAncestor(Tree root, Tree p, Tree q) {
//2 if (covers(root.left, p) && covers(root.left, q))
//3 return commonAncestor(root.left, p, q);
//4 if (covers(root.right, p) && covers(root.right, q))
//5 return commonAncestor(root.right, p, q);
//6 return root;
//7 }
//8 private boolean covers(Tree root, Tree p) { /* is p a child of root? */
//9 if (root == null) return false;
//10 if (root == p) return true;
//11 return covers(root.left, p) || covers(root.right, p);
//12 }
//
//What is the running time of this algorithm? One way of looking at this is to see how many times 
//each node is touched. Covers touches every child node, so we know that every single node in the 
//tree must be touched at least once, and many nodes are touched multiple times.
//Attempt #3:
//For any node r, we know the following:
//1. If p is on one side and q is on the other, r is the first common ancestor.
//2. Else, the first common ancestor is on the left or the right side.
//So, we can create a simple recursive algorithm called search that calls search(left side) and 
//search(right side) looking at how many nodes (p or q) are placed from the left side and from the 
//right side of the current node. If there are two nodes on one of the sides, then we have
//to check if the child node on this side is p or q (because in this case the current node is the common ancestor). 
//If the child node is neither p nor q, we should continue to search further (starting from the child).
//If one of the searched nodes (p or q) is located on the right side of the current node, then the 
//other node is located on the other side. Thus the current node is the common ancestor.
//
//1 static int TWO_NODES_FOUND = 2;
//2 static int ONE_NODE_FOUND = 1;
//3 static int NO_NODES_FOUND = 0;
//4
//5 // Checks how many “special” nodes are located under this root
//6 int covers(TreeNode root, TreeNode p, TreeNode q) {
//7 int ret = NO_NODES_FOUND;
//8 if (root == null) return ret;
//9 if (root == p || root == q) ret += 1;
//10 ret += covers(root.left, p, q);
//11 if(ret == TWO_NODES_FOUND) // Found p and q
//12 return ret;
//13 return ret + covers(root.right, p, q);
//14 }
//15
//16 TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//17 if (q == p && (root.left == q || root.right == q)) return root;
//18 int nodesFromLeft = covers(root.left, p, q); // Check left side
//19 if (nodesFromLeft == TWO_NODES_FOUND) {
//20 if(root.left == p || root.left == q) return root.left;
//21 else return commonAncestor(root.left, p, q);
//22 } else if (nodesFromLeft == ONE_NODE_FOUND) {
//23 if (root == p) return p;
//24 else if (root == q) return q;
//25 }
//26 int nodesFromRight = covers(root.right, p, q); // Check right side
//27 if(nodesFromRight == TWO_NODES_FOUND) {
//28 if(root.right == p || root.right == q) return root.right;
//29 else return commonAncestor(root.right, p, q);
//30 } else if (nodesFromRight == ONE_NODE_FOUND) {
//31 if (root == p) return p;
//32 else if (root == q) return q;
//33 }
//34 if (nodesFromLeft == ONE_NODE_FOUND &&
//35 nodesFromRight == ONE_NODE_FOUND) return root;
//36 else return null;
//37 }

public class pb06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
