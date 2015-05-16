package Dictionary;

import java.util.*;


public class SearchDictionary {
	
	
	private HashSet<String> dictionaryList;
	
	public SearchDictionary() {
		
		dictionaryList = new HashSet <String> ();
	}

	public void addWord(String aWord){
		if (aWord != null) {
			dictionaryList.add(aWord);
		}
	}

	public String deleteWord(String aWord) {
		if (aWord != null) {
			boolean theResult = dictionaryList.remove(aWord);
			if (theResult) {
				return aWord;
			}
		}
		return null;
	}

	public boolean hasWord(String aWord){
		if (aWord != null) {
			if (dictionaryList.contains(aWord)) {
				return true;
			}
		}
		return false;
	}

	// here we check if our word contains current prefix/suffix
	
	public Iterable<String> query (String aQuery) {
		HashSet<String> theCollection = new HashSet<String>();
		String prefix = "";
		String suffix ="";

		if (aQuery.contains("*")) {
			int asterixIndex = aQuery.indexOf("*");
			if (asterixIndex > 0) {
				prefix = aQuery.substring(0, asterixIndex);
			}
			if (asterixIndex < aQuery.length()) {
				suffix = aQuery.substring(asterixIndex+1, aQuery.length());
			}
		} else {
			prefix = aQuery;
		}
		// begin exam 
		for (String theWord : dictionaryList) {
			if (prefix.length() > 0 && suffix.length() > 0 ) {
					if (theWord.startsWith(prefix) && theWord.endsWith(suffix)) {
						theCollection.add(theWord);
					}
			} else if (prefix.length() > 0) { // prefix
					if (theWord.startsWith(prefix)) {
						theCollection.add(theWord);
					}
			} else {
					if (theWord.endsWith(suffix)) { // suffix
						theCollection.add(theWord);
					}
				}
		}
		return theCollection;
	}
		
	public int countWords() {
		return dictionaryList.size(); 
	}
}


