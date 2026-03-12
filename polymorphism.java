//compile-time polymorphism
//overloading
class cal{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
}

//run-time polymorphism
//method overriding
class Message1{
    void msg(){
        System.out.println("msg1");
    }
}
class Message2 extends Message1{
    void msg(){
        System.out.println("msg2");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        cal c = new cal();
        System.out.println(c.add(10, 5));
        System.out.println(c.add(5.5, 10.5));

        Message1 m = new Message2();
        m.msg();
    }
}
