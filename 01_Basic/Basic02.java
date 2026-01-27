// Type of Operators :: 
// Arithmetic Operator (Binary/Unary/Ternary)
// Relational Operator
// Logical Operator
// Bitwise Operator
// Assignment Operator 


class Basic02{
    public static void main(String[] args){
        //Arithmetic Operator(Binary)
        // int a =10,b  =5;
        // System.out.println(a+b);
        // System.out.println(a-b);
        // System.out.println(a*b);
        // System.out.println(a/b);
        // System.out.println(a%b);

        //Arithmetic Operator(Unary)
        // post-increment
        // int a = 10;
        // int b = a++;
        // System.out.println(a);
        // System.out.println(b);
        // pre-increment
        // int a = 10;
        // int b = ++a;
        // System.out.println(a);
        // System.out.println(b);

        //Relational Operator
        // int a = 10,b = 5;
        // System.out.println(a>b);
        // System.out.println(a>=b);
        // System.out.println(a<b);
        // System.out.println(a<=b);
        // System.out.println(a!=b);
        // System.out.println(a == b);

        //logical Operator
        // System.out.println(3>2 && 5>= 10);
        // System.out.println(3>2 || 5>= 10);
        // System.out.println( !(3>2));

        //Assignment Operator
        int a = 10;
        int b = a;
        int c =2;
        c +=b;
        int d = 2;
        d-=b;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

       
    
    }
}