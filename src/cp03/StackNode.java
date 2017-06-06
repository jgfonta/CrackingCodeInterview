package cp03;

public class StackNode {

	StackNode next;
	int data;
	int min;

	public StackNode(int d) 
	{ 
		data = d; 
		next = null;
		min = d;
	}
	
	@Override
	public String toString()
	{
		return ("Node has " + String.valueOf(data));
	}
	
}
