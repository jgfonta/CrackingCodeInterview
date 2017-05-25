package cp02_solutions;

//SOLUTION 
//If we can use a buffer, we can keep track of elements in a hashtable and remove any dups:
//1 public static void deleteDups(LinkedListNode n) {
//2 Hashtable table = new Hashtable();
//3 LinkedListNode previous = null;
//4 while (n != null) {
//5 if (table.containsKey(n.data)) previous.next = n.next;
//6 else {
//7 table.put(n.data, true);
//8 previous = n;
//9 }
//10 n = n.next;
//11 }
//12 }
//Without a buffer, we can iterate with two pointers: “current” does a normal iteration, while 
//“runner” iterates through all prior nodes to check for dups. Runner will only see one dup per node, 
//because if there were multiple duplicates they would have been removed already.
//1 public static void deleteDups2(LinkedListNode head) {
//2 if (head == null) return;
//3 LinkedListNode previous = head;
//4 LinkedListNode current = previous.next;
//5 while (current != null) {
//6 LinkedListNode runner = head;
//7 while (runner != current) { // Check for earlier dups
//8 if (runner.data == current.data) {
//9 LinkedListNode tmp = current.next; // remove current
//10 previous.next = tmp;
//11 current = tmp; // update current to next node
//12 break; // all other dups have already been removed
//13 }
//14 runner = runner.next;
//15 }
//16 if (runner == current) { // current not updated - update now
//17 previous = current;
//18 current = current.next;
//19 }
//20 }
//21 }

public class problem1 {

	
}
