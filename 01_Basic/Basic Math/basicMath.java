public class basicMath {
    static void printDigit(int num) {
        // while (num != 0) {
        // int digit = num % 10;
        // System.out.println(digit);
        // num /= 10;
        // }

        // String str = Integer.toString(num);
        // for (int i = 0; i < str.length(); i++) {
        // System.out.println(str.charAt(i));
        // }

        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        while (rev != 0) {
            System.out.println(rev % 10);
            rev /= 10;
        }
    }

    static void countDigit(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);
    }

    static void sumofDigit(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println(sum);
    }

    static void revNumber(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println(rev);
    }

    static boolean checkPalindrome(int num) {
        if (num < 0)
            return false; // negative num are not palindrome
        int rev = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        return rev == num;
    }

    static boolean checkPrime(int num) {
        if (num <= 1)
            return false; // 0 and 1 are not prime
        if (num == 2)
            return true; // 2 is prime
        if (num % 2 == 0)
            return false; // eliminate even numbers > 2

        // check divisibility only up to √num
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void printPrime(int n){
        for(int i = 2;i<=n;i++){
            if(checkPrime(i)){
                System.out.println(i);
            }
        }
    }

    static int getGCD(int a, int b) {
        // gcd(a,b) = gcd(b,a%b)
        // if b = 0 then a -> ans
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int getLCM(int a, int b) {
        return a * b / getGCD(a, b);
    }

    static boolean checkArmstrong(int num) {
        int temp = num;
        int digit = String.valueOf(num).length(); // count digits
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digit);
            temp /= 10;
        }
        return sum == num;
    }

    static boolean checkPerfectNumber(int num) {
        if (num <= 1)
            return false; // 1 is not a perfect number
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) { // avoid adding square root twice
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }

    static void printDivisors(int num){
        System.out.println(1);
        for(int i = 2;i<=Math.sqrt(num);i++){
            if(num%i == 0){
                System.out.println(i);
                if(i != num/i){
                    System.out.println(num/i);
                }
            }
        }
    }

    static int power(int a, int b){
        if(b == 0) return 1;
        int half = power(a,b/2);
        if(b%2 == 0){
            return half*half;
        }
        return a*half*half;
    }

    static void countEvenDigit(int num){
        int count = 0;
        while (num != 0) {
            int digit = num%10;
            if(digit %2 == 0){
                count++;
            }
            num /=10;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        // printDigit(53127);
        // countDigit(512345);
        // sumofDigit(512345);
        // revNumber(53127);
        // System.out.println(checkPalindrome(1221));
        // System.out.println(checkPrime(128231));
        // System.out.println(getGCD(18,12));
        // System.out.println(getLCM(18,12));
        // System.out.println(checkArmstrong(9474));
        // System.out.println(checkPerfectNumber(6));
        // printDivisors(28);
        // printPrime(10);
        // System.out.println(power(2, 10));
        countEvenDigit(21346);
    }
}
