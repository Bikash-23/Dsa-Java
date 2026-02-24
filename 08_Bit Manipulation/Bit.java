public class Bit {
    public static void oddEven(int num){
        int bitMask = 1;
        if((num & bitMask) == 1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
    public static int getIthBit(int n ,int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setIthBit(int n, int i){
        // ith position -> 1;
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static int clearIthBit(int n,int i){
        //ith bit -> 0
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }
        n = clearIthBit(n,i);
        int bitMask = newBit<<i;
        return n|bitMask;
    }
    public static int clearLastithBit(int n,int i){
        int bitMask  = (-1)<<i;
        return n&bitMask;
    }

    public static int clearRange(int n,int i, int j){
        int a = (-1)<<(i+1);
        int b = (1<<j) -1;
        int bitMask= a|b;
        return n&bitMask;
    }
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }
    public static int countSetBit(int n){
        int count = 0;
        while(n> 0){
            if((n & 1) != 0){ //check LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static int fastExpo(int a, int n){
        int ans = 1;
        while(n> 0){
            if((n & 1) != 0){ // check LSB
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // oddEven(12);
        // oddEven(11);
        // oddEven(9);
        // System.out.println(getIthBit(10, 3));
        // System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthBit(10, 1));
        // System.out.println(updateIthBit(10, 0, 1));
        // System.out.println(clearLastithBit(15, 2));
        // System.out.println(clearRange(10, 4, 2));
        // System.out.println(isPowerOfTwo(8));
        // System.out.println(countSetBit(10));
        System.out.println(fastExpo(3, 5));
    }    
}
