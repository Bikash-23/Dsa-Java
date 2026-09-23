import java.util.LinkedList;
import java.util.List;;
public class learnLinkedListList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(110);
        list.add(150);
        list.add(200);
        list.add(11);
        System.out.println(list);
        list.add(2,400);
        System.out.println(list);
        // remove() :: for Integer -> index for string -> Index/Value
        list.remove(0);
        // list.clear();
        System.out.println(list);
        for(int li:list){
            System.out.println(li);
        }
    }
}
