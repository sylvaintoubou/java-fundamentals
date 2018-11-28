package seven.lesson22;

public class MySinglyLinkedList<T> {

	private String listName;
	private Node<T> currentNode, firstNode;
	
	
	public MySinglyLinkedList() {
		this("Default List");
		
	}
	
	public MySinglyLinkedList(String listName) {
		super();
		this.listName = listName;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}
	
	public Node<T> getFirstNode() {
		return firstNode;
	}

	public Node<T> getCurrentNode() {
		return currentNode;
	}

	public void setCurrentNode(Node<T> currentNode) {
		this.currentNode = currentNode;
	}

	public void setFirstNode(Node<T> firstNode) {
		this.firstNode = firstNode;
	}

	public void insertNodeFront(Node<T> item) {
		if(listIsEmpty())
			currentNode = firstNode = item;
		else {
			currentNode.setNextNode(item);
			currentNode = item;
		}
	}
	
	public void removeNodeFront() {
		if(firstNode == null)
			System.out.println("List is  Empty");
		else
			firstNode = firstNode.getNextNode();
	}
	
	public void printList() {
		System.out.println(listName);
		currentNode = firstNode;
		while(firstNode != null) {
			System.out.println(firstNode.getData());
			firstNode = firstNode.getNextNode();
		}
		firstNode = currentNode;
		
	}

	private boolean listIsEmpty() {
		return currentNode == null;
	}
}
