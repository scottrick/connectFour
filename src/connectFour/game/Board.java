package connectFour.game;

public class Board {
	
	private static final int EMPTY_SQAURE = 0;

	private int[][] board;
	
	private final int width;
	private final int height;
	
	/* default board size */
	public Board() {
		this.width = 7;
		this.height = 6;
		
		makeBoard();
	}
	
	/* custom board size */
	public Board(int width, int height) {
		this.width = width;
		this.height = height;
		
		makeBoard();
	}
	
	private void makeBoard() {
		this.board = new int[width][height];
	}
	
	/* returns true if the move was valid */
	public boolean makeMove(int playerIdentifier, int column) {
		if (column < 0 || column >= width) {
			return false;
		}
		
		if (playerIdentifier == EMPTY_SQAURE) {
			//player identifier can't be the empty square identifier
			return false;
		}
		
		for (int y = 0; y < height; y++) {
			if (board[column][y] == 0) {
				board[column][y] = playerIdentifier;
				
				return true;
			}
		}
		
		return false;
	}
	
	public String toString() {
		String result = "";
		
		for (int y = height - 1; y  >= 0; y--) {
			for (int x = 0; x < width; x++) {
				result += board[x][y];
			}
			
			result += "\n";
		}
		
		return result;
	}
	
}
