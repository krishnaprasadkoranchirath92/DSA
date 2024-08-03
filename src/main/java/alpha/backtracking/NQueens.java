package alpha.backtracking;

public class NQueens {

	public static void main(String[] args) {
		int n = 4;
		char[][] chessBoard = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				chessBoard[i][j] = 'X';
			}
		}
		placeNQueens(chessBoard, 0);
	}

	private static void placeNQueens(char[][] chessBoard, int row) {
		if (row == chessBoard.length) {
			printChessBoard(chessBoard);
			return;
		}
		for (int j = 0; j < chessBoard.length; j++) {
			if (isSafe(chessBoard, row, j)) {
				chessBoard[row][j] = 'Q';
				placeNQueens(chessBoard, row + 1);
				chessBoard[row][j] = 'X';

			}
		}
	}

	private static boolean isSafe(char[][] chessBoard, int row, int col) {
		for (int i = row - 1; i >= 0; i--) {
			if (chessBoard[i][col] == 'Q') {
				return false;
			}
		}
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (chessBoard[i][j] == 'Q') {
				return false;
			}
		}

		for (int i = row - 1, j = col + 1; i >= 0 && j < chessBoard.length; i--, j++) {
			if (chessBoard[i][j] == 'Q') {
				return false;
			}
		}
		return true;
	}

	static void printChessBoard(char[][] chessBoard) {
		System.out.println("-----------------------CHESS BOARD--------------------------");
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard.length; j++) {
				System.out.print(chessBoard[i][j] + " ");
			}
			System.out.println();
		}
	}
}
