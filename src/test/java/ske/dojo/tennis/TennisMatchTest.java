package ske.dojo.tennis;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TennisMatchTest {

	// @Test
	// public void testPlayer1Score() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testPlayer2Score() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testScores() {
	// fail("Not yet implemented");
	// }

	@Test
	public void testVinner() {
		TennisMatch match = new TennisMatch();

		// Junit
		assertEquals(new Player("Kalle"), match.vinner());

		// Hamcrest
		assertThat(match.vinner(), is(new Player("Kalle")));
	}
}
