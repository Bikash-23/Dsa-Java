public class function01 {
    public static int calSum(int a, int b){ // parameters or formal parameters
        return a+b;
    }
    public static int calProduct(int a, int b){ // parameters or formal parameters
        return a*b;
    }
    public static int factorial(int n){
        int fac = 1;
        while(n>0){
           fac *=n;
           n--; 
        }
        return fac;
    }
public static int binomialCoefficient(int n, int r){
    return factorial(n)/(factorial(r)*factorial(n-r));
}
    public static void main(String[] args) { 
        System.out.println(calSum(10, 12));// argument or actual parameters
        System.out.println(calProduct(10, 12));// argument or actual parameters
        System.out.println(factorial(5));
        System.out.println(binomialCoefficient(5, 2));
    }    
}
