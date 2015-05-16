package Collection;

import java.util.ArrayList;

public class LinkedStack {

	private ArrayList <Object>linkedStackList;
	
	LinkedStack() {
		linkedStackList = new ArrayList<Object>();
	}
	
	// generate a copy of this stack.

	
	public LinkedStack clone() {
		return (LinkedStack)linkedStackList.clone();
	}
	
	//  get the top item, removing it from this stack.

	
	public Object pop() {
		if (linkedStackList.size() > 0) {
			Object theObject = linkedStackList.get(0);
			this.linkedStackList.remove(0);
			return theObject;
		} 
		return null;
	}
	
	// get the top item of this stack, without removing the item.

	
	public Object peek(int i) {
		if (i >= 0 && i < linkedStackList.size()) {
			return linkedStackList.get(i);
		}
		return null;
	}
	
	//  accessor method to determine the number of items in this stack.

	
	public int size() {
		return linkedStackList.size();
	}
	
	//  determine whether this stack is empty.

	
	public boolean isEmpty() {
		return linkedStackList.size() > 0;
	}
}
