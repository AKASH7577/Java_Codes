import java.util.Scanner;
public class pr3_o1 {
    public static void main(String[] args) {


//        //problem 1
////        String name = "Jack  Pareker";
////        name = name.toLowerCase();
////        System.out.println(name);
//
////        problem 2
////        String text = "To My    Friend";
////        text = text.replace(" ", " ");
////        System.out.println(text);
//
////        problem 3
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter a NAME");
//        String std  = sc.nextLine();
//        System.out.println(std);
//        String letter  ="Dear <|name|>,,thanks a lot!";
//        letter = letter.replace("<|name|>","std");
//        System.out.println(letter);
//
//        problem 4 to detect douuble and tripple spaces
        String myLetter = "Dear akash,\n\tThis Java Course is nice.\n\tThaks!";
        System.out.println(myLetter);


//    problem 5

        String myString ="This string contains double and   triple spaces";
        System.out.println(myString.indexOf(" "));
        System.out.println(myString.indexOf("  "));

    }
}