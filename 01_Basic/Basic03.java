//conditional statements
import java.util.*;
public class Basic03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age;
        // System.out.print("Enter Age: ");
        // age = sc.nextInt();

        // if(age>18){
        //     System.out.println("Adult");
        // }else{
        //     System.out.println("minor");
        // 
        // }

        // int num1,num2;
        // System.out.println("Enter number 1:");
        // num1 = sc.nextInt();
        // System.out.println("Enter number 2:");
        // num2 = sc.nextInt();
        // if(num1 > num2){
        //     System.out.println(num1+" is greater than "+num2);
        // }
        // else if(num1 == num2){
        //     System.out.println(num1+" equal to "+num2);
        // }else{
        //     System.out.println(num2+" is greater than "+num1);
        // }

        // int num;
        // System.out.print("Enter Number: ");
        // num = sc.nextInt();
        // if(num % 2 == 0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("Odd!");
        // }

        // int income;
        // System.out.print("Enter Income: ");
        // income = sc.nextInt();
        // if(income <500000){
        //     System.out.println("Income is "+income+" & income with tax "+ (income+((income*0)/100)));
        // }
        // else if(income >=500000 && income< 1000000){
        //     System.out.println("Income is "+income+" & income with tax "+ (income+((income*20)/100)));
        // }
        // else{
        //     System.out.println("Income is "+income+" & income with tax "+ (income+((income*30)/100)));
        // }

        // int num1,num2,num3;
        // System.out.print("Enter Number 1: ");
        // num1 = sc.nextInt();
        // System.out.print("Enter Number 2: ");
        // num2 = sc.nextInt();
        // System.out.print("Enter Number 3: ");
        // num3 = sc.nextInt();
        // // if(num1>=num2 && num1>= num3){
        // //     System.out.println("Greater: "+num1);
        // // }else if(num2>= num3){
        // //     System.out.println("Greater: "+num2);
        // // }else
        // //     System.out.println("Greater: "+num3);
            
        // //ternary
        // String res = (num1 >= num2)?((num1>num3)?"num1 greater":"num3 greater"):"num2 greater";
        // System.out.println(res);

        int choice;
        System.out.print("Enter Choice (1-3): ");
        choice  = sc.nextInt();
        switch(choice){
            case 1: System.out.println("Samosa!");
            break;
            case 2: System.out.println("Burger!");
            break;
            case 3: System.out.println("mango shake!");
            break;
            default: System.out.println("Dream Break!");
        }
        
    }
}
