package Reversion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Cards.SortCards;
import SportForms.SportTeam;

public class Program {
	
	// main class
	

	public static void main(String[] args) throws IOException {
		 File file = new File("Reversion.txt"); 

		   try {

		       FileReader reader = new FileReader(file);
		       BufferedReader br = new BufferedReader(reader);
	    		
		    	String scan = br.readLine();
		    	if (scan == null)
		    	{
				    System.out.println("Bad input data");
		    		return;
		    	}
			    ArrayList<Integer> theNumbers = new ArrayList<Integer>();
			    String[] numberStrings = scan.split(" ");
			    int cardCount = 0;
			    System.out.println("Numbers: ");
			    for (int i = 0; i < numberStrings.length; i++) {
			    	Integer theNumber = Integer.parseInt(numberStrings[i]);
			    	
			    	if (i == 0) {
			    		System.out.println("Numbers count is " + theNumber.intValue());
			    		cardCount = theNumber.intValue();
			    	} else {
			    	    theNumbers.add(theNumber);
			    	    System.out.print( theNumber.intValue() + ", ");
			    	 }
			    }
	    		SortNumbs theNumbersS = new SortNumbs();
	    		boolean addCardsResult = theNumbersS.addCards(cardCount, theNumbers);
	    		theNumbersS.sortList(theNumbersS.getNumbList());
	    		Integer missedNumber = theNumbersS.checkNumbers();
	    		if (missedNumber == 0) {
				    if (theNumbersS.getNumberOfChanges() == 0) {
				    	System.out.println("No changes");
				    } else {
				    	System.out.println("Changes count is " + missedNumber.intValue());
				    }
	    		} else {
	    			System.out.println("Missed Number is " + missedNumber.intValue());
	    		}
		   } finally {
			   
		   }
	}

	}


