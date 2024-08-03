package alpha.backtracking;

public class NqueensPrintIfPossible {

	public static void main(String[] args) {
		int n = 3;
		char[][] chessBoard = new char[n][n];
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard.length; j++) {
				chessBoard[i][j] = 'X';
			}
		}
		if (nQueens(chessBoard, 0)) {
			System.out.println("Exists");
			printCB(chessBoard);
		} else {
			System.out.println("Not Exists");
		}

	}

	private static void printCB(char[][] chessBoard) {
		System.out.println("------------CB----------------");
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard.length; j++) {
				System.out.print(chessBoard[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static boolean nQueens(char[][] chessBoard, int row) {
		if (row == chessBoard.length) {
			return true;
		}
		for (int j = 0; j < chessBoard.length; j++) {
			if (isSafe(chessBoard, row, j)) {
				chessBoard[row][j] = 'Q';

				if (nQueens(chessBoard, row + 1)) {
					return true;
				}
				chessBoard[row][j] = 'X';
			}
		}
		return false;

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
