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

    // Q. search in rotated Sorted Array
    // input: sorted,rotated array with distinct numbers(in ascending Order)
    // it is rotated at a pivot point. Find the index of given element.
    public static int search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a: left of L1
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                // case b:rigth of L1
                return search(arr, target, mid + 1, ei);
            }
        // mid on L2
        } else {
            // case c: right of L2
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                // case d: left of L2
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static int majorityElement(int arr[]) {
        int count = 0;
        int el = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                el = arr[i];
            } else if (arr[i] == el) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                count1++;
            }
        }
        if (count1 > arr.length / 2) {
            return el;
        }
        return -1;
    }

    public static void main(String[] args) {
        // int arr[] = { 6, 3, 9, 5, 2, 8 };
        // // mergeSort(arr, 0, arr.length - 1);
        // quickSort(arr, 0, arr.length - 1);
        // printArr(arr);

        // int arr2[] = { 4, 5, 6, 7, 0, 1, 2 };
        // int target = 0;// output = 4 (Idx)
        // int res = search(arr2, target, 0, arr2.length-1);
        // System.out.println(res);

        int arr3[] = { 2, 2, 2, 3, 3, 1, 2, 3, 2 };
        System.out.println(majorityElement(arr3));
    }
}
