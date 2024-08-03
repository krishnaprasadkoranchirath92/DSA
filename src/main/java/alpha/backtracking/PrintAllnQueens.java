package alpha.backtracking;

public class PrintAllnQueens {

	public static void main(String[] args) {
		int n = 2;
		char[][] chessBoard = new char[n][n];
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard.length; j++) {
				chessBoard[i][j] = 'X';
			}
		}
		printQueens(chessBoard, 0);
	}

	private static void printQueens(char[][] chessBoard, int row) {
		if(row == chessBoard.length) {
			printChessBoard(chessBoard);
			return;
		}
		for(int j=0; j<chessBoard.length;j++) {
			chessBoard[row][j] = 'Q';
			printQueens(chessBoard, row+1);
			chessBoard[row][j] = 'X';
		}
		
	}

	private static void printChessBoard(char[][] chessBoard) {
		System.out.println("-----------Chessboard--------------");
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard.length; j++) {
				System.out.print(chessBoard[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
