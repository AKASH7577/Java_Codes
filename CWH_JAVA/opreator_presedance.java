public class opreator_presedance {
    public static void main(String [] args) {

        int a =6*5-34/2;
        /*
        =30-34/2
        =30-17
        =13
       */
        int b= 6/5-34*2;
        /*

        '/'&& '*' ki assositivity left to right evalute hoti hai
        =12-34*2
        =30-34/2
        =30-17
        =13
       */
        System.out.println(a);
        System.out.println(b);
        int c = 0;
        int d = 4;
        int e = c*d-(4*c*d)/(2*a);
        System.out.println(e);


    }
}
