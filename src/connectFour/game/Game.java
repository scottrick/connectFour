package connectFour.game;

import connectFour.player.Player;

public class Game {

	private final Player playerOne;
	private final Player playerTwo;
	
	private Board board;
	
	public Game(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
		
		board = new Board();
	}
	
	public void test() {
		board.makeMove(1, 1);
		board.makeMove(2, 2);
		board.makeMove(1, 2);
		board.makeMove(2, 6);
		board.makeMove(1, 6);
		board.makeMove(2, 0);	
		
		System.out.println(board.toString());
	}
}
