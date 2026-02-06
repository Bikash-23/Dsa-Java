public class Demo01 {
        static boolean isPrime(int n){
            if(n< 2)
                return false;
            else if(n>=2){
                // Math.sqrt(n) is less efficient  because multiplication (i*i) cost is less than sqrt 
                for(int i = 2;i*i<=n;i++){  
                    if(n%i == 0){
                        return false;
                    }
                }
            }
            return true;
        }
        static void printPrimeInRange(int n, int m){
            for(int i = n;i<=m;i++){
                if(isPrime(i)){
                    System.out.print(i+ " ");
                }
            }
        }
    public static void main(String[] args) {
        System.out.println(isPrime(11));
        printPrimeInRange(1, 20);
    }
}
