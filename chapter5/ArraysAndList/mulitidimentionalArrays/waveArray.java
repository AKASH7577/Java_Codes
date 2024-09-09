package chapter5.ArraysAndList.mulitidimentionalArrays;
public class waveArray {
    public static void print(int[][]arr){
        int m= arr.length,n= arr[0].length;
        //function  for  print
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[]args){
        int [][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m= arr.length,n=arr[0].length;
        print(arr);
        System.out.println("left to right && right to left");
        for(int i=0; i<m; i++){
            if(i%2==0){
                for(int j=0; j<n; j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=n-1; j>=0; j--)
                System.out.print(arr[i][j] +" ");
            }
        }
        System.out.println();
        System.out.println(" right to left && left to right");
        for(int i=0; i<m; i++){
            if(i%2==0){
                for(int j=n-1; j>=0; j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=0; j<n; j++)
                    System.out.print(arr[i][j] +" ");
            }
        }
        System.out.println();
        System.out.println(" top to bottom && bottom to top");
        for(int j=0; j<m; j++){
            if(j%2==0){
                for(int i=0; i<m; i++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int i=m-1; i>=0; i--)
                    System.out.print(arr[i][j] +" ");
            }
        }
        System.out.println();
        System.out.println("  bottom to top&& top to bottom");
        for(int j=0; j<m; j++){
            if(j%2==0){
                for(int i=m-1; i>=0; i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int i=0;  i<m; i++)
                    System.out.print(arr[i][j] +" ");
            }
        }
    }
}
