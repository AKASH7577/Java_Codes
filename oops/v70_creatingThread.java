package oops;

    class MyThread1 extends Thread{
        public void run(){
            int i=0;
            while(i<20){
                System.out.println("thread 1  is cooking ");
                System.out.println("i am good ");
                i++;
            }
        }

    }

    class MyThread2 extends Thread{
        public void run(){
            int i=0;
            while(i<20){
                System.out.println("thread 2 chating with her ");
                System.out.println("i am sad ");
                i++;
            }
        }

    }
public class v70_creatingThread {
    public static void main(String[] args){
        //withoutthreading program flow
//        Func1();
////      Func2();
        ///with threading
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
//        start()
//        Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.
//


    }
}
