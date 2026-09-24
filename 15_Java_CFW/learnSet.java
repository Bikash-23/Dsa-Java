import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class learnSet {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>();
        // Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(12);
        set.add(15);

        set.add(20);

        System.out.println(set);

        set.remove(12);
        System.out.println(set);

        System.out.println(set.contains(10));
        System.out.println(set.contains(100));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        // set.clear();
        // System.out.println(set);
        
       
        
        
    }
    
}
