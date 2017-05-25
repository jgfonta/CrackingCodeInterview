package cp02_solutions;

//SOLUTION 
//If we move two pointers, one with speed 1 and another with speed 2, they will end up meeting 
//if the linked list has a loop. Why? Think about two cars driving on a track—the faster car 
//will always pass the slower one!
//The tricky part here is finding the start of the loop. Imagine, as an analogy, two people racing 
//around a track, one running twice as fast as the other. If they start off at the same place, 
//when will they next meet? They will next meet at the start of the next lap.
//Now, let’s suppose Fast Runner had a head start of k meters on an n step lap. When will they next 
//meet? They will meet k meters before the start of the next lap. (Why? Fast Runner would have made 
//k + 2(n - k) steps, including its head start, and Slow Runner would have made n - k steps. Both 
//will be k steps before the start of the loop.)
//Now, going back to the problem, when Fast Runner (n2) and Slow Runner (n1) are moving around our 
//circular linked list, n2 will have a head start on the loop when n1 enters. Specifically, it will 
//have a head start of k, where k is the number of nodes before the loop. Since n2 has a head start 
//of k nodes, n1 and n2 will meet k nodes before the start of the loop.
//So, we now know the following:
//1. Head is k nodes from LoopStart (by definition).
//2. MeetingPoint for n1 and n2 is k nodes from LoopStart (as shown above).
//Thus, if we move n1 back to Head and keep n2 at MeetingPoint, and move them both at the same pace, 
//they will meet at LoopStart.


//1 LinkedListNode FindBeginning(LinkedListNode head) {
//2 LinkedListNode n1 = head;
//3 LinkedListNode n2 = head;
//4
//5 // Find meeting point
//6 while (n2.next != null) {
//7 n1 = n1.next;
//8 n2 = n2.next.next;
//9 if (n1 == n2) {
//10 break;
//11 }
//12 }
//13
//14 // Error check - there is no meeting point, and therefore no loop
//15 if (n2.next == null) {
//16 return null;
//17 }
//18
//19 /* Move n1 to Head. Keep n2 at Meeting Point. Each are k steps
//20 /* from the Loop Start. If they move at the same pace, they must
//21 * meet at Loop Start. */
//22 n1 = head;
//23 while (n1 != n2) {
//24 n1 = n1.next;
//25 n2 = n2.next;
//26 }
//27 // Now n2 points to the start of the loop.
//28 return n2;
//29 }

public class problem5 {

	
}
