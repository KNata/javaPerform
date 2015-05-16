package QuickSort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Program {

	public static void main(String[] args) throws IOException {


		 File file = new File("DNATestFile.txt"); 

		   try {

		       FileReader reader = new FileReader(file);
		       BufferedReader br = new BufferedReader(reader);
	    	
		    	String scan = br.readLine();
		    	if (scan == null) {
				    System.out.println("Bad input data");
		    		return;
		    	}
		    	int numberTests = Integer.valueOf(scan).intValue();
		    	if (numberTests > 0 ) {
		    		for (int i = 0; i < numberTests; i++) {
		    			
		    			String emptyString = br.readLine();
		    			
				    	String scan3 = br.readLine();
				    	if (scan3 == null) {
						    System.out.println("Bad input data");
				    		return;
				    	}
					    ArrayList<Integer> theNumbers = new ArrayList<Integer>();
					    String[] testNumberStrings = scan3.split(" ");
					    int cardCount = 0;
					    Integer testWordLenght = 0;
					    Integer testWordCount = 0;
					    System.out.println("Numbers: ");
					    for (int j = 0; j < testNumberStrings.length; j++) {
					    	Integer theNumber = Integer.parseInt(testNumberStrings[j]);
					    	if (j == 0) {
					    		testWordLenght = theNumber;
					    	} else if (j == 1) {
					    		testWordCount = theNumber;
					    	}
					    }
		    			
		    			ArrayList<String> theStrings = new ArrayList<String>();
		    			
				    	for (int l = 0; l < testWordCount; l++) {
				    		if (scan == null) {
							    System.out.println("Bad input data");
					    		return;
				    		}
				    		String scanLine = br.readLine();
				    		theStrings.add(scanLine);
				    	}
						DNATest theOptional = new DNATest(theStrings, testWordCount, testWordLenght);

						theOptional.sortDNA();
				    	System.out.println("\nOrdered numbers" );
				    	for (int k = 0; k < theOptional.getStringList().size(); k++) {
				    		String  theDNA = theOptional.getStringList().get(k);
				    		System.out.println(theDNA + " disorder = " + theOptional.calculateDisordering(theDNA));
				    		
				    	}
		    		}
		    	}
		   } finally {
			   
		   }
	}
}
		      

