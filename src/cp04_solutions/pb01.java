package cp04_solutions;


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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
