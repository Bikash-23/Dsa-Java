import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class learnIterator {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(50);

        Iterator<Integer> it = li.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
