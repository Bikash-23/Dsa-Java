public class Matrix {
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix.length -1;
        while(startRow <= endRow && startCol <=endCol){
            //top
            for(int j = startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i = startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int i = endCol-1;i>=startCol;i--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][i]+" ");
            }
            //left
            for(int i = endRow-1;i>startRow;i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    public static int diagonalSum(int matrix[][]){
        int sum =0;
        // for(int i = 0;i<matrix.length;i++){
        //     for(int j = 0;j<matrix.length;j++){
        //         //pd
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }
        //         //sd
        //         else if(i+j == matrix.length-1 && i !=j){
        //             sum +=matrix[i][j];
        //         }
        //     }
        // }
        //TC -> O(n) SC -> O(1)
        for(int i =0;i<matrix.length;i++){
            //pd
            sum +=matrix[i][i];
            //sd
            if(i != matrix.length -1-i)
                sum += matrix[i][matrix.length -i -1];
        }
        return sum;
    }
    // TC -> O(n+m) matrix :: n*m
    public static boolean stairCaseSearch(int matrix[][],int key){
        // int row = 0;
        // int col = matrix.length -1;
        // //starting element is (0,m-1)
        // while (row < matrix.length && col >= 0) {
        //     if( matrix[row][col] == key){
        //         System.out.println("found at index: "+row+","+col);
        //         return true;
        //     }
        //     else if(key < matrix[row][col]){
        //         //left
        //         col--;
        //     }else{//key > cell value
        //         //bottom 
        //         row++;
        //     }
        // }
        // System.out.println("Not Found!");
        // return false;
        int n = matrix.length;
        int i = n-1;
        int j = 0;
        while (i >= 0 && j <n) {
            if(matrix[i][j] == key){
                System.out.println("found at index: "+i+","+j);
                return true;
            }else if(key < matrix[i][j]){
                //top
                i--;
            }else{//key > cell value
                //left
                j++;
            }
        }
        System.out.println("Not Found!");
        return false;
    }
    public static void main(String[] args) {
        // int matrix[][] = { { 1, 2, 3, 4 },
        //         { 5, 6, 7, 8 },
        //         { 9, 10, 11, 12 },
        //         { 13, 14, 15, 16 } };
        // System.out.println(matrix.length);
        // int matrixOne[][] ={
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        // // printSpiral(matrix);
        // System.out.println(diagonalSum(matrixOne));
        int matrixtwo[][] ={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        stairCaseSearch(matrixtwo, 33);
    }
}
