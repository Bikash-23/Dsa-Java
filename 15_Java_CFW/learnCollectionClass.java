import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class learnCollectionClass {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(12);
        list.add(12);
        list.add(3);
        list.add(42);
        list.add(2);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list,12));
        // Collections.sort(list);
        Collections.sort(list,Comparator.reverseOrder());
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
    }
}
