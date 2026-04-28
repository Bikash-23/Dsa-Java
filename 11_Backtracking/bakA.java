public class bakA {
    // Q.create array give them value 1,2..5(n) then -2 from all value
    static void changeArr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        // backtracking
        arr[i] -= 2;
    }

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Q. Find subset
    static void subSet(String s, String ans, int i) {
        // base case
        if (i == s.length()) {
            if (ans == "") {
                System.out.println("Null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // recursion
        // element add
        subSet(s, ans + s.charAt(i), i + 1);
        // element not add
        subSet(s, ans, i + 1);
    }

    // Q. Find permutation
    static void permutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutation(newStr, ans + ch);
        }
    }

    // Q.N-Queen
    public static void printBoard(int board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isSafe(int board[][], int row, int col, int n) {

        // check column (upwards)
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 1)
                return false;
        }

        // check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        // check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    static int count = 0;

    public static void nQueen(int board[][], int row, int n) {
        // base case: all queens placed
        if (row == n) {
            printBoard(board);
            count++;
            return;
        }

        // try placing queen in each column of current row
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 1;
                nQueen(board, row + 1, n); // recurse for next row
                board[row][col] = 0; // backtrack
            }
        }
    }

    // Q. Gird Ways
    // public static int gridWays(int i, int j, int n, int m) {
    //     // base case
    //     if (i == n - 1 && j == m - 1) {
    //         return 1;
    //     }
    //     // boundary case: out of grid
    //     if (i >= n || j >= m) {
    //         return 0;
    //     }
    //     // move down
    //     int w1 = gridWays(i + 1, j, n, m);
    //     // move right
    //     int w2 = gridWays(i, j + 1, n, m);

    //     return w1 + w2;
    // }

    // Function to calculate factorial
    public static long factorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Function to calculate nCr
    public static long nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // Function to calculate grid ways using combinatorics
    public static long gridWays(int n, int m) {
        return nCr(n + m - 2, n - 1);
    }

    public static void main(String[] args) {
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);

        // String s = "abc";
        // // subSet(s, "", 0);
        // permutation(s, "");

        // int n = 4;
        // int board[][] = new int[n][n];
        // nQueen(board, 0, n);
        // System.out.println(count);

        // System.out.println(gridWays(0, 0, 3, 3));
        System.out.println(gridWays(3, 3));

    }
}
