package cp02_solutions;

//SOLUTION 
//The solution to this is to simply copy the data from the next node into this node and then delete the next node.
//NOTE: This problem can not be solved if the node to be deleted is the last node in the linked list. That’s ok—your 
//interviewer wants to see you point that out. You could consider marking it as dummy in that case. 
//This is an issue you should discuss with your interviewer.
//1 public static boolean deleteNode(LinkedListNode n) {
//2 if (n == null || n.next == null) {
//3 return false; // Failure
//4 }
//5 LinkedListNode next = n.next;
//6 n.data = next.data;
//7 n.next = next.next;
//8 return true;
//9 }
public class problem3 {

	
}
