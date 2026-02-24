import java.util.Scanner;

public class one{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter element:");
        for(int r = 0;r<n;r++){
            for(int c = 0;c<m;c++){
                matrix[r][c] = sc.nextInt();
            }
        }
        System.out.println("Result: ");
        for(int r = 0;r<n;r++){
            for(int c = 0;c<m;c++){
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
