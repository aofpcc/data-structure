package LinkedList;

public class LinkedListMain {
	public static void main(String ...args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println("Appending 1, 10, 5 accordingly");
		list.add(1);
		list.add(10);
		list.add(5);
		list.add(5);
		list.add(6);
		list.add(5);
		list.print();
		
//		System.out.println("\nAdd value at specific position");
//		list.add(2, 1);
//		list.add(4, 3);
//		list.print();
//		
//		System.out.println("\nGet value at specific position");
//		int d0 = list.get(0);
//		int d2 = list.get(2);
//		int d4 = list.get(4);
//		System.out.println("[0] = " + d0 + ", [2] = " + d2 + ", [4] = " + d4);
//		
//		System.out.println("\nRemove value at specific position");
//		System.out.println("Remove value at index 4");
//		list.removeAt(4);
//		System.out.println("Remove value at index 0");
//		list.removeAt(0);
//		list.print();
//		
//		System.out.println("\nRemove value from list");
//		System.out.println("Remove 5");
//		list.remove(5);
//		System.out.println("Remove 0");
//		list.remove(0);
//		list.print();
	}
}
