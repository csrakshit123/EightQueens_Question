public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {
		int row = square / 8;
		int col = square % 8;
		if (row % 2 == 0){
			return col % 2 == 1;
		}
		else{
			return col % 2 == 0;
		}
	}
}
