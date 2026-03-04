public class Oops {
    public static void main(String[] args) {
        // BankAcount ba1 = new BankAcount(); //constractor
        // ba1.name = "BikashPari";
        // ba1.password = 123; // eror -> Acces Modifier -> private
        // ba1.setPW(123);
        // System.out.println(ba1.getPW());;

        Student s1= new Student("Ravi");
        s1.name = "Bikash";
        s1.roll = 67;
        System.out.println(s1.name + s1.roll);
        Student s2 = new Student(s1);
        System.out.println(s2.name);
    }
}

class BankAcount {
    public String name;
    private int password;
    //setter
    public void setPW(int password){
        this.password = password;
    }
    //getter
    public int getPW(){
        return this.password;
    }
    //this: this keyword is used to refer to the current object

}
//constuctor :: 
// non-parametarized
// parametarized
// copy-constractor
class Student{
    String name;
    int roll;
    //non-parametarized
    // Student(){
    //     System.out.println("constructor is called...");
    // }

    //parametarized
    Student(String name){
        this.name = name;
        System.out.println(name);
    }
    //copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }
}