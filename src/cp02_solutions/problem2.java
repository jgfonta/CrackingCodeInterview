package cp02_solutions;

//SOLUTION 
//Note: This problem screams recursion, but we’ll do it a different way because it’s trickier. 
//In a question like this, expect follow up questions about the advantages of recursion vs iteration.
//Assumption: The minimum number of nodes in list is n.
//Algorithm:
//1. Create two pointers, p1 and p2, that point to the beginning of the node.
//2. Increment p2 by n-1 positions, to make it point to the nth node from the beginning 
//   (to make the distance of n between p1 and p2).
//3. Check for p2->next == null if yes return value of p1, otherwise increment p1 and p2. If next of 
//  p2 is null it means p1 points to the nth node from the last as the distance between the two is n.
//4. Repeat Step 3.
//1 LinkedListNode nthToLast(LinkedListNode head, int n) {
//2 if (head == null || n < 1) {
//3 return null;
//4 }
//5 LinkedListNode p1 = head;
//6 LinkedListNode p2 = head;
//7 for (int j = 0; j < n - 1; ++j) { // skip n-1 steps ahead
//8 if (p2 == null) {
//9 return null; // not found since list size < n
//10 }
//11 p2 = p2.next;
//12 }
//13 while (p2.next != null) {
//14 p1 = p1.next;
//15 p2 = p2.next;
//16 }
//17 return p1;
//18 }
public class problem2 {

	
//	LinkedListNode nthToLast(LinkedListNode head, int n) 
//	{
//		if (head == null || n < 1) 
//		{
//			return null;
//		}
//		
//		LinkedListNode p1 = head;
//		LinkedListNode p2 = head;
//		
//		for (int j = 0; j < n - 1; ++j)  // skip n-1 steps ahead
//		{
//			if (p2 == null) 
//			{
//				return null; // not found since list size < n
//			}
//			p2 = p2.next;
//		}
//		
//		while (p2.next != null) 
//		{
//			p1 = p1.next;
//			p2 = p2.next;
//		}
//		return p1;
//	}
	
}
