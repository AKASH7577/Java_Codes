package chapter5.ArraysAndList.mulitidimentionalArrays;

public class addTwoMatrices {
    public static void main(String[] args) {
        int [][] a={{1,2,3},{2,3,4},{8,5,6}};
        int [][] b= {{5,3,5},{4,5,4},{9,0,5}};
        int m= a.length;
        int n = b[0].length;
        int [][] res = new int[m][n];//creating the extra array
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++ ){
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("sum of  two matrices  is ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print( res[i][j] + " ");
            }
            System.out.println();
        }
    }
}