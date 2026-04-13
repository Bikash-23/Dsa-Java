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

    //Q. Find permutation
    static void permutation(String str,String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i = 0;i<str.length();i++){
            char ch=str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            permutation(newStr, ans+ch);
        }
    }
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);

        String s = "abc";
        // subSet(s, "", 0);
        permutation(s, "");

    }
}
