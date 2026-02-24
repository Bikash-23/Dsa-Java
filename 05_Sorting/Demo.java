class Demo {
   public static void bubbleSort(int arr[]) {
        int n = arr.length;
        // Outer loop runs n-1 times (maximum passes needed)
        for (int turn = 0; turn < n - 1; turn++) {
            int swap = 0; // keeps track of whether any swap happened in this pass

            // Inner loop compares adjacent elements, shrinking each pass
            for (int i = 0; i < n - 1 - turn; i++) {
                // If current element is greater than next, swap them
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap++; // increment swap counter
                }
            }

            // If no swaps occurred, array is already sorted → exit early
            if (swap == 0) {
                break;
            }
        }
    }
    public static void sellectionSort(int arr[]){
        // loop first ele to 2nd last element -> 0 to n-2
        // beacuse no at the time of last iteration only max element left at the last 
        for(int i =0;i < arr.length -1;i++){
            int minIdx = i;
            // loop 2nd ele to last element ->  i+1 to n-1;
            for(int j = i+1;j< arr.length;j++){
                // find min arr index
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }
            // swap min element to i'th element 
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    //Tc = O(n^2)
    public static void insertionSort(int arr[]){
        for(int i = 1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct possition to insert
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]= curr;
        }
    }
    
    // for min range element TC = O(n+range) for +ve number
    public static void countingSort(int arr[]){
        int largest = arr[0];
        for(int i = 0;i<arr.length ;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        int count[] = new int[largest+1];
        for(int i = 0;i<arr.length ;i++){
            count[arr[i]]++;
        }
        //sorting
        int j =0;
        for(int i =0;i<count.length ; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArray(int arr[]){
        //for-each loop
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        // Example array to sort
        int arr[] = {5, 4, 1, 3, 2};

        insertionSort(arr);
        // print sorted arr
        printArray(arr);
        
        int newArr[] = {1,4,1,3,2,4,3,7};
        countingSort(newArr);
        printArray(newArr);

    }
        
}