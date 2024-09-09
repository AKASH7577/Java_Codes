package chapter5.ArraysAndList.mulitidimentionalArrays;
public class rowWiseAndColumnWisePrinting {
    public static void main(String[]args){
        //1 2
        //3 4
        //5 6
        int [][] arr ={{1,2},{3,4},{5,6}};
        int m=  arr.length;
        int n= arr[0].length;
        //row wise printing
       /* System.out.println("row wise printing");
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
    }
    */
        //col wise printing
//        System.out.println("col wise printing");
//        for(int j=0; j<n; j++ ){
//            for(int i=0; i<m; i++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//            }
        //sorting
        System.out.println("sorting of the array");
        int [][] transpose = new int [n][m];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                transpose [i][j] = arr[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
