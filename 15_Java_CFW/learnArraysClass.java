import java.util.Arrays;

public class learnArraysClass {
   public static void main(String[] args) {
    // int[] num = {1,2,3,4,5,6,7,8,9,10};
    // int idx = Arrays.binarySearch(num, 5);
    // System.out.println(idx);

    int[] num = {2,3,1,5,7,10,9,8,4};
    // Arrays.sort(num);
    Arrays.fill(num, 11);
    for (int i : num) {
        System.out.print(i+" ");
    }

   } 
}
