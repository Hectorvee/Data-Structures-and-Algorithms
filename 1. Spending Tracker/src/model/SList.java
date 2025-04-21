package model;

public class SList<T extends Comparable<T>> implements IList<T> {

	private Node<T> head = null;
	private Node<T> tail = null;
	private Integer size = 0;
	
	/**
	 * Default constructor
	 */
	public SList() {}
	
	/**
	 * returns the first node in the list.
	 */
	public Node<T> first() {
		return head;
	}
	
	/**
	 * returns the last node in the list.
	 */
	public Node<T> last() {
		return tail;
	}
	
	/**
	 * returns the node before a given node in the list.
	 * 3 marks
	 */
	@Override
	public Node<T> prev(Node<T> node) {

	}
	
	/**
	 * returns the next node after a given node in the list.
	 */
	@Override
	public Node<T> next(Node<T> node) {

	}
	
	/**
	 * Replace the element of a given node in the list
	 * @return the old element of the given node
	 * 1 Marks
	 */
	@Override
	public T replace(Node<T> node, T item) {
	}
	
	/**
	 * Add an element after a given node in the list
	 * 3 Marks
	 */
	@Override
	public Node<T> insertAfter(Node<T> node, T item) {
	}

	/**
	 * Add an element before a given node in the list
	 * 5 Marks
	 */
	@Override
	public Node<T> insertBefore(Node<T> node, T item) {
	}

	/**
	 * Add an element to the start of the list
	 * @return the new node
	 */
	public Node<T> insertFirst(T item) {
	} 

	/**
	 * Add an element to the end of the list
	 * @return the new node
	 */
	public Node<T> insertLast(T item){
	}

	@Override
	public Node<T> addAfter(Node<T> elem, T item) {
		return null;
	}

	@Override
	public Node<T> addBefore(Node<T> node, T item) {
		return null;
	}

	@Override
	public Node<T> addFirst(T item) {
		return null;
	}

	@Override
	public Node<T> addLast(T item) {
		return null;
	}


	@Override
	public T remove(Node<T> node) {
	}

	/**
	 * Returns the node that contains the element that is specified as a parameter
	 * 5 Marks
	 */
	@Override
	public Node<T> search(T elem) {
	}

	/**
	 * Returns true if the list is empty
	 */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Return the size of the list
	 */
	@Override
	public Integer size() {
		return size;
	}
}
