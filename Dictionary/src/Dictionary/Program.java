package Dictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

// main program

public class Program {

	public static void main(String[] args) throws IOException {
		 File file = new File("Pelicans.txt"); 

		   try {
			   SearchDictionary theDictionary = new SearchDictionary();
		       
			   FileReader reader = new FileReader(file);
		       BufferedReader br = new BufferedReader(reader);
		       // read lines
		       String scan = null;
		       while ((scan = br.readLine()) != null) {
	    	        String[] numberStrings = scan.split(" ");
	    	        for (int i = 0; i < numberStrings.length; i++) {
	    	        	theDictionary.addWord(numberStrings[i]);
	    	        }
		       }
		       // user enter chars
		       System.out.println("Enter words for search");
		       String wordForSearch = "**";
		       while (wordForSearch.length() >1) {
		    	   System.out.print(">");
		       		wordForSearch = DataInput.getString();
		       		if (wordForSearch.length() <2) {
		       			break;
		       		} // "*" as a helpful symbol
		       if (!wordForSearch.contains("*")) {
		    	   boolean result = theDictionary.hasWord(wordForSearch);
		    	   if (result) {
		    		   System.out.println("The word " + wordForSearch + " is in dictionary");
		    	   }
		       } else {
		    	   HashSet<String> theCollection = (HashSet<String>) theDictionary.query(wordForSearch);
		    	  Iterator itr = theCollection.iterator();
		    	  while(itr.hasNext()) {
				       System.out.println(itr.next());
		    	   }
		       }
		       }
		   } finally {
		   }
	}
}