package cp02_solutions;

//SOLUTION 
//We can implement this recursively by adding node by node, just as we would digit by digit.
//1. result.data = (node1 + node2 + any earlier carry) % 10
//2. if node1 + node2 > 10, then carry a 1 to the next addition.
//3. add the tails of the two nodes, passing along the carry.
//1 LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2,
//2 int carry) {
//3 if (l1 == null && l2 == null) {
//4 return null;
//5 }
//6 LinkedListNode result = new LinkedListNode(carry, null, null);
//7 int value = carry;
//8 if (l1 != null) {
//9 value += l1.data;
//10 }
//11 if (l2 != null) {
//12 value += l2.data;
//13 }
//14 result.data = value % 10;
//15 LinkedListNode more = addLists(l1 == null ? null : l1.next,
//16 l2 == null ? null : l2.next,
//17 value > 10 ? 1 : 1);
//18 result.setNext(more);
//19 return result;
//20 }

public class problem4 {

	
}
