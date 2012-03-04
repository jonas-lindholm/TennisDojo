package ske.dojo.tennis;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TennisMatchFestTest {

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

		// Fest
		assertThat(match.vinner()).isEqualTo(new Player("Kalle"));

		assertThat(match.vinner()).isIn(new Object[] { new Player("Nisse"), new Player("Kalle") });
	}
}
