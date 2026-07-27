public class SortI {
  static void swap(int[] arr, int i, int j) {
    arr[i] = arr[i] ^ arr[j];
    arr[j] = arr[i] ^ arr[j];
    arr[i] = arr[i] ^ arr[j];
}


    //TC -> Best/avg./worst -> O(n^2) SC -> O(1)
    static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[min]) {
                    // min index
                    min = j;
                }
            }
            // swap value b/w arr[i] and min value
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    //TC -> O(n^2) SC -> O(1)
    static void Sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    //TC -> best(optimized bubble sort) -O(n) avg./worst -> O(n^2) SC -> O(1)
    static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = n-1;i>=0;i--){
            boolean swapped = false; // track if any swap happens(Optimized bubble sort)
            for(int j = 0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swapped = true;
                }
            }
            // if no swaps in this pass, array is already sorted
            if(!swapped) break;
        }
    }

    //TC -> best -> O(n) avg./worst -> O(n^2) SC -> O(1)
    static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int j =i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr, j-1, j);
                j--;
            }
        }
    }

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        printArr(arr);
        // selectionSort(arr);
        // Sort(arr);
        // bubbleSort(arr);
        insertionSort(arr);
        printArr(arr);
    }
}
