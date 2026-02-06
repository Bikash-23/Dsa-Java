import java.util.*;
// import java.lang.*;

// ---------boilerplate code--------------------
// public class Basic01{
//     public static void main(String[] args) {

//     }
// }


public class Basic01{
    public static void main(String[] args) {
        // System.out.println("Hello World!"); 
        // int a = 10,b= 20;
        // System.out.println(a+b);
        Scanner sc=  new Scanner(System.in);

        // int a,b;
        // System.out.print("Enter Number:");
        // a = sc.nextInt();
        // System.out.print("Enter Number:");
        // b = sc.nextInt();
        // System.err.println("Sum:"+(a+b)+" & Product:"+a*b);
        // int r;
        // System.out.print("Enetr circle radius:");
        // r = sc.nextInt();
        // System.err.println("Area of Circle:"+(Math.PI * r *r));

        // int $ = 24;
        // System.out.println($);

        // type conversion
        // int a = 25;
        // long b = a;
        // System.out.println(b);
        // long a = 25;
        // int b = a; // error
        // System.out.println(b); // error

        // type casting
        // float a = 99.99f;
        // int b = (int)(a);
        // char ch=  'a';
        // int num = ch;
        // System.out.println(num);

        // type promotion 
        // char a = 'a';
        // char b = 'b';
        // System.out.println(b);
        // System.out.println(a);
        // System.out.println(b-a);
        
        byte b = 5;
        // b *= 2;
        // b = b*2; //error
        b = (byte)(b*2);
        System.out.println(b);
        
      sc.close(); 
    }
}

// --------------Output in Java-----------------
// 1.print :: print output
// 2.println :: print output and switch to next line
// 3."\n" :: next line
//print output

// -------------------Data Type----------------------

// data type -> 1. Primitive 2. Non-primitive
// primitive:: byte(1 byte), short(2 byte), char(2 byte), boolean(1 byte), int(4 byte), long(8 byte), float(4 byte), double(8 byte)
// 1 byte = 8 bit -> bit:: 0/1
// Non-primitive:: String, Array, Class , Object, Interface

// -------------------Type Conversion---------------
// a. type compatible :: int <-> float (possible) but int -> boolean (not possible)
// b. destination type >= sourse type ::
// byte-> short-> int-> float-> long -> double

// ----------------------Type Promotion-----------------
// 1. Java automatically prommotes each byte , short, or char operand to int when evaluting an expression
// 2. if one operand is long, float, or double the whole expression is promoted to long , float, or double respectively