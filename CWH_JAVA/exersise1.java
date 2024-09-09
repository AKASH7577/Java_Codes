import java.util.Scanner;
public class exersise1 {
//question 1 sum of 3 number
public static void main(String[] args) {//main
    int a=26;
    int b=97;
    int c= 67;
    int sum= a+b+c;
    System.out.println("sum of three num is:");
    System.out.println(sum);

    //question 2write a program to claculate cgpa using math of 3 subject(out of 100)
    float subject1=54;
    float subject2=50;
    float subject3=90;
    float cgpa =(subject1+subject2+subject3)/30;
    System.out.println("cgpa of 3 subject is:");
    System.out.println(cgpa);
//3 taking  user name and print "hello have a good day"
    System.out.println("what is your name");
    Scanner sc =new Scanner(System.in);
    String name =sc.next();
    System.out.println(" hello "  + name + " Have a good day ");
}
}
