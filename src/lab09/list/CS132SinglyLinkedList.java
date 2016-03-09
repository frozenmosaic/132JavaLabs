package lab09.list;

import java.util.Arrays;
import java.util.Iterator;

/**
 * An implementation of the List interface using a singly linked list of
 * Objects.
 * 
 * @author
 * @version
 */
public class CS132SinglyLinkedList implements CS132List {

	private int size;
	private SinglyLinkedNode head;

	/**
	 * Construct a new empty CS132SinglyLinkedList.
	 */
	public CS132SinglyLinkedList() {
		head = new SinglyLinkedNode(null);
	}

	/**
	 * {@inheritDoc}
	 */

	public int size() {
		return size;
	}

	/**
	 * {@inheritDoc}
	 */
	public void add(Object element) {
		if (head.next == null) {
			head.next = new SinglyLinkedNode(element);
		} else {
			SinglyLinkedNode curr = head.next;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = new SinglyLinkedNode(element);
		}

		size++;
	}

	/**
	 * {@inheritDoc}
	 */
	public Object get(int index) throws IndexOutOfBoundsException {
		if (head.next == null) { // empty list
			return null;
		} else {
			SinglyLinkedNode curr = head.next;
			int count = 0;

			if (index < size) {
				while (count < index) {
					curr = curr.next;
					count++;
				}
				return curr.element;
			} else {
				return null;
			}

		}
	}

	/**
	 * {@inheritDoc}
	 */

	public void set(int index, Object element) throws IndexOutOfBoundsException {
		if (head.next == null) { // empty list
			head.next = new SinglyLinkedNode(element);
			size++;
		} else {
			SinglyLinkedNode curr = head.next;
			int count = 0;

			while (count < index - 1 && index < size) {
				curr = curr.next;
				count++;
			}
			SinglyLinkedNode newNode = new SinglyLinkedNode(element);
			curr.next = newNode;
			newNode.next = curr.next.next;
		}
	}

	/**
	 * {@inheritDoc}
	 */

	public void insert(int index, Object element)
			throws IndexOutOfBoundsException {
		if (head.next == null) { // empty list
			head.next = new SinglyLinkedNode(element);
		} else {
			SinglyLinkedNode curr = head.next;
			int count = 0;

			while (count < index - 1 && index < size) {
				curr = curr.next;
				count++;
			}
			SinglyLinkedNode newNode = new SinglyLinkedNode(element);
			newNode.next = curr.next;
			curr.next = newNode;
		}
		size++;
	}

	/**
	 * {@inheritDoc}
	 */

	public Object remove(int index) throws IndexOutOfBoundsException {
		if (head.next == null) { // empty list
			return null;
		} else {
			SinglyLinkedNode curr = head.next;
			int count = 0;

			while (count < index - 1 && index < size) {
				curr = curr.next;
				count++;
			}
			Object temp = curr.next.element;
			curr.next = curr.next.next;

			size--;
			return temp;
		}

	}

	/**
	 * Returns a new list containing all of the elements from index start up to
	 * but not including end. If either start or end are not valid the method
	 * must throw an IndexOutOfBoundsException.
	 * 
	 * @param start
	 *            index of first element to start with
	 * @param end
	 *            element after the last element of the sublist
	 * @return the sublist
	 */
	public CS132List sublist(int start, int end)
			throws IndexOutOfBoundsException {
		CS132List res = new CS132SinglyLinkedList();

		if (head.next == null) { // empty list
			return res;
		} else {
			SinglyLinkedNode curr = head.next;
			int count = 0;

			while (count < start) {
				curr = curr.next;
				count++;
			}

			// loop stops. curr now points at first element to be in sublist.
			res.add(curr); // head of res now refers to curr

			count = 0;
			while (count < end - start - 1) {
				curr = curr.next;
				if (curr != null) {
					res.add(new SinglyLinkedNode(curr.element));
				}
				count++;
			}

		}

		return res;
	}

	/**
	 * Reverse order of the linked list.
	 */
	public void reverse() {
		if (head.next != null) {
			SinglyLinkedNode anchor = head.next;
			SinglyLinkedNode curr = anchor.next;

			while (curr != null) {
				SinglyLinkedNode next = curr.next;

				curr.next = head.next;
				anchor.next = next;

				head.next = curr;
				curr = next;
			}
		}
	}

	public static void main(String[] args) {
		CS132SinglyLinkedList myList = new CS132SinglyLinkedList();

		int x1 = 3;
		int x2 = 4;
		int x3 = 7;
		int x4 = 8;
		int x5 = 0;
		int x6 = 11;

		myList.add(x1);
		myList.add(x2);
		myList.add(x3);
		myList.add(x4);
		myList.add(x5);
		myList.add(x6);

		for (int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + " ");
		}
		System.out.println();

		myList.reverse();

		for (int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + " ");
		}

	}

	/*
	 * Structure used to represent a node in the linked list.
	 */
	private static class SinglyLinkedNode {
		public SinglyLinkedNode next;
		public Object element;

		public SinglyLinkedNode(Object element) {
			this.element = element;
			next = null;
		}
	}

}
