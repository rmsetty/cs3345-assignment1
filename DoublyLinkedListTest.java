import java.util.Iterator;

public class DoublyLinkedListTest {

	public static void main(String[] args) {
		
		testPrintEmptyListForward();
		testPrintEmptyListBackward();
		testEmptyGet();
		testAddFirstAndGet();
		testAddFirstForwards();
		testAddFirstBackwards();
		testAddLastAndGet();
		testAddLastForwards();
		testAddLastBackwards();
		testIsEmpty();
		testGetLength();
		testRemoveFromEmptyList();
		testRemoveFromListWithOneElementNegative();
		testRemoveFromListWithOneElementPositive();
		testRemoveFromListWithTwoElementNegative();
		testRemoveFromListWithTwoElementPositive();
		testRemoveFromListWithThreeElementNegative();
		testRemoveFromListWithThreeElementPositive();
		testIterator();
	}
	
	public static void testPrintEmptyListForward() {
		System.out.println("---- testPrintEmptyListForward ----");
		List<String> list = new DoublyLinkedList<String>();
		list.print();
	}

	public static void testPrintEmptyListBackward() {
		System.out.println("---- testPrintEmptyListBackward ----");
		List<String> list = new DoublyLinkedList<String>();
		list.printBackwards();
	}
	
	public static void testEmptyGet() {
		List<String> list = new DoublyLinkedList<String>();
        System.out.println("The fifth element data in an empty list is " + list.get(5));
	}
	
	public static void testAddFirstAndGet () {
		List<String> list = new DoublyLinkedList<String>();

		list.addFirst("Apple");
		list.addFirst("Banana");
		list.addFirst("Cherry");
		list.addFirst("Donut");
		list.addFirst("Donut"); 
		list.addFirst("End");
		
		System.out.println(list.get(5));
		System.out.println(list.get(4));
		System.out.println(list.get(3));
		System.out.println(list.get(1));
		System.out.println(list.get(0));
	}
	
	public static void testAddFirstForwards() {
		List<String> list = new DoublyLinkedList<String>();

		list.addFirst("Apple");
		list.addFirst("Banana");
		list.addFirst("Cherry");
		list.addFirst("Donut");
		list.addFirst("Donut");
		list.addFirst("End");

		list.print();
	}
	
	public static void testAddFirstBackwards() {
		List<String> list = new DoublyLinkedList<String>();

		list.addFirst("Apple");
		list.addFirst("Banana");
		list.addFirst("Cherry");
		list.addFirst("Donut");
		list.addFirst("Donut");
		list.addFirst("End");

		list.printBackwards();
	}
	
	public static void testAddLastAndGet () {
		List<String> list = new DoublyLinkedList<String>();

		list.addLast("Apple");
		list.addLast("Banana");
		list.addLast("Cherry");
		list.addLast("Donut");
		list.addLast("Donut"); 
		list.addLast("End");
		
		System.out.println(list.get(5));
	}
	
	public static void testAddLastForwards() {
		List<String> list = new DoublyLinkedList<String>();

		list.addLast("Apple");
		list.addLast("Banana");
		list.addLast("Cherry");
		list.addLast("Donut");
		list.addLast("Donut");
		list.addLast("End");

		list.print();
	}
	
	public static void testAddLastBackwards() {
		List<String> list = new DoublyLinkedList<String>();

		list.addLast("Apple");
		list.addLast("Banana");
		list.addLast("Cherry");
		list.addLast("Donut");
		list.addLast("Donut");
		list.addLast("End");

		list.printBackwards();
	}
	
	public static void testIsEmpty() {
		List<String> list = new DoublyLinkedList<String>();
		System.out.println(list.isEmpty());
		list.addFirst("One");
		System.out.println(list.isEmpty());
	}

	public static void testGetLength() {
		List<String> list = new DoublyLinkedList<String>();
		System.out.println(list.getLength());
		list.addFirst("Apple");
		System.out.println(list.getLength());
		list.addLast("Banana");
		System.out.println(list.getLength());
		list.addFirst("Cherry");
		System.out.println(list.getLength());
	}
	
	public static void testRemoveFromEmptyList() {
		List<String> list = new DoublyLinkedList<String>();
		System.out.println(list.remove("something"));
	}

	public static void testRemoveFromListWithOneElementNegative() {
		List<String> list = new DoublyLinkedList<String>();
		list.addFirst("Apple");
		System.out.println(list.remove("something"));
	}

	public static void testRemoveFromListWithOneElementPositive() {
		List<String> list = new DoublyLinkedList<String>();
		list.addFirst("Apple");
		System.out.println(list.remove("Apple"));
		list.print();
	}

	public static void testRemoveFromListWithTwoElementNegative() {
		List<String> list = new DoublyLinkedList<String>();
		list.addFirst("Apple");
		list.addFirst("Cherry");
		System.out.println(list.remove("something"));
	}

	public static void testRemoveFromListWithTwoElementPositive() {
		List<String> list = new DoublyLinkedList<String>();
		list.addFirst("Apple");
		list.addFirst("Cherry");
		System.out.println(list.remove("Cherry"));
		list.print();
	}

	public static void testRemoveFromListWithThreeElementNegative() {
		List<String> list = new DoublyLinkedList<String>();
		list.addLast("Apple");
		list.addLast("Cherry");
		list.addLast("Banana");
		System.out.println(list.remove("something"));
		list.print();
	}

	public static void testRemoveFromListWithThreeElementPositive() {
		List<String> list = new DoublyLinkedList<String>();
		list.addLast("Apple");
		list.addLast("Cherry");
		list.addLast("Banana");
		System.out.println(list.remove("Cherry"));
		list.print();
	}

	public static void testIterator() {
		DoublyLinkedList<String> list = new DoublyLinkedList<String>();
		list.addLast("Apple");
		list.addLast("Cherry");
		list.addLast("Banana");

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			System.out.print(it.next());
			if (it.hasNext())
				System.out.print(", ");
		}
		System.out.println();
	}
}