public class v33_varargs {

//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    } static int sum(int a,int b,int c,int d){
//        return a+b+c+d;
//    }

    static int  sum(int  ...arr) { //one parametor is complasory then  static int  sum(int x,int  ...arr
        //avalable as int[] arr;
//        int result =x;
        int result =0;
        for (int a : arr) {
        result += a;
    }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome to varrarg totorial");
        System.out.println("the sum of a,b is" + sum(1,5));
        System.out.println("the sum of a,b ,c is" + sum(1,5,9));
        System.out.println("the sum of a,b ,d is" + sum(1,5,4,7));



    }
}
