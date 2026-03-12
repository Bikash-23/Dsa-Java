class A{
    int n= 5;
    void msg1(){
        System.out.println("msg1 of A ->method of super class");
    }
    void msg3(){
        System.out.println("msg3 of A ->method of super class");
    }
}
class B extends A{
    int n = 10;
    void msg1(){
        System.out.println("msg1 of B ->Overriding method of super class");
    }
    void msg2(){
        System.out.println("msg2 of B ->anothe method of sub class");
    }
}
public class oopsInheritance {
    public static void main(String[] args) {
    A a = new A();
    B b = new B();
    A x = new B();
    a.msg1();
    b.msg1();
    b.msg2();
    x.msg1(); // method override in sub-class
    x.msg3(); //all method of super class accesble  
    System.out.println(x.n);// variable not change
    // x.msg2();//eror not accesable the method of sub-class , only acceble if present in super-class
    }
}
