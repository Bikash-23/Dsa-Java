class pattern02 {
    static void holloRectangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void invertedAndRotetedHalfPeramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - 1 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void FLOYEDTriangle(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    static void zeroOneTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    static void butterflyPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < 2 * (n - 1 - i); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {
            // Left wing
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // Spaces in the middle
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print("  ");
            }

            // Right wing
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void solidRhombus(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void hollowRhombus(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == n-1 || j == n-1){
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    static void dimond(int n){
        for(int i = 0;i< n;i++){
            for(int j = 0;j<n-1-i;j++){
                System.out.print("  ");
            }
            for(int j  = 0;j< 2*i +1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         for (int i = n - 2; i >= 0; i--) {
        for (int j = 0; j < n - 1 - i; j++) {
            System.out.print("  ");
        }
        for (int j = 0; j < 2 * i + 1; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    }

    public static void main(String[] args) {
        // holloRectangle(4);
        // invertedAndRotetedHalfPeramid(4);
        // FLOYEDTriangle(5);
        // zeroOneTriangle(5);
        // butterflyPattern(4);
        // solidRhombus(4);
        // hollowRhombus(4);
        dimond(4);
    }
}