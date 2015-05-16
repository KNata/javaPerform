package Cards;


import java.util.*;


public class SortCards {

	private int countNumber;
	private ArrayList<Integer> numbSet;
	
	SortCards() {
		
		numbSet = new ArrayList<Integer>();
		countNumber = 0;
	}
	
	// add cards to arrayList
	
	public boolean addCards(int aCardNumber, ArrayList<Integer> aList) {
		countNumber = aCardNumber;
		if (aList != null) {
			numbSet.addAll(aList);
			return true;
		}
		return false;
	}
	
	// check if all cards are in our list
	
	public Integer checkCards() { 
		if (numbSet.size() > 1) {
			for (int i = 0; i < numbSet.size(); i++) {
				Integer obj = numbSet.get(Integer.valueOf(i));
				if (obj.intValue() != i+1) {
					return Integer.valueOf(i+1);
				}
			}
		}
		if (numbSet.size() != countNumber) {
			return countNumber;
		}
		return 0;
	} 
	
	public void exchange(ArrayList<Integer> aList, int i, int j) {
		int exch = aList.get(i);
		aList.set(i, aList.get(j));
		aList.set(j, exch);

	}
	
	// sort
	
	public void sortList(ArrayList<Integer> aList) {
		for (int i = 0; i < aList.size(); i++) {
			int min = i;
			for (int j = i+1; j < aList.size(); j++) {
				if (aList.get(j) < aList.get(min)) {
					min = j;
				}
			}
			exchange(aList, i, min);
		}
	}


	public ArrayList<Integer> getNumbSet() {
		return numbSet;
	}

	
}
