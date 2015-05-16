package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bag {

	private ArrayList<Object> bagList;
	private Iterator iterator;
	
	Bag() {
		bagList = new ArrayList<Object>();
		iterator = bagList.iterator();
	}
	
	// add the given object to the bag and keep a count
	
	public boolean add(Object anObject) {
		if (anObject != null) {
			bagList.add(anObject);
			return true;
		}
		return false;
	}
	
	// add i copies of the given object to the bag and keep a count
	
	public boolean add(Object anObject, int i) {
		if (anObject != null && i >=0 && i > bagList.size()) {
			bagList.add(i, anObject);
			return true;
		}
		return false;
	}
	
	// returns true if the bag contains all elements in the given collection, respecting cardinality
	
	public boolean containsAll(Collection aCollection) {
		if (aCollection != null && bagList.size() > 0) {
			return bagList.containsAll(aCollection);
		}
		return false;
	}
	
	// Returns true if the bag contains all elements in the given collection, respecting cardinality
	
	public Object removeObject(Object anObject) {
		if (anObject != null && bagList.size() > 0) {
			bagList.remove(anObject);
		}
		return bagList;
	}
	
	// returns true if the bag contains all elements in the given collection, respecting cardinality
	
	public boolean contains(Object anObject) {
		for (int i = 0; i < bagList.size(); i++) {
			if (bagList.contains(anObject)) {
				return true;
			}
		}
		return false;
	}
	
	//  returns the total number of items in the bag across all types.

	
	public int bagSize() {
		return bagList.size();
	}
	
	// return the number of occurrences (cardinality) of the given object currently in the bag
	
	public int getCount(Object anObject) {
		int count = 0;
		for (int i = 0; i < bagList.size(); i++) {
			if (bagList.contains(anObject)) {
				count++;
			}
		}
		return count;
	}
	
	// returns an Iterator over the entire set of members, including copies due to cardinality

	
	public Iterator iterator() {
		return bagList.iterator();
	}
	
	// removes an objects
	
	public boolean remove(Object anObject) {
		for (int i = bagList.size() - 1; i >= 0; i--) {
			Object object = bagList.get(i);
			if (object.equals(anObject)) {
				bagList.remove(object);
			}
		}
		return !this.uniqueSet().contains(anObject);
	}
	
	// the Set of unique members that represent all members in the bag.
	
	public Set uniqueSet() {
        Set<Object> set = new HashSet<Object>(bagList);
        return set;
	}

	// 
	
	public boolean remove(Collection collection) {
		for (int i = bagList.size() - 1; i >= 0; i--) {
			Object object = bagList.get(i);
			if (!collection.contains(object)) {
				bagList.remove(object);
				return true;
			}
			
		}
		return false;
	}
}
