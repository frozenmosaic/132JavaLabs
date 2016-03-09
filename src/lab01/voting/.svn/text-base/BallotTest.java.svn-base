package lab01.voting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class BallotTest {
	
	private Ballot ballot;
	private Candidate c1;
	private Candidate c2;

	@Before
	public void setUp() {
		ballot = new Ballot("City Council");
		c1 = new Candidate("Joe", Candidate.DEMOCRAT);
		c2 = new Candidate("Mary", Candidate.REPUBLICAN);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("City Council", ballot.getElection());
		assertEquals(0, ballot.getNumCandidates());
	}
	
	@Test
	public void testAddCandidate() {
		ballot.addCandidate(c1);
		assertEquals(1, ballot.getNumCandidates());
	}
	
	@Test
	public void testGetCandidateTrue() {
		ballot.addCandidate(c1);
		ballot.addCandidate(c2);
		assertEquals(c1, ballot.getCandidate("Joe"));
	}
	
	@Test
	public void testGetCandidateFalse() {
		ballot.addCandidate(c1);
		ballot.addCandidate(c2);
		assertEquals(null, ballot.getCandidate("Bill"));
	}
	
	@Test
	public void testVoteForCandidateTrue() {
		ballot.addCandidate(c2);
		ballot.voteForCandidate("Mary");
		assertEquals(1, c2.getVotes());
	}
	
	@Test
	public void testVoteForCandidateFalse() {
		ballot.voteForCandidate("Bill");
	}
	
	@Test
	public void testVoteStraightTicketTrue() {
		ballot.addCandidate(c1);
		ballot.addCandidate(c2);
		Candidate c3 = new Candidate("Bill", Candidate.DEMOCRAT);
		ballot.addCandidate(c3);
		ballot.voteStraightTicket(Candidate.DEMOCRAT);
		assertEquals(1, c1.getVotes());
		assertEquals(1, c3.getVotes());
	}
	
	@Test
	public void testVoteStraightTicketFalse() {
		ballot.addCandidate(c1);
		ballot.addCandidate(c2);
		ballot.voteStraightTicket(Candidate.INDEPENDENT);
	}

}
