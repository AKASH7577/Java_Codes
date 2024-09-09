public class V35_praticeset {
    static void multiplication(int n){
        for (int i=1; i<=10; i++){
            //format specifiers 
            System.out.format("%d X %d \n" , n, i, n*i );
        }
    }
    public static void main(String[] args){
        //problem 1
        multiplication(7);
    }

    
}
