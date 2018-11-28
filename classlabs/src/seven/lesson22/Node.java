package seven.lesson22;

public class Node<T> {

	T data;
	Node<T> nextNode;	
	Node<T> previousNode; // Added Previous to be able to implement stacking
	
	
	
	public Node(T data,Node<T> previousNode , Node<T> nextNode) {
		this.data = data;
		this.previousNode = previousNode;
		this.nextNode = nextNode;
		
	}

	@Override
	public String toString() {
		return data.toString();
	}

	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	
	// Getters
	public Node<T> getNextNode() {
		return nextNode;
	}
	
	public Node<T> getPreviousNode() {
		return previousNode;
	}

	
	// Setters
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	public void setPreviousNode(Node<T> previousNode) {
		this.previousNode = previousNode;
	}
	
	

}
