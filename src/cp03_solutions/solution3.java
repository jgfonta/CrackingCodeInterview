package cp03_solutions;

//3.3 Imagine a (literal) stack of plates. If the stack gets too high, 
//it might topple. Therefore, in real life, we would likely start a new 
//stack when the previous stack exceeds some threshold. Implement a data 
//structure SetOfStacks that mimics this. SetOfStacks should be composed of 
//several stacks, and should create a new stack once the previous one 
//exceeds capacity. SetOfStacks.push() and SetOfStacks.pop() should behave 
//identically to a single stack (that is, pop() should return the same 
//		values as it would if there were just a single stack).
//FOLLOW UP
//Implement a function popAt(int index) which performs a pop operation on a specific sub-stack.
//pg 52
//SOLUTION
//In this problem, we’ve been told what our data structure should look like:
//1 class SetOfStacks {
//2 ArrayList<Stack> stacks = new ArrayList<Stack>();
//3 public void push(int v) { ... }
//4 public int pop() { ... }
//5 }
//We know that push() should behave identically to a single stack, which means 
//that we need push() to call push on the last stack. We have to be a bit careful 
//here though: if the last stack is at capacity, we need to create a new stack. 
//Our code should look something like this:
//1 public void push(int v) {
//2 Stack last = getLastStack();
//3 if (last != null && !last.isAtCapacity()) { // add to last stack
//4 last.push(v);
//5 } else { // must create new stack
//6 Stack stack = new Stack(capacity);
//7 stack.push(v);
//8 stacks.add(stack);
//9 }
//10 }
//What should pop() do? It should behave similarly to push(), in that it should 
//operate on the last stack. If the last stack is empty (after popping), then we 
//should remove it from the list of stacks.
//1 public int pop() {
//2 Stack last = getLastStack();
//3 int v = last.pop();
//4 if (last.size == 0) stacks.remove(stacks.size() - 1);
//5 return v;
//6 }
//
//What about the follow up question? This is a bit trickier to implement, but 
//essentially we should imagine a “rollover” system. If we pop an element 
//from stack 1, we need to remove the bottom of stack 2 and push it onto stack 1. 
//We then need to rollover from stack 3 to stack 2, stack 4 to stack 3, etc.
//NOTE: You could make an argument that, rather than “rolling over,” we should be 
//OK with some stacks not being at full capacity. This would improve the time complexity 
//(by a fair amount, with a large number of elements), but it might get us into tricky 
//situations later on if someone assumes that all stacks (other than the last) 
//operate at full capacity. There’s no “right answer” here; discuss this 
//trade-off with your interviewer!
//1 public class SetOfStacks {
//2 ArrayList<Stack> stacks = new ArrayList<Stack>();
//3 public int capacity;
//4 public SetOfStacks(int capacity) { this.capacity = capacity; }
//5
//6 public Stack getLastStack() {
//7 if (stacks.size() == 0) return null;
//8 return stacks.get(stacks.size() - 1);
//9 }
//10
//11 public void push(int v) { /* see earlier code */ }
//12 public int pop() {
//13 Stack last = getLastStack();
//14 System.out.println(stacks.size());
//15 int v = last.pop();
//16 if (last.size == 0) stacks.remove(stacks.size() - 1);
//17 return v;
//18 }
//19
//20 public int popAt(int index) {
//21 return leftShift(index, true);
//22 }
//23
//24 public int leftShift(int index, boolean removeTop) {
//25 Stack stack = stacks.get(index);
//26 int removed_item;
//27 if (removeTop) removed_item = stack.pop();
//28 else removed_item = stack.removeBottom();
//29 if (stack.isEmpty()) {
//30 stacks.remove(index);
//31 } else if (stacks.size() > index + 1) {
//32 int v = leftShift(index + 1, false);
//33 stack.push(v);
//34 }
//35 return removed_item;
//36 }
//37 }
//38
//39 public class Stack {
//40 private int capacity;
//41 public Node top, bottom;
//42 public int size = 0;
//43
//44 public Stack(int capacity) { this.capacity = capacity; }
//45 public boolean isAtCapacity() { return capacity == size; }
//46
//47 public void join(Node above, Node below) {
//48 if (below != null) below.above = above;
//49 if (above != null) above.below = below;
//50 }
//51
//52 public boolean push(int v) {
//53 if (size >= capacity) return false;
//54 size++;
//55 Node n = new Node(v);
//56 if (size == 1) bottom = n;
//57 join(n, top);
//58 top = n;
//59 return true;
//60 }
//61
//62 public int pop() {
//63 Node t = top;
//64 top = top.below;
//65 size--;
//66 return t.value;
//67 }
//68
//69 public boolean isEmpty() { return size == 0; }
//70 public int removeBottom() {
//71 Node b = bottom;
//72 bottom = bottom.above;
//73 if (bottom != null) bottom.below = null;
//74 size--;
//75 return b.value;
//76 }
//77 }

public class solution3 {

}
