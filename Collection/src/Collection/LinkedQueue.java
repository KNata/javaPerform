package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LinkedQueue {
	
	private ArrayList<Object> linkedQueueList;
	private Iterator iterator;
	
	LinkedQueue() {
		linkedQueueList = new ArrayList<Object>();
		iterator = linkedQueueList.iterator();
	}
	
	LinkedQueue(Collection<? extends Object> c) {
		linkedQueueList = new ArrayList<Object>();
		linkedQueueList.addAll(c);
		iterator = linkedQueueList.iterator();
	}
	
	LinkedQueue(Object [] objects) {
		linkedQueueList = new ArrayList<Object>();
		for (int i = 0; i < objects.length; i++) {
			linkedQueueList.add(objects[i]);
		}
		iterator = linkedQueueList.iterator();
	}
	
	//  ensures that this queue contains the specified element.

	
	public boolean add(Object anObject) {
		if (anObject != null) {
			linkedQueueList.add(anObject);
			return true;
		}
		return false;
	}

	//  removes all of the elements from this queue.

	
	public void clear() {
		linkedQueueList.clear();
	}
	
	//  returns an iterator over the elements in this queue.

	
	public Iterator iterator() {
		return linkedQueueList.iterator();
		
	}
	
	//  returns (without removing) the next elements in this queue, according to FIFO behavior.

	
	public Object peek() {
		if( iterator.hasNext()){
			return iterator.next();
		}
		return null;
	}
	
	
	// returns/removes the next element in this queue, according to FIFO behavior.

	
	public Object remove() {
		if( iterator.hasNext()){
			Object anObject = iterator.next();
			linkedQueueList.remove(anObject);
			return anObject;
		}
		return null;
	}


	@Override
	public String toString() {
		return "LinkedQueue [linkedQueueList=" + linkedQueueList + "]";
	}
	
	  
}
