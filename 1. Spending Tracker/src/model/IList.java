package model;

public interface IList<T extends Comparable<T>> {
	public Node<T> addAfter(Node<T> elem, T item);
	public Node<T> prev(Node<T> node);
	public Node<T> next(Node<T> node);
	public T replace(Node<T> node, T item);
	public Node<T> insertAfter(Node<T> node, T item);
	public Node<T> insertBefore(Node<T> node, T item);
	public Node<T> addBefore(Node<T> node, T item);
	public Node<T> addFirst(T item);
	public Node<T> addLast(T item);
	public T remove(Node<T> elem);
	public Node<T> search(T elem);
	public Node<T> first();
	
	
	public boolean isEmpty();
	public Integer size();
}
