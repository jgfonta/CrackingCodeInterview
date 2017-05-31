package cp03;

public class ArrayNode {

	private int value;
	private int offset;
	
	public ArrayNode()
	{
		value = 0;
		offset = -1;
	}
	
	public ArrayNode(int value, int offset)
	{
		this.value = value;
		this.offset = offset;
	}
	
	public ArrayNode(int value)
	{
		this.value = value;
		offset = -1;
	}
	
	public boolean setNext(int offset)
	{
		this.offset = offset;
		return true;
	}
	
	public int getNext()
	{
		return offset;
	}
	
	public boolean hasNext()
	{
		return (offset != -1);
	}
	
	public int getData()
	{
		return value;
	}

	public boolean setData(int value)
	{
		this.value = value;
		return true;
	}
	
}
