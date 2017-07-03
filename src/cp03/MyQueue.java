package cp03;
import java.util.*;
//3.5 Implement a MyQueue class which implements a queue using two stacks.

//A queue is FIFO
//A stack is LIFO
//


public class MyQueue<T> {
	
	Stack<T> stack1;
	Stack<T> stack2;
	
	
	public MyQueue()
	{
		stack1 = new Stack<T>();
		stack2 = new Stack<T>();
	}
	
	public boolean isEmpty() 
	{
		return (stack1.isEmpty() & stack2.isEmpty());
	}

	public int size() 
	{
		return (stack1.size() + stack2.size());
	}

	public boolean add(T arg0)
	{
		stack1.push(arg0);
		return true;
	}

	public T peek() 
	{
		//If stack2 isn't empty then return top entry
		if (!stack2.empty())
			return stack2.peek();
		
		//Put items on stack 2 in reverse order pop & push
		while (!stack1.empty())
		{
			stack2.push(stack1.pop());
		}
		return stack2.peek();
		
	}
	

	public T remove() 
	{
		if (!stack2.empty())
			return stack2.pop();
		
		while (!stack1.empty())
		{
			stack2.push(stack1.pop());
		}
		
		return stack2.pop();
		
	}

	
}
