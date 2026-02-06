// public class function02 {
//     // Function Overloading
//     // Static method: belongs to the class, can be called directly without creating an object
//     static void mul(int a , int b){ 
//         System.out.println("Ans: "+a*b);
//     }
//     // Non-static method: belongs to the object, requires an instance to be called
//     int add(int a ,int b){ 
//         return a+b;
//     }
//     public static void main(String[] args) {
//         mul(10,23);
//         // Creating an object to call non-static method
//         function02 obj = new function02();
//         System.out.println(obj.add(10, 20));

//     }
// }

public class function02 {
    static void show(int x) {
        System.out.println(x);
    }
    static void show(Integer x) {
        System.out.println(x+10);
    }
    static void test(Object o){
        System.out.println("Called test(Object o)");
    }
    static void test(String s){
        System.out.println("Called test(String s)");
    }
    public static void main(String[] args) {
        show(5);
        // Calling show(5) invokes show(int x) because primitive matching is preferred over autoboxing.
        test(null);
        // invokes test(String s) because String is more specific than Object
    }
}
