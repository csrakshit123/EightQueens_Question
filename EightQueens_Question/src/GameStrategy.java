public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		return cellId % 8;
	}
	
	private int getRow(int cellId) {
		return cellId / 8;
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);

		for (int i = 0; i < 8; i++) {
			if (placedQueens[row][i]){
				return false;
			}
			if (placedQueens[i][col]){
				return false;
			}
			if ((row - i >= 0) && (col - i >= 0) && placedQueens[row-i][col-i]){
				return false;
			}
			if ((row + i < 8) && (col + i < 8) && placedQueens[row+i][col+i]){
				return false;
			}
			if ((row - i >= 0) && (col + i < 8) && placedQueens[row-i][col+i]){
				return false;
			}
			if ((row + i < 8) && (col - i >= 0) && placedQueens[row+i][col-i]){
				return false;
			}
		}
		placedQueens[row][col] = true;
		numQueens += 1;
		return isValid;
	}
}














