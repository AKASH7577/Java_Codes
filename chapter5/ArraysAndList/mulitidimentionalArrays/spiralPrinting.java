package chapter5.ArraysAndList.mulitidimentionalArrays;
public class spiralPrinting {
//    public static void print(int[][]arr){
//        int m= arr.length,n= arr[0].length;
//        for(int i=0; i<m; i++){
//            for(int j=0; j<n; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//    public static void main(String []arg){
//        int [][] arr= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
//        int m= arr.length,n= arr[0].length;
//        //spiral matrix print
//        int minr=0,maxr= m-1;//creating the 4 variable
//        int minc=0,maxc= n-1;
//        while(minr<=maxr && minc<=maxc){
//            //left to right -- blue
//            for(int j=minc;j<=maxc; j++){
//                System.out.print(arr[minr][j]+" ");
//            } minr++;
//            //top ton bottom --orange
//            if(minr > maxr || minc > maxc) break;
//            for(int i= minr; i<=maxr; i++){
//                System.out.print(arr[i][maxc]+" ");
//            }maxc--;
//            //rigth to left
//            if(minr > maxr || minc > maxc) break;
//            for(int j= maxc; j>=minc; j--){
//                System.out.print(arr[maxr][j]+" ");
//            }maxr--;
//            //bottom to top
//            if(minr > maxr || minc > maxc) break;
//            for(int i= maxc; i>=minr; i--){
//                System.out.print(arr[i][minc]+" ");
//            }minc++;
//        }
//    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        int m = arr.length;
        int n = arr[0].length;

        int minRow = 0, maxRow = m - 1;
        int minCol = 0, maxCol = n - 1;

        while (minRow <= maxRow && minCol <= maxCol) {
            // left to right
            for (int j = minCol; j <= maxCol; j++) {
                System.out.print(arr[minRow][j] + " ");
            }
            minRow++;

            // top to bottom
            for (int i = minRow; i <= maxRow; i++) {
                System.out.print(arr[i][maxCol] + " ");
            }
            maxCol--;

            // right to left
            if (minRow <= maxRow) {
                for (int j = maxCol; j >= minCol; j--) {
                    System.out.print(arr[maxRow][j] + " ");
                }
                maxRow--;
            }

            // bottom to top
            if (minCol <= maxCol) {
                for (int i = maxRow; i >= minRow; i--) {
                    System.out.print(arr[i][minCol] + " ");
                }
                minCol++;
            }
        }
    }

}
