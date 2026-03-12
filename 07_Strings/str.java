import java.util.Scanner;

public class str {
    public static boolean isPalindrome(String s){
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static double getShortestPath(String direction){
        double x = 0,y =0;
        for(int i = 0;i<direction.length();i++){
            if(direction.charAt(i) == 'N'){
                y++;
            }else if(direction.charAt(i) == 'S'){
                y--;
            }else if(direction.charAt(i) == 'W'){
                x--;
            }else{
                x++;
            }
        }
        return Math.sqrt(x*x + y*y);
    }
    //TC -> O(n)
    public static String compare(String str){
        String newStr ="";
        for(int i = 0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length() -1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr +=str.charAt(i);
            if(count>1){
                newStr +=count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        // Strings are IMMUTABLE 
        // String str = "abcd";
        // String str1 = new String("xyz");

        Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.next();
        // System.out.print(name);
        // name  = sc.nextLine();
        // System.out.print(name);

        //In stirng length is function
        //In arr length is property
        // System.out.println(str.length());

        //concatenation
        // System.out.println(str+str1);

        //element at index
        // System.out.println(str.charAt(1));

        // String ab = "madam";
        // System.out.println(isPalindrome(ab));

        // String p = "WNEENESENNN";
        // System.out.println(getShortestPath(p));

        //Strings compare
        // String s1 = "Bikash";
        // String s2 = "Bikash"; //Interning
        // String s3 = new String("Bikash"); 
       
        // System.out.println(s1 == s2); // true 
        // System.out.println(s1 == s3); //false
        // System.out.println(s1.equals(s3)); // true

        //substring
        // String str = "HelloWorld";
        // System.out.println(str.substring(0,5));

        //compareTo -> 0 :: equel ; -ve:: str1 <str2 ; +ve :: str1 > str2;
        // String str1 = "aaabbc";
        // String str2 = "aaabbc";
        // System.out.println(str1.compareTo(str2));

        String str = "aaabbbcccdddd";
        System.out.println(compare(str));

        sc.close();
    }
}
