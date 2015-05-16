package Collection;

import java.util.ArrayList;

public class ArrayStack {

	private ArrayList<Object> stackList;
	
	ArrayStack() {
		stackList = new ArrayList<Object>();
	}
	
	ArrayStack(int initialSize) {
		stackList = new ArrayList<Object>();
		  while (stackList.size() < initialSize) {
			  stackList.add(null);
		  }
	}
	
	//  removes the element on the top of the stack.

	
	public Object remove() {
		if (stackList.size() > 0) {
			this.stackList.remove(0);
			if (stackList.size() > 0) {
				return stackList.get(0);
			}
		}
		return null;
	}
	
	//  pushes a new item onto the top of this stack.

	
	public void push(Object anObject) {
		if (anObject != null) {
			this.stackList.add(0, anObject);
		}
	}
	
	// return true if this stack is currently empty.

	
	public boolean empty() {
		return stackList.size() > 0;
	}
	
	//  pops the top item off of this stack and return it.

	
	public Object pop() {
		if (stackList.size() > 0) {
			Object theObject = stackList.get(0);
			this.stackList.remove(0);
			return theObject;
		} 
		return null;
	}

	//  returns the top item off of this stack without removing it.
	
	public Object peek() {
		if (stackList.size() > 0) {
			return stackList.get(0);
		}
		return null;
	}
	
	//  returns the one-based position of the distance from the top that the specified object exists on this stack, where the top-most element is considered to be at distance 1.

	
	 public int search(Object anObject) {
		 for (int i = 0; i < stackList.size(); i++) {
			 Object currentObj = stackList.get(i);
			 if (currentObj.equals(anObject)) {
				 return i;
			 }
		 }
		 return -1;
	 }
}
