package chapter5.ArraysAndList;
public class maxValueInArray {
    public static void main(String[] args) {
//        int [] arr ={ 20,59,77,43,22,2};
//        int mx=arr[0];
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>mx)
//                mx=arr[i];
//        }
//        System.out.println("maximun element is : ");
//        System.out.print(mx);

        //min value
        int [] arr ={ 45,66,55,63,90,66};
//        int mx=arr[0];
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min) min=arr[i];
        }
        System.out.println("maximun element is : ");
        System.out.print(min);
    }
}
