package connectFour;

import connectFour.game.Game;
import connectFour.player.Player;
import connectFour.player.RandomPlayer;

public class MainLauncher {
	public static void main(String args[]) {
		System.out.println("Connect Four!");
		
		Player p1 = new RandomPlayer();
		Player p2 = new RandomPlayer();
		
		Game game = new Game(p1, p2);
		game.test();
	}
}
