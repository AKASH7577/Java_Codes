public class v34_recurtion {
//    public static void main(String[] args) {
        //factorial(0) =  1
        //fatorial(n) = n*n-1 *....1
        //fatorial(5) = 5*4*3*2*1 =120
        //factorial(n) = n* fatiorial(n-1)

        static int factorial(int n){
            if(n==0 || n==1){
                return 1;
            }
            else{
                int product  = 1;
                for (int i =1; i<=n; i++){
                    product *=i;

                }

            return product ;
        }}
        public static void main(String[] args) {

            int x =4;
            System.out.println("the value of factorial x is " + factorial(x));
//            System.out.println("the value of factorial x is " + factorial_iterative(x));
    }
}
