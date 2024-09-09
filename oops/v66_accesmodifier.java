package oops;

class C1{
    public int x= 5;
    private int y= 45;
    int z= 8;
    protected int a = 7;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class v66_accesmodifier {
    public static void main(String[] args){
        C1 c = new C1();
//        c.meth1();
        System.out.println(c.x);
//        System.out.println(c.y);//private does not access
        System.out.println(c.z);
        System.out.println(c.a);

    }
}
