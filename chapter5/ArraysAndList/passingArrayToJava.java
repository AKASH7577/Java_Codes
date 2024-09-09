package chapter5.ArraysAndList;
public class passingArrayToJava {
    public static void main(String[] args) {
        int[] arr = {10,20, 30,40,50};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
        //values goes by pass by reference arry--->function
    }
    private static void change(int[] arr ) {//we use 'x' insted of arr
        arr[0]=90;
    }
}
