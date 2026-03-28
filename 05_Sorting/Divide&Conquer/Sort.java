public class Sort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void mergeSort(int arr[], int si, int ei) {
        // Base
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        // left
        mergeSort(arr, si, mid);
        // right
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        // iterator for left part
        int i = si;
        // iterator for right part
        int j = mid + 1;
        // iterator for temp arr
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copy temp to original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pIdx = partition(arr, si, ei);
        // left
        quickSort(arr, si, pIdx - 1);
        // right
        quickSort(arr, pIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        // mergeSort(arr, 0, arr.length - 1);
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
