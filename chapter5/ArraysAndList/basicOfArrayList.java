package chapter5.ArraysAndList;
import java.util.ArrayList;
public class basicOfArrayList {
    public static void main(String[] args) {
    ArrayList<Integer> arr= new ArrayList<>(6);
    arr.add(0,10); //arr[0]=10;
    arr.add(0,20);//initialize
    arr.add(0,40);
    arr.add(0,50);
    arr.add(0,60);
    arr.add(0,80);
    System.out.print(arr);
//    for(int i=0; i<=5; i++){// arr.length---> arr.size()
//        System.out.print(arr.get(i) + " ");//arr[i]
//    }
    System.out.println();
    arr.set(2,300);//modify
    System.out.print(arr);
//  for(int i=0; i<=5; i++){// arr.length---> arr.size()
//      System.out.print(arr.get(i) + " ");//arr[i]
//   }
    System.out.println();
     arr.add(90);
     System.out.print(arr);
    }
}
