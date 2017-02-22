public class LLIntegerNode {
	
	private int data;
	private LLIntegerNode next;
	private LLIntegerNode prev;
	
	public LLIntegerNode(int data)
	{			
		this.data = data;
	}
	public LLIntegerNode(int data, LLIntegerNode prev)
	{
		this.prev = prev;
		this.data = data;
	}
	
	public void setInfo(int data)
	{
		this.data = data;
	}
	
	public int getInfo()
	{
		return this.data;
	}
	
	public void setLink(LLIntegerNode next)
	{
		this.next = next;
	}
	
	public LLIntegerNode getLink()
	{
		return this.next;
	}
	
	public LLIntegerNode getPrev()
	{
		return this.prev;
	}
	
	public void setPrev(LLIntegerNode prev)
	{
		this.prev = prev;
	}
}