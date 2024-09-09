package oops;
import java.util.Scanner;
   class Employee{
       int salary;
       String name;

       public int getSalary(){
           return salary;
       }
       public String getName(){
           return name;

       }
       public void  setName(String n){
            name = n;
       }
   }
   class CellPhone{
       public void Ring(){
           System.out.println("Ringing...");
       }
       public void Vibrate(){
           System.out.println("Vibrating...");
       }
       public void CallFriend(){
           System.out.println("calling akash..");
       }

   }
   class Tommy{
       public  void hit(){
           System.out.println("hiting the enemeny...");
       }
       public void fire(){
           System.out.println("firin on enemeny..");
       }
       public void run(){
           System.out.println("runnin the enemeny...");
       }
        }

   class Square{
       int side;
       public int area(){
           return side*side;
       }
       public int perimeter(){
           return 4*side;
       }
   }

public class praticeset {
       public static  void main(String[] args) {
           Scanner sc = new Scanner(System.in);

           // pr no.1
           Employee akash = new Employee();
           akash.setName("akashshinde");
           akash.salary = 299;
           System.out.println(akash.getSalary());
           System.out.println(akash.getName());

           //pr no.2
           CellPhone asus = new CellPhone();
           asus.CallFriend();
           asus.Vibrate();
           asus.Ring();

           //pr3

           Square sq = new Square();
           System.out.println("enter a side ");
           //int side = sc.nextInt();
           sq.side = 3;
           System.out.println(sq.area());
           System.out.println(sq.perimeter());

           //pr4
           Tommy  player1  = new Tommy();
           player1.fire();
           player1.run();
           player1.hit();


       }
}
