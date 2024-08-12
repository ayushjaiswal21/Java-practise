import java.util.ArrayList;
import java.util.List;

public class backtracking_and_nqween {
    private final int N;

    public backtracking_and_nqween(int n) {
        this.N = n;
    }

    public boolean isSafe(int row, int col, int[][] board) {
        // Check left side of the current row
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check upper diagonal on the left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check lower diagonal on the left side
        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public void solveNQUtil(int[][] board, int col, List<List<String>> allBoards) {
        if (col == N) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < N; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 1;
                solveNQUtil(board, col + 1, allBoards);
                board[row][col] = 0; // Backtrack
            }
        }
    }

    public void saveBoard(int[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (int[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (int cell : row) {
                sb.append(cell == 1 ? 'Q' : '.');
            }
            newBoard.add(sb.toString());
        }
        allBoards.add(newBoard);
    }

    public List<List<String>> solveNQueens() {
        List<List<String>> allBoards = new ArrayList<>();
        int[][] board = new int[N][N];
        solveNQUtil(board, 0, allBoards);
        return allBoards;
    }

    public static void main(String[] args) {
        int n = 4; // Change this to the desired board size
        backtracking_and_nqween solver = new backtracking_and_nqween(n);
        List<List<String>> solutions = solver.solveNQueens();
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
