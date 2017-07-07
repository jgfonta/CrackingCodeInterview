package cp04_solutions;

//4.4 Given a binary search tree, design an algorithm which creates a 
//linked list of all the nodes at each depth (i.e., if you have a tree 
//with depth D, you’ll have D linked lists).
//_
//________________________________________________________________pg 126

//We can do a simple level by level traversal of the tree, with a slight 
//modification of the breath-first traversal of the tree.
//In a usual breath first search traversal, we simply traverse the nodes 
//without caring which level we are on. In this case, it is critical to know 
//the level. We thus use a dummy node to indicate when we have finished 
//one level and are starting on the next.
//
//1 ArrayList<LinkedList<TreeNode>> findLevelLinkList(TreeNode root) {
//2 int level = 0;
//3 ArrayList<LinkedList<TreeNode>> result =
//4 new ArrayList<LinkedList<TreeNode>>();
//5 LinkedList<TreeNode> list = new LinkedList<TreeNode>();
//6 list.add(root);
//7 result.add(level, list);
//8 while (true) {
//9 list = new LinkedList<TreeNode>();
//10 for (int i = 0; i < result.get(level).size(); i++) {
//11 TreeNode n = (TreeNode) result.get(level).get(i);
//12 if (n != null) {
//13 if(n.left != null) list.add(n.left);
//14 if(n.right!= null) list.add(n.right);
//15 }
//16 }
//17 if (list.size() > 0) {
//18 result.add(level + 1, list);
//19 } else {
//20 break;
//21 }
//22 level++;
//23 }
//24 return result;
//25 }

public class pb04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
