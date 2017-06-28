package cp03;

import java.util.*;

//3.3 Imagine a (literal) stack of plates. If the stack gets too high, it might 
//topple. Therefore, in real life, we would likely start a new stack when the 
//previous stack exceeds some threshold. Implement a data structure SetOfStacks 
//that mimics this. SetOfStacks should be composed of several stacks, and should 
//create a new stack once the previous one exceeds capacity. SetOfStacks.push() 
//and SetOfStacks.pop() should behave identically to a single stack (that is, pop()
//should return the same values as it would if there were just a single stack).
//FOLLOW UP
//Implement a function popAt(int index) which performs a pop operation on a specific
//sub-stack.
//_
public class SetOfStacks {
	
	ArrayList<LinkedList<Integer>> stacks = new ArrayList<LinkedList<Integer>>();
	public int capacity;
	
	
	public SetOfStacks(int capacity) 
	{ 
		this.capacity = capacity; 
	}
	
	public LinkedList<Integer> getLastStack() 
	{
		if (stacks.size() == 0) 
			return null;
		return stacks.get(stacks.size() - 1);
	}
	
	public void push(int v) 
	{
		LinkedList<Integer> last = getLastStack();
		
		if (last != null && last.size() != capacity) 
		{ 
			last.push(v);
		} 
		else 
		{ 
			LinkedList<Integer> stack = new LinkedList<Integer>();
			stack.push(v);
			stacks.add(stack);
		}
	}
	
	public boolean hasNext()
	{
		return (stacks.size() != 0);
	}
	
	public int pop() 
	{
		LinkedList<Integer> last = getLastStack();

		System.out.println(stacks.size());
		int v = last.pop();
		if (last.size() == 0) 
			stacks.remove(stacks.size() - 1);
		return v;
	}
	
	 public int popAt(int index) 
	 {
		 return leftShift(index, true);
	 }
	
	 public int leftShift(int index, boolean removeTop) 
	 {
		 LinkedList<Integer> stack = stacks.get(index);
		 int removed_item;
		 if (removeTop)
			 removed_item = stack.pop();
		 else 
			 removed_item = stack.removeLast();
		 
		 
		 if (stack.isEmpty()) 
		 {
			 stacks.remove(index);
		 } 
		 else if (stacks.size() > index + 1) 
		 {
			 int v = leftShift(index + 1, false);
			 stack.push(v);
		 }
		 
		 return removed_item;
	}
}
	
