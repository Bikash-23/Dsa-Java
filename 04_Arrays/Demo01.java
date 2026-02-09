import java.util.*;

public class Demo01 {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int[] maxMinArray(int arr[]) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new int[] { max, min };
    }

    // Time Complexity = O(logN) Space Compexity = O(1)
    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid; // found
            } else if (arr[mid] < key) {
                start = mid + 1; // search right half
            } else {
                end = mid - 1; // search left half
            }
        }
        return -1; // not found
    }
    // //TC = O(N) only return output no change in arr
    // public static void revArray(int arr[]){
    // for(int i = arr.length -1;i >= 0;i--){
    // System.out.print(arr[i] + " ");
    // }
    // }

    // TC = O(N)
    public static int[] reverseArray(int arr[]) {
        int first = 0, last = arr.length - 1;
        while (first < last) {
            arr[first] = arr[first] ^ arr[last];
            arr[last] = arr[first] ^ arr[last];
            arr[first] = arr[first] ^ arr[last];
            first++;
            last--;
        }
        return arr;
    }

    public static void pairsArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("[" + arr[i] + "," + arr[j] + "]" + ", ");
            }
        }
    }

    // // TC = O(n^3) SC = O(1)
    // public static void maxSubArraySum(int arr[]) {
    // int maxSum = arr[0];
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // int currSum = 0;
    // for (int k = i; k <= j; k++) {
    // currSum += arr[k];
    // }
    // if (currSum > maxSum) {
    // maxSum = currSum;
    // }
    // }
    // }
    // System.out.println("Max Subarray Sum: " + maxSum);
    // }

    // //TC = O(n^2) SC = O(n)
    // public static void maxSubArraySum(int arr[]) {
    //     int n = arr.length;
    //     int[] prefix = new int[n];
    //     prefix[0] = arr[0];

    //     // Build prefix sum array
    //     for (int i = 1; i < n; i++) {
    //         prefix[i] = prefix[i - 1] + arr[i];
    //     }

    //     int maxSum = Integer.MIN_VALUE;

    //     // Check all subarrays using prefix sums
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i; j < n; j++) {
    //             int currSum = prefix[j] - (i > 0 ? prefix[i - 1] : 0);
    //             if (currSum > maxSum) {
    //                 maxSum = currSum;
    //             }
    //         }
    //     }

    //     System.out.println("Max Subarray Sum: " + maxSum);
    // }

    // TC = O(N) Kadane’s Algorithm sc = O(1)
    public static void maxSubarraySum(int arr[]) {
        int currSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Max Subarray Sum: " + maxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating
        // int arr1[] = new int[10];
        // int arr2[] = { 1, 2, 3 };
        // String fruits[] = { "apple", "banana", "orange" };
        // System.out.println("Enter Num:");
        // //data enter
        // arr1[0] = sc.nextInt();
        // arr1[1] = sc.nextInt();
        // arr1[2] = sc.nextInt();
        // //data print
        // for(int i = 0;i<3;i++){
        // System.out.println(arr1[i]);
        // }
        // //update
        // arr1[2]= 100;
        // System.out.println(arr1[0] + " "+ arr1[1] + " "+arr1[2]);

        // int arr[] = {1,2,3,4,5,7,8,10,12,15};
        // int key= 13;
        // System.out.println("Index: "+linearSearch(arr, key));

        // int marks[] = {1,2,6,3,5};
        // int result[] = maxMinArray(marks);
        // System.out.println("Max: "+result[0] + " Min: "+result[1]);

        // int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
        // int key = 10;
        // System.out.println(binarySearch(arr, key));

        // int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
        // int newArr[] = reverseArray(arr);
        // for(int i =0 ;i< newArr.length;i++){
        // System.out.print(newArr[i]+" ");
        // }

        // int arr[] = { 2, 4, 6, 8, 10 };
        // pairsArray(arr);

        int arr[] = { -2, 4, -6, 8, 10 };
        maxSubarraySum(arr);

        sc.close();
    }
}
