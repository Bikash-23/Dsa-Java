public class Rec1 {
    static void PrintNumDec(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        PrintNumDec(n - 1);
    }

    static void PrintNumInc(int n) {
        if (n == 0) {
            return;
        }
        PrintNumInc(n - 1);
        System.out.print(n + " ");
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int sumNNatural(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return n + sumNNatural(n - 1);
    }

    static int fibbonachi(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibbonachi(n - 1) + fibbonachi(n - 2);
    }

    static boolean sortedArray(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sortedArray(arr, i + 1);
    }

    static int firstOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOcc(arr, key, i + 1);
    }

    static int lastOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOcc(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    static int lastOccarance(int arr[], int key, int i) {
        // remember -> i = arr.length -1;
        if (i < 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return lastOccarance(arr, key, i - 1);
    }

    // TC -> O(n)
    static int powerOfNum(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * powerOfNum(x, n - 1);
    }

    // optimized TC -> O(logn)
    static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = power(x, n / 2);
        if (n % 2 == 0) {
            return halfPower * halfPower;
        }
        return x * halfPower * halfPower;
    }

    // Q.Tiling Problem: Given a "2*n" floor and tiles of size "2*1" , count the
    // number of ways to tiles the given bound using the 2*1
    // tiles.(Horizontaly/Vertically)
    static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // Vertical -> tilingProblem(n - 1)
        // Horizontal -> tilingProblem(n - 2)
        return tilingProblem(n - 1) + tilingProblem(n - 2);
    }

    static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    // Q. Given n friend, each one can remain single or can be paired up with some
    // other friends. Each friends can be paired only once. find out the total
    // number of ways in which friends can remain single or can be paired up.
    static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }

    // Q. Print all binary strings of size N without consicutive "1".
    public static void printBinStrings(int n, int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        printBinStrings(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        // PrintNumDec(10);

        // PrintNumInc(10);

        // System.out.println(fibbonachi(5));
        // for (int i = 0; i <= 10; i++) {
        // System.out.println(fibbonachi(i));
        // }

        // System.out.println(factorial(5));
        // for(int i = 0; i<=5; i++){
        // System.out.println(factorial(i));
        // }

        // System.out.println(sumNNatural(5));
        // for(int i = 0; i<=5; i++){
        // System.out.println(sumNNatural(i));
        // }

        // int arr1[] = {1,2,3,4,5};
        // int arr2[] = {1,2,3,5,4};
        // System.out.println(sortedArray(arr1, 0));
        // System.out.println(sortedArray(arr2, 0));

        // int arr3[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println("Index: "+firstOcc(arr3, 5, 0));
        // System.out.println("Index: "+lastOcc(arr3, 5, 0));
        // System.out.println("Index: "+lastOccarance(arr3, 5, 8));

        // System.out.println(powerOfNum(2,10));
        // System.out.println(power(2,10));

        // System.out.println(tilingProblem(6));

        // removeDuplicates("appnnacollege", 0, new StringBuilder(""), new boolean[26]);

        // System.out.println(friendsPairing(2));

        printBinStrings(3, 0, "");
    }
}