import java.util.ArrayList;
import java.util.Collections;

public class arrList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1); // O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        // System.out.println(list);

        // System.out.println(list.get(2)); // index , TC-> O(1)

        // list.remove(2); // O(n)
        // System.out.println(list);

        // list.set(2,10);//O(n)
        // System.out.println(list);

        // list.add(0,10);//O(n)
        // System.out.println(list);

        // System.out.println(list.contains(1));//O(n)
        // System.out.println(list.contains(11));

        // System.out.println(list.size());

        // //Q.reverse list
        // int n = list.size();
        // for (int i = 0; i < n / 2; i++) {
        //     int temp = list.get(i);
        //     list.set(i, list.get(n - 1 - i));
        //     list.set((n - 1 - i), temp);
        // }
        // System.out.println(list);


        // Q.find max
        // int max = list.get(0);
        // for(int i = 1;i<list.size();i++){
        //     if(list.get(i)>max)
        //         max = list.get(i);
        // }
        // System.out.println(max);
 
        // //accending
        // Collections.sort(list);

        // //decending
        // Collections.sort(list,Collections.reverseOrder());

        // System.out.println(list);
    }
}
