package SportForms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * here we read data from file and output theResult according to task
 * @author natalia
 *
 */


public class Program {
	
	public static void main(String[] args) throws IOException {
		
		 File file = new File("SportTeam.txt"); 

		   try {
			   ArrayList<SportTeam> theOlimpicTeams = new ArrayList<SportTeam>();

		       FileReader reader = new FileReader(file);
		       BufferedReader br = new BufferedReader(reader);
	    	   for (int teamIndex = 0; teamIndex< 20000; teamIndex++) {
	    		   String firstLine = br.readLine();
	    		   if ( null != firstLine) {
	    			   int numberOfMembers = Integer.parseInt(firstLine);
	    			   System.out.println("Number of members are " + numberOfMembers);
	    			   SportTeam theTeam = null;
	    			   {
		    			   String scan = br.readLine();
		    			   if (scan == null)
		    			   {
		    				   break;
		    			   }
			    	 	   	ArrayList<Integer> theNumbers = new ArrayList<Integer>();
			    	        String[] numberStrings = scan.split(" ");
			    	        System.out.println("Team: ");
			    	        for (int i = 0; i < numberStrings.length; i++) {
			    	        	Integer theNumber = Integer.parseInt(numberStrings[i]);
			    	        	theNumbers.add(theNumber);
			    	        	System.out.print( theNumber.intValue() + ", ");
			    	        }
	
		    	        	theTeam = new SportTeam(theNumbers);
	    			   }
	    	        	if (theTeam != null)
	    			   {
		    			   String scan = br.readLine();
		    			   if (scan == null)
		    			   {
		    				   break;
		    			   }
			    	 	   	ArrayList<Integer> theNumbers = new ArrayList<Integer>();
			    	        String[] numberStrings = scan.split(" ");
			    	        System.out.println("\nRequest: ");
			    	        for (int i = 0; i < numberStrings.length; i++) {
			    	        	Integer theNumber = Integer.parseInt(numberStrings[i]);
			    	        	theNumbers.add(theNumber);
			    	        	System.out.print( theNumber.intValue() + ", ");
			    	        }
			    	        
			    	        if (theNumbers.size() == 2) {
			    	        	int theRequestedResult = theTeam.calculateMembers(theNumbers);
			    	        	System.out.println("\nRequester members = " + theRequestedResult);
			    	        	theOlimpicTeams.add(theTeam);
			    	        }
	    			   }

		       }
	    	   }
		   } finally {
			   
		   }
	}

}
