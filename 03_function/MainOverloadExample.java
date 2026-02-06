public class MainOverloadExample {

    // Standard entry point
    public static void main(String[] args) {
        System.out.println("Entery point");
        
        // Calling overloaded versions explicitly
        main(10);
        main("Hello");
        main(5.5, 2.5);
    }

    // Overloaded main with int parameter
    public static void main(int x) {
        System.out.println("Main method with int: " + x);
    }

    // Overloaded main with String parameter
    public static void main(String msg) {
        System.out.println("Main method with String: " + msg);
    }

    // Overloaded main with double parameters
    public static void main(double a, double b) {
        System.out.println("Main method with double,double: " + (a + b));
    }
}
