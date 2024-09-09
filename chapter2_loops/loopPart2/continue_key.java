package loopPart2;

import java.util.Scanner;

public class continue_key {
    public static void main(String[] args) {
//    wap  to even or odd using for loop
        //100 iterations
//        for(int i= 1; i<=100; i++){
//            if(i%2==0)
//                System.out.println(i+"");
//        }
//        for(int i= 1; i<=100; i+=2){
//                System.out.println(i+"");
//        }
        //100 iterations  using continue
        for(int i= 1; i<=100; i++){
            if(i%2==0){
                continue;
            }
                System.out.println(i+"");
        }
    }
}
