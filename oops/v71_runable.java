package oops;
 class MyThreadRunnable1 implements Runnable {
     public void run() {
         for(int i=0; i<10;i++){
         System.out.println("i am a thread 1 not a threat");
     }

 }}
class MyThreadRunnable2 implements Runnable {
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("i am a thread 2 not a threat");
        }
    }

}
public class v71_runable {
    public static void main(String[] args){
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
