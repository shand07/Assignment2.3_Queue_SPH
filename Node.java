/**
 * 
 * @author shand
 *
 * @param <T>
 */
class Node<T>

{
	
	T data;
	Node nextNode;
	public Node()
	{
		nextNode=null;
		data=null;
	}
	
	/**
	 * 
	 * @param data generic data type
	 */
	public void setData(T data) {
		this.data=data;
	}
	/**
	 * 
	 * @return returns the node
	 */
	
	public Node getNode() {
		return this;
	}
	/**
	 * 
	 * @param nextNode setter for the node
	 */
	
	public void setNextNode(Node nextNode)
	{
		this.nextNode=nextNode;
	}
	/**
	 * ToString Method for Data
	 */
	public String toString()
	{
		return data + "";
	}
	
}
