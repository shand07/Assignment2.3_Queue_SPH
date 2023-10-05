/**
 * 
 * @author shand
 *
 */

public class Queue 
{

	LinkedList myLinkedList = new LinkedList();
	
	Node myNode = new Node();
	
	
	/**
	 * Method that adds an object to the back of the line.
	 */
	public void enQueue(Node myNode)
	{
		myLinkedList.addNode(myNode);
		System.out.println(myNode+ " has got in line.");
	}
	/**
	 * Method that removes an object from the front of the line.
	 */
	public Node deQueue(Node myNode)
	{
		myLinkedList.removeNode(myNode);
		
		System.out.println(myNode+ " has been served.");
		
		return myNode;
		
		
	}
	
	
	/**
	 * Method for printing out the queue and who is in line currently
	 */
	public void printQueue() 
	{
        Node current = myLinkedList.getList();
        System.out.println("Currently in Line: ");

        while (current != null) 
        {
            System.out.println(current.data + " ");
            current = current.nextNode;
        }
	}
	
	/**
	 * ToString Method for Node
	 */
	public String toString()
	{
		return myNode + "";
	}
	
	
	
}
