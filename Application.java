
public class Application 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Queue vegeBurger = new Queue();
		
		Node bill = new Node();
		bill.setData("Bill");
		vegeBurger.enQueue(bill);
		
		Node alice = new Node();
		alice.setData("Alice");
		vegeBurger.enQueue(alice);
		
		Node bob = new Node();
		bob.setData("Bob");
		vegeBurger.enQueue(bob);
		
		vegeBurger.printQueue();
		
		Node jane = new Node();
		jane.setData("Jane");
		vegeBurger.enQueue(jane);
		
		Node hammad = new Node();
		hammad.setData("Hammad");
		vegeBurger.enQueue(hammad);
		
		vegeBurger.printQueue();
		
		vegeBurger.deQueue(bill);
		vegeBurger.deQueue(alice);
		
		vegeBurger.printQueue();
		
		Node jim = new Node();
		jim.setData("Jim");
		vegeBurger.enQueue(jim);
		
		vegeBurger.printQueue();
		
		vegeBurger.deQueue(bob);
		vegeBurger.deQueue(jane);
		
		vegeBurger.printQueue();
		
		
		

	}

}
