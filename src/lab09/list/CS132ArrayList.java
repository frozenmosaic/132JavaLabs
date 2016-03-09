package lab09.list;

import java.util.Arrays;
import java.util.Iterator;
import java.lang.Iterable;

/**
 * An implementation of the CS132List interface using an array of Objects.
 * 
 * @author
 * @version
 */
public class CS132ArrayList implements CS132List, Iterable<Object> {

	private int size;
	private Object[] elems;

	/**
	 * Construct a new empty CS132ArrayList.
	 */
	public CS132ArrayList() {
		elems = new Object[5];
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
		if (size < elems.length) {
			elems[size] = element;
			size++;
		} else { // size == length
			Object[] temp = new Object[size * 2];
			for (int i=0; i < size; i++) {
				temp[i] = elems[i];
			} 
			temp[size] = element;
			
			elems = temp;
			size++;
		}
	}
	
	public static void main(String[] args) {
		CS132ArrayList myList = new CS132ArrayList();
		
		int x1 = 3;
		int x2 = 4;
		int x3 = 7;
		int x4 = 8;
		int x5 = 9;
		int x6 = 10;
		
		myList.add(x1);
		myList.add(x2);
		myList.add(x3);
		myList.add(x4);
		myList.add(x5);
		myList.add(x6);
		
		System.out.println(Arrays.toString(myList.elems));
		
	}

	/**
	 * {@inheritDoc}
	 */
	
	public Object get(int index) throws IndexOutOfBoundsException {
		return elems[index];
	}

	/**
	 * {@inheritDoc}
	 */
	
	public void set(int index, Object element) throws IndexOutOfBoundsException {
		elems[index] = element;
	}

	/**
	 * {@inheritDoc}
	 */
	
	public void insert(int index, Object element) throws IndexOutOfBoundsException {
		if (size == elems.length) {
			Object[] temp = new Object[size * 2];
			for (int i=0; i < size; i++) {
				temp[i] = elems[i];
			} 
			elems = temp;
		}
		
		for (int i=size; i > index; i--) {
			elems[i] = elems[i-1];
		}
		elems[index] = element;
		size++;
	}
	
	/**
	 * {@inheritDoc}
	 */
	
	public Object remove(int index) throws IndexOutOfBoundsException {
		Object temp = elems[index];
		
		for (int i=index; i < size-1; i++) {
			elems[i] = elems[i+1];
		}
		size--;
		
		return temp;
	}

	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
