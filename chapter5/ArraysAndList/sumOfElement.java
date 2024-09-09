package chapter5.ArraysAndList;
public class sumOfElement {
    public static void main(String[] arrgs){
        int [] arr ={20,490,90,44,66,40,55,23,67};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("The sum of element is:"+ sum);
    }
}
