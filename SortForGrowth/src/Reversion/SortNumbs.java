package Reversion;

import java.util.*;



public class SortNumbs {

	private int countNumber;
	private ArrayList <Integer> numbList;
	private int numberOfChanges;
	
	
	SortNumbs() {
		
		numbList = new ArrayList <Integer>();
		countNumber = 0;
		numberOfChanges = 0;
	}
	
	public boolean addCards(int aCardNumber, ArrayList<Integer> aList) {
		countNumber = aCardNumber;
		if (aList != null) {
			numbList.addAll(aList);
			return true;
		}
		return false;
	}
	
	
	
	
	public void exchange(ArrayList<Integer> aList, int i, int j) {
		int exch = aList.get(i);
		aList.set(i, aList.get(j));
		aList.set(j, exch);
		numberOfChanges++;
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

	// check if all numbers are in the line
	
	public Integer checkNumbers() { 
		if (numbList.size() > 1) {
			for (int i = 0; i < numbList.size(); i++) {
				Integer obj = numbList.get(Integer.valueOf(i));
				if (obj.intValue() != i+1) {
					return Integer.valueOf(i+1);
				}
			}
		}
		if (numbList.size() != countNumber) {
			return countNumber;
		}
		return 0;
	} 
	
	
	public int getCountNumber() {
		return countNumber;
	}

	public ArrayList<Integer> getNumbList() {
		return numbList;
	}


	public int getNumberOfChanges() {
		return numberOfChanges;
	}

	
}
