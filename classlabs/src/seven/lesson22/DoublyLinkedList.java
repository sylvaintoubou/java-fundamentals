package seven.lesson22;

public class DoublyLinkedList<T> {
	
	private String listName;
	private Node<T> firstNode, lastNode, temporal;
	
	
	// Constructors
	public DoublyLinkedList() {
		this("Default List");
	}
	
	public DoublyLinkedList(String listName) {
		this.listName = listName;
	}

	
	// Getters
	public String getListName() {
		return listName;
	}
	
	public Node<T> getFirstNode() {
		return firstNode;
	}
	
	public Node<T> getLastNode() {
		return lastNode;
	}
	
	// Setters
	public void setListName(String listName) {
		this.listName = listName;
	}
	
	public void setFirstNode(Node<T> firstNode) {
		this.firstNode = firstNode;
	}
	
	public void setLastNode(Node<T> lastNode) {
		this.lastNode = lastNode;
	}

	//toString
	@Override
	public String toString() {
		return "DoublyLinkedList [listName=" + listName + ", firstNode=" + firstNode + ", lastNode=" + lastNode + "]";
	}
	
	
	// Insert Node on top
	public void insertNodeOnTop(Node<T> item) {
		if(listIsEmpty())
			lastNode = firstNode = item;
		else {
			item.setNextNode(lastNode);
			//lastNode.setNextNode(item);
			lastNode = item;
		}
	}
	
	// Remove from top
	public void removeNodeFromTop() {
		if(lastNode == null)
			System.out.println("List is  Empty");
		else {
			lastNode = lastNode.getPreviousNode();
		}
			
	}
	
	public void printStack() {
		System.out.println(listName);
		temporal = lastNode;
		//lastNode = firstNode;
		while(lastNode != null) {	
			System.out.println(lastNode );
			lastNode = lastNode.getNextNode();
		}
		
		lastNode = temporal;
		
	}
	
	
	public void printQueue() {
		System.out.println(listName);
		temporal = firstNode;
		while(firstNode != null) {
			System.out.println(firstNode.getData());
			firstNode = firstNode.getPreviousNode();
		}
		firstNode = temporal;
		
	}

	private boolean listIsEmpty() {
		return lastNode == null;
	}
	
	
	

}
