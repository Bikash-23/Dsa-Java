import java.util.ArrayList;
import java.util.Iterator;
class learnArrayList{
    public static void main(String[] args) {
        ArrayList<String> Student_Name = new ArrayList<>();
        Student_Name.add("Bikash");
        Student_Name.add("Ravi");
        Student_Name.add("Kajal");
        System.out.println(Student_Name);
        // System.out.println(Student_Name.get(2));
        // Student_Name.add(2,"Bhumi");
        // System.out.println(Student_Name.get(2));
        // Student_Name.remove(3);
        // System.out.println(Student_Name);
        // Student_Name.remove("Bikash"); // To remove integer Student_Name.remove(Integer.valueOf(10));
        // System.out.println(Student_Name);
        // Student_Name.set(0,"Bikash");
        // System.out.println(Student_Name);
        // System.out.println(Student_Name.size());
        // Student_Name.clear();
        // System.out.println(Student_Name);

        // for(String st:Student_Name){
        //     System.out.println(st);
        // }

        Iterator<String> it = Student_Name.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}