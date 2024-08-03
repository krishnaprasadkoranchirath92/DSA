package alpha.backtracking;

public class CountNqueens {
	static int count = 0;

	public static void main(String[] args) {
		int n = 4;
		char[][] chessBoard = new char[n][n];
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard.length; j++) {
				chessBoard[i][j] = 'X';
			}
		}
		printChessBoard(chessBoard);
		countNQueens(chessBoard, 0);
		System.out.println(count);

	}

	private static void printChessBoard(char[][] chessBoard) {
		System.out.println("------------CB----------------");
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard.length; j++) {
				System.out.print(chessBoard[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void countNQueens(char[][] chessBoard, int row) {
		if (row == chessBoard.length) {
			printChessBoard(chessBoard);
			count++;
			return;
		}

		for (int j = 0; j < chessBoard.length; j++) {
			if (isSafe(chessBoard, row, j)) {
				chessBoard[row][j] = 'Q';
				countNQueens(chessBoard, row + 1);
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

}
