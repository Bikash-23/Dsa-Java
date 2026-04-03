public class Rec2 {
    public static void occIdx(int arr[], int key, int i) {
        int n = arr.length;
        if (i > n - 1) {
            return;
        }
        if (key == arr[i]) {
            System.out.print(i + " ");
        }
        occIdx(arr, key, i + 1);

    }

    static String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void numToWords(int num) {
        // base case
        if (num == 0) {
            return;
        }
        numToWords(num / 10);
        int digit = num % 10;
        System.out.print(words[digit] + " ");
    }

    public static int lenOfString(String str) {
        // Base case: empty string has length 0
        if (str.equals("")) {
            return 0;
        }
        // Recursive case: count 1 + length of rest of string
        return 1 + lenOfString(str.substring(1));
    }

    public static void allSubString(String str, int i, int j) {
        int n = str.length();

        // Base case: when start index reaches end
        if (i == n) {
            return;
        }

        // If end index exceeds length, reset end and move start forward
        if (j > n) {
            allSubString(str, i + 1, i + 1);
            return;
        }

        // Print current substring
        System.out.println(str.substring(i, j));

        // Recursive call: increase end index
        allSubString(str, i, j + 1);
    }

    public static int countHelper(String str, int i, int j) {
        int n = str.length();

        // Base case: when start index reaches end
        if (i == n) {
            return 0;
        }

        // If end index exceeds length, reset and move start forward
        if (j >= n) {
            return countHelper(str, i + 1, i + 1);
        }

        // Count if first and last characters match
        int count = 0;
        if (str.charAt(i) == str.charAt(j)) {
            count = 1;
        }

        // Recurse with next end index
        return count + countHelper(str, i, j + 1);
    }

    static void towerOfHanoi(int n, char src, char helper, char dest) {
        if (n == 0) {
            return; // Base case: no disks left
        }
        // Step 1: Move n-1 disks from src to helper
        towerOfHanoi(n - 1, src, dest, helper);

        // Step 2: Move the nth disk from src to dest
        System.out.println("Move disk " + n + " from " + src + " to " + dest);

        // Step 3: Move n-1 disks from helper to dest
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // int key = 2;
        // occIdx(arr, key, 0);

        // numToWords(1035);

        // String s = "hello";
        // System.out.println("Length of string: " + lenOfString(s));

        // for (int i = 0; i < s.length(); i++) {
        // for (int j = i + 1; j < s.length(); j++) {
        // System.out.println(s.substring(i, j));
        // }
        // System.out.println();
        // }

        // allSubString(s, 0, 1);
        // String str = "abcab";
        // System.out.println(countHelper(str, 0, 0));

        int n = 3; // Number of disks
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}