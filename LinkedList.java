/**
 * 
 * @author shand
 *
 */
public class LinkedList 
{
	
	Node head;
	int length;
	Node tail;
	
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}
	/**
	 * returns a boolean to check if the spot is empty
	 * @return
	 */
	
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}
	/**
	 * returns the front node in the first
	 * @return
	 */
	
	public Node getList()
	{
		return head;
	}
	/**
	 * Inserting a node inside the list
	 * @param aNode Node type
	 */
	
	public void addNode(Node aNode)
	{
		if (isEmpty() ) 
		{
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}
	/**
	 * 
	 * @param aNode selecting a node to remove from the list
	 * @return returning the empty slot
	 */
	public Node removeNode(Node aNode)
	{
		Node temp = head;
		
		head = head.nextNode;
		
		return temp;
		
		
	}
	

	

}
