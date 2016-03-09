package lab01.voting;
import java.util.ArrayList;

/*
 * GWB: You need to include JavaDoc for the class and for each of the methods.
 * The assignment stated: Your Ballot class must contain an JavaDoc comment for
 * the class (see the Candidate class for an example) and JavaDoc comments for
 * each constructor and method.
 */

public class Ballot {

	private String electionName;
	private ArrayList<Candidate> candidatesList;
	
public Ballot(String electionName) {
	this.electionName = electionName;
	candidatesList = new ArrayList<Candidate>();
}

public String getElection() {
	return electionName;
}

public int getNumCandidates() {
	return candidatesList.size();
}

public void addCandidate(Candidate newCandidate) {
	candidatesList.add(newCandidate);
}

public Candidate getCandidate(String name) {
	for (int index=0; index < getNumCandidates(); index++) {
		Candidate searching = candidatesList.get(index);
		if (searching.getName().equals(name)) {
			return searching;
		}
	}
	return null;
}

public void voteForCandidate(String candidateName) {
	Candidate c1 = getCandidate(candidateName);
	if (c1 != null) {
		c1.increaseVotes();
	} else {
		System.out.println("No candidate with such name.");
	}
}

public void voteStraightTicket(String party) {
	/*
	 * GWB: Might a boolean be a better choice than an int here?
	 */
	int control=0;
	for (int index=0; index < getNumCandidates(); index++) {
		Candidate searching = candidatesList.get(index);
		if (searching.getParty().equals(party)) {
			searching.increaseVotes();
			control++;
		}
	}
	
	if (control == 0) {
		System.out.println("No candidates in such party.");
	}
}
}
