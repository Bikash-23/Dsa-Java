public class Abstration {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        // Animal a = new Animal();//error
    }
}

abstract class Animal{
    String color;
    Animal(){
        color = "brown";
        System.out.println("Animal constroctor called");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    @Override
    void walk() {
        System.out.println("on 4 lengs");
    }
    void changeColor(){
        color = "blue";
    }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken constructor called");
    }
    @Override
    void walk() {
        System.out.println("on 2 lengs");
    }
     void changeColor(){
        color = "red";
    }
}
