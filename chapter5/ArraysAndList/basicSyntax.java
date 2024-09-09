package chapter5.ArraysAndList;
public class basicSyntax {
    public static void main(String[] args){
        //declareing the 5 variable
        //
        int []arr=new int[5];
        //initialising individuals element
        arr[0] =10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        //output in array
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        //updating
        arr[0]=90;
        System.out.println("updating value is:"+arr[0]);
        //increment
        arr[0]+=10;
        System.out.println("increment value is :"+arr[0]);
    }
}
