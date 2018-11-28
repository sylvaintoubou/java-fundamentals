package seven.lesson22;

public class Test {

	public static void main(String[] args) {
		MySinglyLinkedList<String> linkedList = new MySinglyLinkedList<>("list1");
		linkedList.insertNodeFront(new Node<String> ("Yvan"));
		linkedList.insertNodeFront(new Node<String> ("Roland"));
		linkedList.insertNodeFront(new Node<String> ("Thierry"));
		
		linkedList.printList();
		System.out.println();
		System.out.println(linkedList.getFirstNode().nextNode);
		System.out.println(linkedList.getCurrentNode());
		System.out.println();

		Node<String> first = linkedList.getFirstNode();
		first.nextNode = first.nextNode.nextNode;
		linkedList.printList();
		System.out.println();
		//System.out.println(first.nextNode);
		
		
		DoublyLinkedList<String> stack = new DoublyLinkedList<>("Test");
		stack.insertNodeOnTop(new Node<String> ("Yvan"));
		stack.insertNodeOnTop(new Node<String> ("Roland"));
		stack.insertNodeOnTop(new Node<String> ("Thierry"));
		
		//System.out.println(stack.getLastNode().getData());
		//System.out.println(stack.getLastNode().getPreviousNode().getData());
		stack.printStack();
		System.out.println();
		stack.printQueue();
		//stack.removeNodeFromTop();
		//System.out.println(stack.getLastNode().getData());
		
		

	}

}
