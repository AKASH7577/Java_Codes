package oops;
import java.util.Scanner;
import java.util.Random;
class Game{
     public int number ;
     public int inputNumber;
     public int noOfGuesses =0;

     public  int getNoOfGuesses (){
         return noOfGuesses;
     }
     public void setNoOfGuesses(int noOfGuesses){
         this.noOfGuesses = noOfGuesses;
     }
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }

}

public class polymorphism {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        create a class Game ,which allows a user to play "Guess the Number"
        game once .Game should have follows method :       *
          Constructor to generte a randome number
          take A a user input of number
          isCorrectNumber()to detect whether the number entered b y the user is true
          getter and setter for noOfGusses
*/
    Game g = new Game();
    boolean b= false;
    while(!b){
        g.takeUserInput();
        b= g.isCorrectNumber();
    }
    }


}