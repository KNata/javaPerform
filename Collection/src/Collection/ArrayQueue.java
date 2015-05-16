package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayQueue<E> {
	
	private ArrayList<E> arrayQueueList;
	private Iterator iterator;

	
	
	ArrayQueue() {
		arrayQueueList = new ArrayList<E>();
		iterator = arrayQueueList.iterator();
	}
	
	ArrayQueue(Collection<? extends E> c) {
		arrayQueueList = new ArrayList<E>();
		arrayQueueList.addAll(c);
		iterator = arrayQueueList.iterator();
	}
	
	ArrayQueue(int minCapacity) {
		arrayQueueList = new ArrayList<E>();
		this.ensureCapacity(minCapacity);
		iterator = arrayQueueList.iterator();
	}
	
	ArrayQueue(E[] objects) {
		arrayQueueList = new ArrayList<E>();
		for (int i = 0; i < objects.length; i++) {
			arrayQueueList.add(objects[i]);
		}
		iterator = arrayQueueList.iterator();
	}
	
	// ensures that this queue contains the specified element

	
	public boolean add(E anObject) {
		if (anObject != null) {
			arrayQueueList.add(anObject);
			return true;
		}
		return false;
	}
	
	// returns/removes the next element in this queue, according to FIFO behavior

	
	public E remove() {
		if( iterator.hasNext()){
			E anObject = (E)iterator.next();
			arrayQueueList.remove(anObject);
			return anObject;
		}
		return null;
	}
	
	//  returns an iterator over the elements in this queue.

	
	public Iterator iterator() {
		return arrayQueueList.iterator();
		
	}
	
   // returns (without removing) the next elements in this queue, according to FIFO behavior.

	
	public E peek() {
		if( iterator.hasNext()){
			return (E)iterator.next();
		}
		return null;
	}

	@Override
	public String toString() {
		return "ArrayQueue [arrayQueueList=" + arrayQueueList + "]";
	}

	//  ensures that the backing array can store at least minCapacity elements
	
	public void ensureCapacity(int minCapacity) {
		    while (arrayQueueList.size() < minCapacity) {
		    	arrayQueueList.add(null);
		    }
	}
	
	//  ensures that the backing array is exactly big enough to store only the elements it currently stores.

	
	public void trimToSize() {
		arrayQueueList.trimToSize();
	}
}
