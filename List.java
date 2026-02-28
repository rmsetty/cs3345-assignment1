public interface List<T>
{
	/**
	 * Adds item to the end of a list
	 */
	public void addLast(T item);

	/**
	 * Adds item to the start of a list
	 */
	public void addFirst(T item);

	/**
	 * Retrieves item from List
	 * @param position where 0 is the first position in the list
	 * @return item at the given position (or null if none exists)
	 */
	public T get (int position);

	/**
	 * Prints list to screen
	 */
	public void print();

	/**
	 * Prints list backwards to screen
	 */
	public void printBackwards();
	
	/**
	 * Removes first matching item from List
	 * @return true if removed, false otherwise
	 */
	public boolean remove (T item);

	/**
	 * @return true if empty
	 */
	public boolean isEmpty();

	/**
	 * @return number of elements
	 */
	public int getLength();
}