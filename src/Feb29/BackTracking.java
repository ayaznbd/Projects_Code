//package Feb29;
//
//public class BackTracking {
//    public static void main(String[] args) {
//        int n = 4;
//        boolean[][] board = new boolean[n][n];
//        NqueensBoard(board, 0)
//
//    }
//
//    public static void NqueensBoard(boolean[][] board, int row) {
//        if (row == board.length) {
//            display(board);
//            return;
//        }
//        for (int col = 0; col < board.length; col++) {
//            if (isSafe(board, row, col)) {
//                board[row][col] = true;
//                NqueensBoard(board, row + 1);
//                board[row][col] = false;
//            }
//
//        }
//    }
//
//    private static void display(boolean[][] board) {
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                if (board[i][j]) {
//                    System.out.print("Q");
//                } else {
//                    System.out.print("X");
//                }
//
//            }
//            System.out.println();
//
//        }
//        System.out.println();
//    }
//
//    private static boolean isSafe(boolean[][] board, int row, int col) {
//        int left = Math.min(row, col);
//        for (int i = 1; i <= left; i++) {
//            if (board[row - i][col - i]) {
//                return false;
//            }
//
//        }
//        int right = Math.min(row, board.length - col - 1);
//        for (int i = 1; i <= right; i++) {
//            if (board[row - i][col - i]) {
//                return false;
//            }
//
//        }
//
//    }
//}
//
