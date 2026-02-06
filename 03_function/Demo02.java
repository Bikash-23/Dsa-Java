public class Demo02 {
    public static int binToDec(int binNum){
        int decNum = 0;
        int power = 0;
        while(binNum > 0){
            int lastDigit = binNum %10;
            decNum += lastDigit*(int)Math.pow(2,power);
            binNum /= 10;
            power++;

        }
        return decNum;
    }
    public static int decToBin(int decNum){
        int binNum = 0;
        while (decNum > 0) {
            int lastDigit = decNum %2;
            binNum  = binNum*10 + lastDigit;
            decNum /= 2;
        }
        return binNum;
    }
    public static void main(String[] args) {
        System.out.println(binToDec(101));
        System.out.println(decToBin(5));
    }
}
