package LinkedList;

public class Node<T> {
	
	// value type T
	private T value;
	public Node<T> next;
	
	public Node(T value, Node<T> next) {
		this.value = value;
		this.next = next;
	}
	
	public T value() {
		return this.value;
	}
	
}
