package chapter0_basicSorting;
import java.util.Arrays;
public class builtInSort {
    public static void main(String [] args){
        int [] arr ={1,34,4,56,33,45,22};
        for(int ele: arr){ 
            System.out.print(ele+" ");
        }
        System.out.println();

        Arrays.sort(arr);//sort the array

          for(int ele : arr) { ///built in method
              System.out.print(ele + "");
          }
          System.out.println();
    }
}
