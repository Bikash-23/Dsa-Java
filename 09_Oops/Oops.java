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
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2]= 70;
        System.out.println(s1.name + s1.roll);

        Student s2 = new Student(s1);
        System.out.println(s2.name);
        s1.marks[2] = 80;
        for(int i = 0; i<3;i++){
            System.out.println(s2.marks[i]);
        }
      
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
    int marks[];
    //non-parametarized
    // Student(){
    //     System.out.println("constructor is called...");
    // }

    //parametarized
    Student(String name){
        this.name = name;
        this.marks = new int[3];
        System.out.println(name);
    }
    //copy constructor :: 
    //  shallow copy constructor
    //   Deep copy constructor

    // //  shallow copy constructor
    // Student(Student s1){
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     marks = new int[3];
    //     this.marks = s1.marks;
    // }

    //   Deep copy constructor(best Use of Copy Constuctor )
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = new int[3];
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }


}