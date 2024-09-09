import org.w3c.dom.ls.LSOutput;

public class chpter_7_java_methods {
    //creating a methods
   //there are two method of invocation
    //1 using static
    //2 using object creation

    static int logic(int x,int y){ // static is not use object ki apani apani copy hogi
     // 2  int logic(int x,int y)                        //it gives an error
        int z ;                        ////we need to create an object d
        if(x>y){
            z =x+y;

        }
        else{
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a =5;
        int b =9;
        int c;
        c =logic(a , b);
       // chapter_7_java_methods obj = new chapter_7_java_methods();
        // c =obj.logic(a , b);
        int a1 =8;
        int b1 =6;
        int c1 =logic(a1,b1);
        // chapter_7_java_methods obj = new chapter_7_java_methods();
        // c1 =obj.logic(a1 , b1);
        System.out.println(c);
        System.out.println(c1);

    }

}
