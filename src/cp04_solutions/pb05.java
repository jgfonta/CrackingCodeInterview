package cp04_solutions;

//4.5 Write an algorithm to find the ‘next’ node (i.e., in-order successor) 
//of a given node in a binary search tree where each node has a link to its parent.
//_
//________________________________________________________________pg 127

//We approach this problem by thinking very, very carefully about what happens on an 
//in-order traversal. On an in-order traversal, we visit X.left, then X, then X.right.
//So, if we want to find X.successor(), we do the following:
//1. If X has a right child, then the successor must be on the right side of X 
//(because of the order in which we visit nodes). Specifically, the left-most child 
//must be the first node visited in that subtree.
//2. Else, we go to X’s parent (call it P).
//2.a. If X was a left child (P.left = X), then P is the successor of X
//2.b. If X was a right child (P.right = X), then we have fully visited P, so we call successor(P).
//
//1 public static TreeNode inorderSucc(TreeNode e) {
//2 if (e != null) {
//3 TreeNode p;
//4 // Found right children -> return 1st inorder node on right
//5 if (e.parent == null || e.right != null) {
//6 p = leftMostChild(e.right);
//7 } else {
//8 // Go up until we’re on left instead of right (case 2b)
//9 while ((p = e.parent) != null) {
//10 if (p.left == e) {
//11 break;
//12 }
//13 e = p;
//14 }
//15 }
//16 return p;
//17 }
//18 return null;
//19 }
//20
//21 public static TreeNode leftMostChild(TreeNode e) {
//22 if (e == null) return null;
//23 while (e.left != null) e = e.left;
//24 return e;
//25 }


public class pb05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
