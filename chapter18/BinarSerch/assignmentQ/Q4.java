package chapter18.BinarSerch.assignmentQ;

/*Given an array of integers nums containing n + 1 integers where each integer is in the
range [1, n]inclusive in sorted order.
There is only one repeated number in nums, return this repeated number.

 */
public class Q4 {
    public static  int  findDuplicate( int [] arr){
        for(int i=1 ; i<arr.length ; i++){

            if(arr[i] == arr[ i - 1]){
                return arr[i];
            }
        }
         return -1;
    }
    public static void main(String [] args){
        int [] arr = {1,2,3,3,4};
         int duplicate = findDuplicate(arr);
         System.out.println(" repeted number is : "+ duplicate);

    }
}
