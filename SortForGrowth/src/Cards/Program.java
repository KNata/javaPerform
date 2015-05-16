package Cards;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import SportForms.SportTeam;

public class Program {

	// main class
	
	public static void main(String[] args) throws IOException {
		 File file = new File("CardsNumbers.txt"); 

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
			    System.out.println("Cards: ");
			    for (int i = 0; i < numberStrings.length; i++) {
			    	Integer theNumber = Integer.parseInt(numberStrings[i]);
			    	
			    	if (i == 0) {
			    		System.out.println("Number of cards are " + theNumber.intValue());
			    		cardCount = theNumber.intValue();
			    	} else {
			    	    theNumbers.add(theNumber);
			    	    System.out.print( theNumber.intValue() + ", ");
			    	 }
			    }
	    		SortCards theCards = new SortCards();
	    		boolean addCardsResult = theCards.addCards(cardCount, theNumbers);
	    		theCards.sortList(theCards.getNumbSet());
			    Integer missedCard = theCards.checkCards();
			    
			    if (missedCard.intValue() == 0) {
			    	System.out.println("No missed cards");
			    } else {
			    	System.out.println("Missed card is " + missedCard.intValue());
			    }
		   } finally {
			   
		   }
	}
}
