package LinkedList;

public class LinkedList<T> {
	public Node<T> head;
	
	private void checkIndexOutOfBounds(int index, boolean lessThanOnly) {
		final int length = this.length();
		if (index < 0 || (lessThanOnly && index >= length) || (!lessThanOnly && index > length) ) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	private int length() {
		int count = 0;
		Node<T> iterator = head;
		while(iterator != null) {
			iterator = iterator.next;
			count++;
		}
		return count;
	}
	
	// TODO: implement adding first
	public boolean add(T value) {
		throw new UnsupportedOperationException();
	}
	public boolean add(T value, int index) {
		throw new UnsupportedOperationException();
	}
	
	// TODO: then get value at
	public T get(int index) {
		throw new UnsupportedOperationException();
	}
	
	// TODO: removal using index
	public T removeAt(int index) {
		throw new UnsupportedOperationException();
	}
	
	// TODO: remove by Value
	public T removeAt(T val) {
		throw new UnsupportedOperationException();
	}
	
	// TODO: print from start to end with index horizontally
	public void print () {
		StringBuilder sbIndex = new StringBuilder();
		sbIndex.append("Index  :\t");
		StringBuilder sbValue = new StringBuilder();
		sbValue.append("Values :\t");
		int i = 0;
		Node<T> iterator = head;
		while(iterator != null) {
			sbIndex.append(i +  "\t");
			sbValue.append(iterator.value() + "\t");
			i++;
			iterator = iterator.next;
		}
		System.out.println(sbValue);
		System.out.println(sbIndex);
	}
}
