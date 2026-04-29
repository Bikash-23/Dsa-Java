import java.util.ArrayList;
import java.util.List;

public class arrList2 {

    public static int min(ArrayList<Integer> list) {
        int n = list.size();
        int i = 1;
        int min = list.get(0);
        while (i < n) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
            i++;
        }
        return min;
    }

    // Brute-Force TC->O(n^2)
    public static int MostWaterContainer(ArrayList<Integer> list) {
        int n = list.size();
        int total = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int height = Math.min(list.get(i), list.get(j));
                int width = j - i;
                int area = height * width;
                total = Math.max(total, area);
            }
        }
        return total;
    }

    // Two-Pointer TC-> O(n)
    public static int MostWaterContainer2(ArrayList<Integer> list) {
        int n = list.size();
        int total = 0;
        int right = n - 1;
        int left = 0;
        while (right > left) {
            int height = Math.min(list.get(left), list.get(right));
            int width = right - left;
            int area = height * width;
            total = Math.max(total, area);
            if (list.get(left) < list.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return total;
    }

    public static void pairSum1(ArrayList<Integer> list, int target) {
        int n = list.size();
        int l = 0, r = n - 1;
        while (r > l) {
            if (list.get(l) + list.get(r) < target) {
                l++;
            } else if (list.get(l) + list.get(r) > target) {
                r--;
            } else {
                System.out.println(List.of(list.get(l), list.get(r)));
                l++;
                r--;
            }
        }
    }

    public static void pairSum2(ArrayList<Integer> list, int target) {
        int n = list.size();
        int bp = -1;

        // Find the break point (where rotation happens)
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        // Left pointer at smallest element, right pointer at largest
        int l = (bp + 1) % n;
        int r = bp;

        while (l != r) {
            int sum = list.get(l) + list.get(r);

            if (sum == target) {
                System.out.println(List.of(list.get(l), list.get(r)));
                l = (l + 1) % n;
                r = (r - 1 + n) % n;
            } else if (sum < target) {
                l = (l + 1) % n;
            } else {
                r = (r - 1 + n) % n;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list.add(list2);

        // System.out.println(list);

        // System.out.println(min(list1));

        // ArrayList<Integer> water = new ArrayList<>();
        // water.add(2);
        // water.add(3);
        // water.add(4);
        // water.add(2);
        // water.add(3);
        // int res = MostWaterContainer(water);
        // System.out.println(res);
        // System.out.println(MostWaterContainer2(water));

        // ArrayList<Integer> pair = new ArrayList<>();
        // pair.add(1);
        // pair.add(2);
        // pair.add(3);
        // pair.add(4);
        // pair.add(5);
        // pair.add(6);

        // pairSum1(pair, 5);

        ArrayList<Integer> pair1 = new ArrayList<>();
        pair1.add(11);
        pair1.add(15);
        pair1.add(6);
        pair1.add(8);
        pair1.add(9);
        pair1.add(10);

        pairSum2(pair1, 16);
    }
}
