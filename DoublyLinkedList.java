import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoublyLinkedList<T> implements List<T> {

	private Node head, tail;
	private int numberOfElements;

	public DoublyLinkedList() {
		head = null;
		tail = null;
		numberOfElements = 0;
	}
	
	@Override
	public void addLast(T item) {
		Node newNode = new Node(item);

		if (head == null) { // empty list
			head = newNode;
			tail = newNode;
		} else {
			newNode.previous = tail;
			tail.next = newNode;
			tail = newNode;
		}

		numberOfElements++;
	}

	@Override
	public void addFirst(T item) {
		Node newNode = new Node(item);

		if (head == null) { // empty list
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
		}

		numberOfElements++;
	}

	@Override
	public T get(int position) {
		if (position < 0 || position >= numberOfElements)
			return null;

		Node current;

		if (position <= numberOfElements / 2) {
			current = head;
			for (int i = 0; i < position; i++)
				current = current.next;
		} else {
			current = tail;
			for (int i = numberOfElements - 1; i > position; i--)
				current = current.previous;
		}

		return current.data;
	}

	@Override
	public void print() {
		if (head == null) {
			System.out.println("Empty list");
			return;
		}

		Node current = head;

		while (current != null) {
			System.out.print(current.data);
			if (current.next != null)
				System.out.print(", ");
			current = current.next;
		}
		System.out.println();
	}

	@Override
	public void printBackwards() {
		if (tail == null) {
			System.out.println("Empty list");
			return;
		}

		Node current = tail;

		while (current != null) {
			System.out.print(current.data);
			if (current.previous != null)
				System.out.print(", ");
			current = current.previous;
		}
		System.out.println();
	}

	@Override
	public boolean remove(T item) {

		if (head == null)
			return false;

		Node current = head;

		while (current != null) {

			boolean match =
				(current.data == null && item == null) ||
				(current.data != null && current.data.equals(item));

			if (match) {

				// one element
				if (head == tail) {
					head = null;
					tail = null;
				}
				// removing head
				else if (current == head) {
					head = head.next;
					head.previous = null;
				}
				// removing tail
				else if (current == tail) {
					tail = tail.previous;
					tail.next = null;
				}
				// removing middle
				else {
					current.previous.next = current.next;
					current.next.previous = current.previous;
				}

				numberOfElements--;
				return true;
			}

			current = current.next;
		}

		return false;
	}

	@Override
	public boolean isEmpty() {
		return numberOfElements == 0;
	}

	@Override
	public int getLength() {
		return numberOfElements;
	}

	// ===== Iterator =====
	public Iterator<T> iterator() {
		return new DLLIterator();
	}

	private class DLLIterator implements Iterator<T> {

		private Node current = head;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			if (!hasNext())
				throw new NoSuchElementException();
			T value = current.data;
			current = current.next;
			return value;
		}
	}

	/** Node class */
	private class Node {
		private T data;
		private Node next, previous;

		private Node(T data) {
			this(data, null, null);
		}

		private Node(T data, Node next, Node prev) {
			this.data = data;
			this.next = next;
			this.previous = prev;
		}
	}
}