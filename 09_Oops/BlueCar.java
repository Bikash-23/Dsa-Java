abstract class Car {
    static {
        // Static block: Runs once when the class is loaded
        // Run once per class, when the class is first loaded into memory.
        // They’re executed before any objects are created.
        // That’s why Car’s static block (System.out.print("1");) runs first, before
        // anything else

        System.out.print("1");
    }

    public Car(String name) {
        super();
        System.out.print("2");
    }

    {
        // instance initializer block(run every time an object is created)-> Runs before
        // its constructor body
        System.out.print("3");
    }
}

public class BlueCar extends Car {
    {
        // instance initializer block(run every time an object is created)-> Runs before
        // its constructor body
        System.out.print("4");
    }

    public BlueCar() {
        super("blue");
        System.out.print("5");
    }

    public static void main(String[] gears) {
        new BlueCar();
    }
}
// The order is:
// Static block → Parent instance initializer → Parent constructor → Child
// instance initializer → Child constructor.
