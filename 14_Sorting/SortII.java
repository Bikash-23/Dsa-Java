public class SortII {
    //---------------------Merge Sort Start------------------------
    static void mergeSort(int arr[], int low, int high) {
        if (low >= high)
            return;

        int mid = (low + high) / 2;
    
        mergeSort(arr, low, mid);
     
        mergeSort(arr, mid + 1, high);
        
        merge(arr, low, mid, high);
    }

    static void merge(int arr[], int low, int mid, int high) {
        int k = 0;
        int temp[] = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++;
            } else {
                temp[k] = arr[right];
                right++;
            }
            k++;
        }
        //remainig left side element
        while (left <= mid) {
            temp[k] = arr[left];
            k++;
            left++;
        }
        //remaining right side element
        while (right <= high) {
            temp[k] = arr[right];
            k++;
            right++;
        }
        //copy to main array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }
    //---------------------Merge Sort End------------------------

    //---------------------Quick Sort Start------------------------

    static void quickSort(int arr[],int low,int high){
        if(low<high){
            int parInx = partition(arr,low,high);
            quickSort(arr, low, parInx-1);
            quickSort(arr, parInx+1, high);
        }
    }
    static int partition(int arr[],int low,int high){
        int i = low,j = high;
        int pivot = arr[low];
        while (i<j) {
            while (arr[i]<=pivot && i<=high-1) {
                i++;
            }
            while (arr[j]>pivot && j>=low+1) {
                j--;
            }
            if(i<j)
            swap(arr,i,j);
        }
        swap(arr,low,j);
        return j;
    }

    //---------------------Quick Sort End------------------------

    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length - 1;
        printArr(arr);
        // mergeSort(arr, 0, n);
        quickSort(arr, 0, n);
        printArr(arr);
    }
}
