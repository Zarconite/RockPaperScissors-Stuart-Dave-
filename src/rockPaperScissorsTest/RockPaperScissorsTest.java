package rockPaperScissorsTest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rockPaperScissors.RockPaperScissors;



public class RockPaperScissorsTest {

	/*
	@Test
	public void PlayerRock() {
		if(RockPaperScissors.aiMove()=="rock") {
		assertEquals("Player Wins", RockPaperScissors.gameSetup("Rock"),"Draw!");
		}
		else if(RockPaperScissors.aiMove()=="paper") {
			assertEquals("Player Wins", RockPaperScissors.gameSetup("Rock"),"Player wins!");
		}
		else {
			assertEquals("Player Wins", RockPaperScissors.gameSetup("Rock"),"Player loses!");
		}
	}
	
	*/
	@Test
	public void PRockCRock() {
		assertEquals("Player Wins", RockPaperScissors.game("rock","rock"),"rock draws with rock");
	}
	@Test
	public void PRockCPaper() {
		assertEquals("Player Wins", RockPaperScissors.game("rock","paper"),"paper beats rock, Player loses!");
	}
	@Test
	public void PRockCscissors() {
		assertEquals("Player Wins", RockPaperScissors.game("rock","scissors"),"rock beats scissors, Player wins!");
	}

	@Test
	public void PPaperCRock() {
		assertEquals("Player Wins", RockPaperScissors.game("paper","rock"),"paper beats rock, Player wins!");
	}
	@Test
	public void PPaperCPaper() {
		assertEquals("Player Wins", RockPaperScissors.game("paper","paper"),"paper draws with paper");
	}
	@Test
	public void PPaperCscissors() {
		assertEquals("Player Wins", RockPaperScissors.game("paper","scissors"),"scissors beats paper, Player loses!");
	}

	@Test
	public void PScissorsCRock() {
		assertEquals("Player Wins", RockPaperScissors.game("scissors","rock"),"rock beats scissors, Player loses!");
	}
	@Test
	public void PScissorsCPaper() {
		assertEquals("Player Wins", RockPaperScissors.game("scissors","paper"),"scissors beats paper, Player wins!");
	}
	@Test
	public void PScissorsCScissors() {
		assertEquals("Player Wins", RockPaperScissors.game("scissors","scissors"),"scissors draws with scissors");
	}

	@Test
	public void Pfish() {
		assertEquals("Player Wins", RockPaperScissors.game("fish","scissors"),"Error, please enter rock, paper or scissors!");
	}


}

