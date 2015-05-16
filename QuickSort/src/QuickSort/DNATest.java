package QuickSort;

import java.util.ArrayList;


public class DNATest {
	
	ArrayList<String> stringList;
	Integer testCount;
	Integer testWordLenght;
	
	DNATest(ArrayList<String> aList, Integer aTestCount, Integer aTestWordLenght) {
		this.stringList = aList;
		this.testCount = aTestCount;
		this.testWordLenght = aTestWordLenght;
	}

	
	private  boolean less(String v, String w){
		int disordV = calculateDisordering(v);
		int disordW = calculateDisordering(w);
		
		return disordV < disordW;
	}
	
	public int calculateDisordering(String aNode) {
		int disorderingCount = 0;
	
		for (int i = 0; i < aNode.length()-1; i++) {
			char sym1 = aNode.charAt(i);
			for (int j = i+1; j < aNode.length(); j++) {
				char sym2 = aNode.charAt(j);
				if (sym1 > sym2) {
					disorderingCount++;
				}
				
			}
		}
		return disorderingCount;
	}
	
	private  void exch(int i, int j) {
		int disord1 = calculateDisordering(stringList.get(i));
		int disord2 = calculateDisordering(stringList.get(j));
		String temp = stringList.get(i);
		stringList.set(i, stringList.get(j));
		stringList.set(j, temp);
		
	}
	
	private int partition(ArrayList<String> aList, int lo, int hi){
		int i = lo;
		int j = hi+1;
		while (true) {
			while (less(aList.get(++i), aList.get(lo))) {
				if (i == hi) break;
			}
			while (less(aList.get(lo), aList.get(--j))) {
					if (j == lo) break;
			}
			if (i >= j) {
				break;
			}
			exch(i, j);

		}
		exch(lo, j);
		return j;
	}
	
	public void sortDNA() {
		this.sort(stringList, 0, stringList.size()-1);
	}

	private void sort(ArrayList<String> aList, int lo, int hi) {
		if (hi <= lo) return;
		int j = partition(aList, lo, hi);
		sort(aList, lo, j-1);
		sort(aList, j+1, hi);
	}

	
	public ArrayList<String> getStringList() {
		return stringList;
	}

	public void setStringList(ArrayList<String> aStringList) {
		if (aStringList != null) {
			this.stringList = aStringList;
		}
	}
	

}
