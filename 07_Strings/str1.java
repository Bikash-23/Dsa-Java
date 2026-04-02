public class str1 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        String d = new String("hello");
        String e= new String("hello how are you");
        String f= e.intern();

        System.out.println("King" == "King");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(c == d);
        System.out.println(b == f);
        System.out.println(c == f);
        boolean res = c.regionMatches(0,e,0,5);
        System.out.println(res);
        System.out.println("king".toUpperCase());
    }   
}
