package SportForms;

import java.util.ArrayList;

public class SportTeam {

	
	// here we sort our team members
	
	private ArrayList<Integer> teamList;
	
	SportTeam(ArrayList<Integer> aTeamList) {
		teamList = aTeamList;
	}
	
	
	public int calculateMembers(ArrayList<Integer> aRequest) {
		int low = aRequest.get(0).intValue();
		int high = aRequest.get(1).intValue();
		int theResult = 0;
		for (int i = 0; i < teamList.size(); i++) {
			Integer theGrowth  = teamList.get(i);
			if (theGrowth.intValue() >= low && theGrowth.intValue() <= high) {
				theResult++;
			}
		}
		return theResult;
	}
}
