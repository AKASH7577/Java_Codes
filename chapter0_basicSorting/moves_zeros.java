package chapter0_basicSorting;

public class moves_zeros {
    public static void print(int [] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
    public static void main(String [] args){
        int [] arr = { 0,1,0,3,12};
        int n= arr.length;
        int noz= 0;
        for(int ele: arr){
            if(ele==0) noz++;
        }

        for(int j=0;j<noz; j++){ ///noz phasses
            for(int i=0; i<n-1-j; i++){
                if(arr[i]==0){
                    int temp = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        print(arr);
    }
}
