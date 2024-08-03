package alpha.backtracking;

public class SudokuSolver {

	public static void main(String[] args) {
		int[][] sudoku = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 }, { 4, 9, 0, 1, 5, 7, 0, 0, 2 }, { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
				{ 1, 8, 5, 0, 6, 0, 0, 2, 0 }, { 0, 0, 0, 0, 2, 0, 0, 6, 0 }, { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
				{ 0, 3, 0, 0, 7, 2, 0, 0, 4 }, { 0, 4, 9, 0, 3, 0, 0, 5, 7 }, { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
		if (solveSudoku(sudoku, 0, 0)) {
			System.out.println("Sudoku success");
			printSudoku(sudoku);
		} else {
			System.out.println("Sudoku failed");
		}
	}

	private static boolean solveSudoku(int[][] sudoku, int row, int col) {

		if (row == 9) {
			return true;
		}
		int nextRow = row;
		int nextCol = col + 1;
		if (col == 8) {
			nextRow = row + 1;
			nextCol = 0;
		}
		if (sudoku[row][col] != 0) {
			return solveSudoku(sudoku, nextRow, nextCol);
		}

		for (int num = 1; num <= 9; num++) {
			if (isSafe(sudoku, num, row, col)) {
				sudoku[row][col] = num;
				if (solveSudoku(sudoku, row, col)) {
					return true;
				}
				sudoku[row][col] = 0;
			}
		}
		return false;
	}

	private static boolean isSafe(int[][] sudoku, int num, int row, int col) {
		int root = (int) Math.sqrt(sudoku.length);
		for (int i = 0; i < sudoku.length; i++) {
			if (sudoku[i][col] == num) {
				return false;
			}
		}

		for (int i = 0; i < sudoku.length; i++) {
			if (sudoku[row][i] == num) {
				return false;
			}
		}

		int sr = (row / root) * root;
		int sc = (col / root) * root;
		for (int i = sr; i < sr + root; i++) {
			for (int j = sc; j < sc + root; j++) {
				if (sudoku[i][j] == num) {
					return false;
				}
			}
		}

		return true;
	}

	private static void printSudoku(int[][] sudoku) {
		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku.length; j++) {
				System.out.print(sudoku[i][j] + " ");
			}
			System.out.println();
		}
	}

}
